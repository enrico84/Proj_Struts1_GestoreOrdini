<%-- 
    Document   : VOrdini
    Created on : 1-ott-2014, 9.18.08
    Author     : Enrico
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<html:html>
    <head><title><bean:message key="title.elenco.ordini"/></title></head>
    <body>
    <center>
        <h1><bean:message key="title.elenco.ordini" /></h1>
        <table border="2" cellpadding="4">
            <tr>
            <th><bean:message key="label.numero.ordine" /></th>
            <th><bean:message key="label.cliente" /></th>
            <th><bean:message key="lable.dettagli" /></th>
            </tr>
            <logic:iterate id="ordine" indexId="i" name="ordiniAF" property="ordini">
                <tr>
                    <td><bean:write name="ordine" property="numeroOrdine"/></td>
                    <td>
                        <bean:define id="cliente" name="ordine" property="cliente"/>
                        <bean:write name="cliente" property="nome" />
                        <bean:write name="cliente" property="cognome" />
                    </td>
                    <td>
                        <html:link action="/visualizzaDettaglioOrdine" paramId="indiceOrdine" paramName="i">
                             <bean:message key="link.dettagli" />
                         </html:link>
                    </td>
                </tr>
            </logic:iterate>
        </table>
        <br>
        <table>
            <tr>
                <td align="left">
                    <html:link action="/startInserimentoOrdine">
                         <bean:message key="link.inserisci" />
                    </html:link>
                </td>
                <td></td>
                <td align="left">
                    <html:link action="/homepage">
                        <bean:message key="link.home" />
                    </html:link>
                </td>
            </tr>
        </table>
    </center>
    </body>
</html:html>
