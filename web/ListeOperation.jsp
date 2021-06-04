<%-- 
    Document   : ListeOperation
    Created on : 4 juin 2021, 16:35:01
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
        
        <html:form action="/chercheroperation">
        
        
         <tr><th>N° de Compte </th><th><html:text property="numCompte" name="Form6"/></th><th style="width: 150;"><html:errors property="code" /></th></tr>  <h1/>    
           <html:submit value="envoyer"></html:submit>
         </html:form>
     
    </body>
</html>
