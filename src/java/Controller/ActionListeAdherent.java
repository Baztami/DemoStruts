 
package Controller;

import Metier.Client;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author bazta
 */
public class ActionListeAdherent extends org.apache.struts.action.Action {
    Connection cnx;
    Statement st;
    ResultSet rs;
    

    /* forward name="success" path="" */
    private static final String SUCCESS = "success1";

  
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        List<Client> L;
        L = new ArrayList<Client>();
           
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion","root","root");
        st=cnx.createStatement();
        rs=st.executeQuery("select * from Client ;");
        while(rs.next()){
        
        L.add(new Client(rs.getString(1),rs.getString(2),rs.getString(3)));                                             
        
        
        }
        
        request.setAttribute("liste",L);
        return mapping.findForward(SUCCESS);
    }
}
