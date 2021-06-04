<%@page contentType="text/html"%>
    

    
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
 

<html:html  >
    
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css" />
        
        <html:base/>
    </head>
    <body>
        
         <div class="titre">    <bean:message key="ajouterCompte"></bean:message></div> <h1/>
        <html:form action="/ajoutercompte">
            
            <table border="2" style=" text-align: center;">
                
                <tr><th>N° de Compte </th><th><html:text property="numCompte" name="Form2"/></th><th style="width: 150;"><html:errors property="code" /></th></tr>      
                <tr><th> code client </th><th><html:text property="codeCLient" name="Form2"/></th><th style="width: 150;"><html:errors property="age" /></th></tr>      
                <tr><th> Solde </th><th><html:text property="solde" name="Form2"/></th><th style="width: 150;"><html:errors property="adresseClient" /></th></tr>      
                
                
                
                
            </table>
       
                <html:submit value="envoyer" style=" text-align: center;"></html:submit>
            
            
            
        </html:form>
        <h1> <bean:message key="welcome.title"/></h1>
        
    </body>
</html:html>
