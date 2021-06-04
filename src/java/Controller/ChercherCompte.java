/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Metier.Client;
import Metier.Compte;
import Model.Form2;
import Model.Form3;
 
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
public class ChercherCompte extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success4";

   Connection cnx;
    PreparedStatement st;
    ResultSet rs;
 
  
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
          Form3 frm=(Form3) form;
         
        
            
         List<Compte> L=new ArrayList<Compte>();
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion","root","root");
        st=cnx.prepareStatement("select numcompte,codeclient,solde from compte where numcompte= ?;");
        st.setInt(1,(Integer)frm.get("numCompte"));
        rs=st.executeQuery();
        rs.next(); 
        
          L.add(new Compte(rs.getInt(1),rs.getString(2),rs.getDouble(3)));                                             
       request.setAttribute("list",L);
       
        return mapping.findForward(SUCCESS);
    }
}
