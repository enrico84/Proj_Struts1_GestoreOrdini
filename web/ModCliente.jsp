<%-- 
    Document   : ModCliente
    Created on : 29-set-2014, 12.09.40
    Author     : Enrico
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<html:html>
    <head><title><bean:message key="title.dettaglio.cliente"/></title></head>
    <body>
    <center>
        <h1><bean:message key="title.dettaglio.cliente"/></h1>
        
        <html:form action="/modificaCliente" method="POST">
             <font color='blueviolet'>
               (Modificare l'email o l'indirizzo di spedizione del Cliente <u>DIRETTAMENTE E SOLO</u> da questa pagina)
             </font>
             <p>
            <table>
               <tr>
                   <td><bean:message key="label.cf" />: </td>
                   <td><html:text property="cf" readonly="true"/></td> 
               </tr>
               <tr>
                   <td><bean:message key="label.nome" />:</td>
                   <td><html:text property="nome" readonly="true"/></td>
               </tr>
               <tr>
                   <td><bean:message key="label.cognome" />:</td>
                   <td><html:text property="cognome" readonly="true"/></td>
               </tr>
               <tr>
                   <td><bean:message key="label.email" />:</td>
                   <td><html:text property="email" /></td>
               </tr>
               <tr>
                   <td><bean:message key="label.indirizzo" />:</td>
                   <td><html:text property="indirizzo" /></td>
               </tr>
               <tr><td></td></tr>
               <tr>
                   <td><html:submit>
                        <bean:message key="submit.modifica" />
                   </html:submit></td>
              
                   <td align="center"><html:reset>
                        <bean:message key="reset.annulla" />
                   </html:reset></td>
               </tr>
               <tr><td></td></tr>
               <tr>
                   <td><html:link action="/gestisciClienti.do" >
                         <bean:message key="link.elenco.clienti"/>
                   </html:link></td>
                   <td align="center"><html:link action="/eliminaCliente" >
                         <bean:message key="link.elimina" />
                   </html:link></td>
               </tr>
           </table>
        </html:form>
    </center>
    </body>
</html:html>
