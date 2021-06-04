/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Metier.Client;
import Metier.Compte;
import Model.Form3;
import Model.Form4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author bazta
 */
public class ActionChercherClient extends org.apache.struts.action.Action {

    
     Connection cnx;
    PreparedStatement st;
    ResultSet rs;
    /* forward name="success" path="" */
    private static final String SUCCESS = "success5";

  
    
    
    
    
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        
         Form4 frm=(Form4) form;
         
        
            
         List<Client> L=new ArrayList<Client>();
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion","root","root");
        st=cnx.prepareStatement("select * from client where codeclient= ?;");
        st.setString(1,frm.get("codeCLient").toString());
        rs=st.executeQuery();
        rs.next(); 
        
          L.add(new Client(rs.getString(1),rs.getString(2),rs.getString(3)));                                             
       request.setAttribute("listee",L);
        
        return mapping.findForward(SUCCESS);
    }
}
