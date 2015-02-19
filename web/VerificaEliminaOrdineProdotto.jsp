<%-- 
    Document   : VerificaEliminaOrdineProdotto
    Created on : 5-ott-2014, 18.08.10
    Author     : Enrico
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<html:html>
    <head><title>Verifica Eliminazione Prodotto</title></head>
    <body>
    <center>
        <h1>Sicuro che vuoi eliminare questo prodotto ordinato?</h1>
        <bean:define id="prodotto" name="prodottoOrdinato" />
        <html:form action="/confermaEliminaProdottoA">
            <table>
               <tr>
                    <td style="font-weight: bold"><bean:message key="label.descrizione"/></td>
                    <td><bean:write name="prodotto" property="prodotto.descrizione" /></td>
                </tr>
                <tr>
                    <td style="font-weight: bold"><bean:message key="label.quantita"/>:</td>
                    <td>
                        <bean:write name="prodotto" property="quantita" />
                    </td>
                </tr>
                <tr>
                    <td style="font-weight: bold"><bean:message key="label.costo.prodotto"/>:&nbsp;</td>
                    <td><bean:write name="prodotto" property="costoUnitario" /></td>
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
</html:html>
