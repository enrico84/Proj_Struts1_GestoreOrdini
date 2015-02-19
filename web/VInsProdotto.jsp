<%-- 
    Document   : VInsProdotto
    Created on : 30-set-2014, 11.57.14
    Author     : Enrico
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<html:html>
    <head><title><bean:message key="title.inserimento.prodotti" /></title></head>
    <body>
    <center>
         <h1><bean:message key="title.inserimento.prodotti" /></h1>
         
          <html:form action='/inserisciProdotto' method="POST">
           <font color='blueviolet'>I campi con * sono obbligatori</font>
           <p>
           <table>
               <tr>
                   <td><bean:message key="label.codice" />*: </td>
                   <td><html:text property="codice" /></td> 
                   <td style="color: red;"> <html:errors property="codice" /></td>
               </tr>
               <tr>
                   <td><bean:message key="label.costo.unitario" />*:</td>
                   <td><html:text property="costoUnitario" /></td>
                   <td style="color:red;"><html:errors property="costoUnitario" /></td>
               </tr>
               <tr>
                   <td><bean:message key="label.descrizione" />*:</td>
                   <td><html:text property="descrizione" /></td>
                   <td style="color:red;"><html:errors property="descrizione" /></td>
               </tr>
               <tr>
                   <td><bean:message key="label.unita.di.misura" />*:</td>
                   <td><html:text property="unitaMisura" /></td>
                   <td style="color:red;"><html:errors property="unitaMisura" /></td>
               </tr>
               <tr>
                   <td><bean:message key="label.disponibilita" />*:</td>
                   <td><html:text property="disponibilita" /></td>
                   <td style="color:red;"><html:errors property="disponibilita" /></td>
               </tr>
               <tr><td></td></tr>
               <tr>
                   <td><html:submit>
                   <bean:message key="submit.inserisci" />
                   </html:submit></td>
              
                   <td align="center"><html:reset>
                   <bean:message key="reset.annulla" />
                   </html:reset></td>
               
                   <td><html:link action="/gestisciProdotti.do" >
                   <bean:message key="link.elenco.prodotti"/>
                   </html:link></td>
               </tr>
           </table>
        </html:form> 
     </center>
    </body>
</html:html>