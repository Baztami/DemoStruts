/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Metier.Client;
import Metier.Operation;
import Model.Form6;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
public class ActionChercherOperation extends org.apache.struts.action.Action {

    Connection cnx;
    PreparedStatement st;
    ResultSet rs;
    /* forward name="success" path="" */
    private static final String SUCCESS = "success7";
         
        ArrayList<Operation> l = new ArrayList<Operation>();
        
        

  
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        Form6 frm=(Form6) form;
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion","root","root");
        st=cnx.prepareStatement("select * from Operation where numcompte=?;");
        st.setInt(1,(Integer)frm.get("numCompte"));
        rs=st.executeQuery();
        while(rs.next()){
        
        l.add(new Operation(rs.getInt(1),rs.getInt(2),rs.getDouble(4),rs.getString(5)));                                             
        
        
        }
        
        request.setAttribute("listeee",l);
        
        return mapping.findForward(SUCCESS);
    }
}
