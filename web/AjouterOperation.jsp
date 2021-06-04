
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
 <%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css" />  
        <title>JSP Page</title>
    </head>
    <body>
       
         <div class="titre">    <bean:message key="ajouterOperation"></bean:message></div><h1/>
        
         <html:form action="/ajouteroperation">
            
             <table border="2" style=" text-align: center;">
                
                <tr><th>numero d'operation </th><th><html:text property="numOperation" name="Form5"/></th><th style="width: 150;"><html:errors property="code" /></th></tr>      
                <tr><th> numero de compte </th><th><html:text property="numCompte" name="Form5"/></th><th style="width: 150;"><html:errors property="age" /></th></tr>      
                
                 <tr><th> Montant </th><th><html:text property="montantMv" name="Form5"/></th><th style="width: 150;"><html:errors property="adresseClient" /></th></tr>        
                 <tr><th> type d'operation </th><th><html:text property="mouvement" name="Form5"/></th><th style="width: 150;"><html:errors property="adresseClient" /></th></tr>        
                
                
                
                
            </table>
       
                <html:submit value="envoyer" style=" text-align: center; "></html:submit>
            
         </html:form>       
    </body>
</html>
