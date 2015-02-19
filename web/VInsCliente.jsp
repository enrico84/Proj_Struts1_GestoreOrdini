<%-- 
    Document   : VInsCliente
    Created on : 26-set-2014, 15.45.18
    Author     : Enrico
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<html:html>
    <head><title><bean:message key="title.inserimento.clienti"/> </title></head>
    <body>
    <center>
        <h1><bean:message key="title.inserimento.clienti" /></h1>
            
       <html:form action='/inserisciCliente' method="POST">
           <font color='blueviolet'>I campi con * sono obbligatori </font>
           <p>
           <table>
               <tr>
                   <td><bean:message key="label.cf" />*: </td>
                   <td><html:text property="cf" /></td> 
                   <td style="color: red;"> <html:errors property="cf" /></td>
               </tr>
               <tr>
                   <td><bean:message key="label.nome" />*:</td>
                   <td><html:text property="nome" /></td>
                   <td style="color: red;"><html:errors property="nome" /></td>
               </tr>
               <tr>
                   <td><bean:message key="label.cognome" />*:</td>
                   <td><html:text property="cognome" /></td>
                   <td style="color: red;"><html:errors property="cognome"/></td>
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
                   <bean:message key="submit.inserisci" />
                   </html:submit></td>
              
                   <td align="center"><html:reset>
                   <bean:message key="reset.annulla" />
                   </html:reset></td>
               
                   <td><html:link action="/gestisciClienti.do" >
                   <bean:message key="link.elenco.clienti"/>
                   </html:link></td>
               </tr>
           </table>
        </html:form>
    </center>
    </body>
</html:html>
