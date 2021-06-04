<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>


<link rel="stylesheet" href="style.css" />


<div class="container">
    
    <ul>
        <li><html:link href="AjoutAdherent.jsp">Ajouter Un Client </html:link></li>
<li><html:link href="listeAdher.do">Liste des Clients  </html:link></li>
<li><html:link href="/AjouterCompte.jsp">Ajouter Un Compte </html:link></li>
<li><html:link href="/ChercherCompte.jsp">Consulter Un Compte </html:link></li>
<li><html:link href="/ChercherClient.jsp">Consulter Un Client</html:link></li>
<li><html:link href="/AjouterOperation.jsp">Ajouter Une Operation</html:link></li>
<li><html:link href="/ListeOperation.jsp">Liste des operations </html:link></li>
</ul>
</div>



