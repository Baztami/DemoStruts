/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Form1;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import java.sql.*;

/**
 *
 * @author bazta
 */
public class ActionAJoutAdherent extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    
    
    Connection cnx;
    PreparedStatement pst;
    
    
    
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        Form1 frm=(Form1)form;
        
        
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion","root","root");
        pst=cnx.prepareStatement("insert into Client values (?,?,?)");
        pst.setString(1, (String) frm.get("codeCLient").toString());
        pst.setString(2,(String) frm.get("nomClient").toString());
         pst.setString(3,(String) frm.get("adresseClient").toString());
        pst.executeUpdate();
        return mapping.findForward(SUCCESS);
    }
}
