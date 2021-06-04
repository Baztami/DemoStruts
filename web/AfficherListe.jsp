    <%-- 
    Document   : AfficherListe
    Created on : 4 juin 2021, 16:48:08
    Author     : bazta
--%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
 <%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
 
 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
         <table  border="2" style=" margin-left: auto;
  margin-right: auto;">
                
             <tr><th>numero d'operation</th><th>numero de compte</th><th>Montant du mouvement</th><th>type de mouvement</th></tr>
            
        <logic:iterate id="bb" name="listeee" type="Metier.Operation">
            
            
            
            <tr><th><bean:write name="bb" property="numOperation"/></th><th><bean:write name="bb" property="numCompte"/></th><th><bean:write name="bb" property="montantMv"/></th><th><bean:write name="bb" property="mouvement"/></th></tr>
            
        </logic:iterate>
                
            </table>
       
    </body>
</html>
