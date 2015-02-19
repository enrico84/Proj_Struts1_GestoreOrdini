<%-- 
    Document   : ModProdotto
    Created on : 30-set-2014, 15.09.37
    Author     : Enrico
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<html:html>
    <head><title><bean:message key="title.dettaglio.prodotto"/></title></head>
    <body>
    <center>
        <h1><bean:message key="title.dettaglio.prodotto"/></h1>
        
        <html:form action="/modificaProdotto" method="POST">
            <font color='blueviolet'>
               (Modificare il costo e la disponibilità del Prodotto <u>DIRETTAMENTE E SOLO</u> da questa pagina)
            </font>
            <p>
            <table>
               <tr>
                   <td><bean:message key="label.codice" />: </td>
                   <td><html:text property="codice" readonly="true" /></td> 
               </tr>
               <tr>
                   <td><bean:message key="label.costo.unitario" />:</td>
                   <td><html:text property="costoUnitario" /></td>
                   <td style="color:red;"><html:errors property="costoUnitario" /></td>
               </tr>
               <tr>
                   <td><bean:message key="label.descrizione" />:</td>
                   <td><html:text property="descrizione" readonly="true"/></td>
                  
               </tr>
               <tr>
                   <td><bean:message key="label.unita.di.misura" />:</td>
                   <td><html:text property="unitaMisura" readonly="true"/></td>
               </tr>
               <tr>
                   <td><bean:message key="label.disponibilita" />:</td>
                   <td><html:text property="disponibilita" /></td>
                   <td style="color:red;"><html:errors property="disponibilita" /></td>
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
                   <td><html:link action="/gestisciProdotti.do" >
                   <bean:message key="link.elenco.prodotti"/>
                   </html:link></td>
                   
                   <td align="center"><html:link action="/eliminaProdotto" >
                         <bean:message key="link.elimina" /> 
                   </html:link></td>
               </tr>
           </table>
        </html:form>
    </center>
    </body>
</html:html>