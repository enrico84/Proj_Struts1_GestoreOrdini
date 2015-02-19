<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<html:html lang="true">
    <head>
        <title>Gestione ordini: HomePage</title>
    </head>
    <body style="background-color: white">
    <center>
    <table border='1' cellpadding='5' cellspacing='0' width='400'>
        <tr bgcolor='#CCCCFF' align='center' valign='center' >
             <td><h3>GESTORE ORDINI HOME</h3></td>
        </tr>
     </table><br>
            
        <html:form action='/gestisciClienti' method="GET" >
            <html:submit>Visualizza elenco clienti</html:submit> 
        </html:form>
        <br>
         <%--<html:button property="tipo" value="listaClienti" /> --%>
        
         <html:form action='/gestisciProdotti' method="GET" >
             <html:submit>Visualizza Elenco prodotti</html:submit>
         </html:form>
         <br>
     
        <html:form action='/gestisciOrdini' method="GET">
            <html:submit value="Visualizza Ordini"/>
        </html:form>

    </center>
    </body>
</html:html>
