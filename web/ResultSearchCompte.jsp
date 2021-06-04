
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
       
         <logic:iterate id="record" name="list" type="Metier.Compte">
            
            
            
            numero de compte :<bean:write name="record" property="numCompte"/><h1/>
            code client : <bean:write name="record" property="codeCLient"/><h1/>
            solde :<bean:write name="record" property="solde"/></th></tr>
            
        </logic:iterate>
                
    </body>
</html>
