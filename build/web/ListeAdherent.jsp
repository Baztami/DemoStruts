<%@page contentType="text/html"%>
    

    
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
 <%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>

<html:html  >
    
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <html:link href="style.css"/>
        
        <html:base/>
    </head>
    <body>
        <div class="titre">    <bean:message key="msg"></bean:message></div>
    
        <table  border="2" style=" margin-left: auto;
  margin-right: auto;">
                
            <tr><th>code du Client</th><th>Nom du Client</th><th>Adresse du Client</th></tr>
            
        <logic:iterate id="Form1" name="liste" type="Metier.Client">
            
            
            
            <tr><th><bean:write name="Form1" property="codeCLient"/></th><th><bean:write name="Form1" property="nomClient"/></th><th><bean:write name="Form1" property="adresseClient"/></th></tr>
            
        </logic:iterate>
                
            </table>
        <html:link href="index.jsp">retourner a la page index.jsp</html:link>
        
    </body>
</html:html>
