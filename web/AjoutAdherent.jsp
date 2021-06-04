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
        <div class="titre">    <bean:message key="ajouterClient"></bean:message></div><h1/>
        <div class="containe">
        <html:form action="/ajoutadherent">
            
            <table border="2">
                
                <tr><th>Code Client </th><th><html:text property="codeCLient" name="Form1"/></th><th style="width: 150;"><html:errors property="code" /></th></tr>      
                <tr><th> Nom du Client </th><th><html:text property="nomClient" name="Form1"/></th><th style="width: 150;"><html:errors property="age" /></th></tr>      
                <tr><th> Adresse du Client </th><th><html:text property="adresseClient" name="Form1"/></th><th style="width: 150;"><html:errors property="adresseClient" /></th></tr>      
                
                
                <td><td><input type="submit" value="Register!" /></td><td></td>
                
            </table>
              
            
            
                
        </html:form>
            </div>  
        
        
    </body>
</html:html>
