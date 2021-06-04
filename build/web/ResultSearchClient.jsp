
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
        
        
         <logic:iterate id="cc" name="listee" type="Metier.Client">
            
            
            
            numero de compte : <bean:write name="cc" property="codeCLient"/><h1/>
            Nom du Client : <bean:write name="cc" property="nomClient"/><h1/>
            Adresse du client  : <bean:write name="cc" property="adresseClient"/><h1/>  z
            
        </logic:iterate>
    </body>
</html>
