/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Form2;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.sql.Connection;
import java.sql.Timestamp;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author bazta
 */
public class AjouterCompte extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success3";

     Connection cnx;
    PreparedStatement pst;
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        Form2 frm=(Form2) form;
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion","root","root");
        pst=cnx.prepareStatement("insert into Compte values (?,?,?,?)");
        pst.setInt(1, (Integer) frm.get("numCompte"));
        pst.setString(2,  (String) frm.get("codeCLient").toString());
        java.util.Date date=new java.util.Date();                                               
       pst.setTimestamp(3,new java.sql.Timestamp(date.getTime()));  
                     
        pst.setDouble(4, (double) frm.get("solde"));
        
        
        pst.executeUpdate();
        
        return mapping.findForward(SUCCESS);
    }
}
