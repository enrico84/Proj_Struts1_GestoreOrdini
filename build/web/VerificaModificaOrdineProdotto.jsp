<%-- 
    Document   : VerificaModificaOrdineprodotto
    Created on : 6-ott-2014, 17.47.39
    Author     : Enrico
--%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head><title>Conferma modifica</title></head>
    <body>
        <center>
            <h1>Modifica Prodotto ordinato</h1>
            <bean:define id="prodotto" name="prodottoOrdinato" />
            <html:form action="/confermaModificaProdottoA" method="GET">
                <table>
               <tr>
                    <td style="font-weight: bold"><bean:message key="label.descrizione"/></td>
                <td><bean:write name="prodotto" property="prodotto.descrizione" /></td>
                </tr>
                <tr>
                    <td style="font-weight: bold"><bean:message key="label.quantita"/>:</td>
                    <td><html:text name="prodotto" property="quantita" /></td>
                    <td style="color:red;"><html:errors property="quantitaNon" /></td>
                </tr>
                <tr>
                    <td style="font-weight: bold"><bean:message key="label.costo.prodotto"/>:&nbsp;</td>
                    <td><html:text name="prodotto" property="costoUnitario" /></td>
                    <td style="color:red;"><html:errors property="costoUnitario" /></td>
                </tr>
                <tr><td></td></tr>
                <tr><td></td></tr>
                <tr>
                   <td><html:submit>
                   <bean:message key="submit.conferma" />
                   </html:submit></td>
              
                   <td><html:link action="/gestisciOrdini.do" >
                   <bean:message key="link.elenco.ordini"/>
                   </html:link></td>
               </tr>
            </table>
                
            </html:form>
            
        </center>
    </body>
</html>
