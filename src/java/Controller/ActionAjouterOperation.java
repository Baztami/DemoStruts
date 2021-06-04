/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
 
import Model.Form5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author bazta
 */
public class ActionAjouterOperation extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success6";
    
     Connection cnx;
    PreparedStatement pst;

 
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        
         Form5 frm=(Form5) form;
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion","root","root");
        pst=cnx.prepareStatement("insert into operation values (?,?,?,?,?)");
        pst.setInt(1, (Integer) frm.get("numOperation"));
        pst.setInt(2,  (Integer) frm.get("numCompte"));
        java.util.Date date=new java.util.Date();
       
         pst.setTimestamp(3,new java.sql.Timestamp(date.getTime()));                
        pst.setDouble(4, (double) frm.get("montantMv"));
        pst.setString(5,(String) frm.get("mouvement"));
        
        
        pst.executeUpdate();
        
        
        return mapping.findForward(SUCCESS);
    }
}
