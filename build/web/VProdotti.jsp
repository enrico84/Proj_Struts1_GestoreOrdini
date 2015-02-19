<%-- 
    Document   : VProdotti
    Created on : 29-set-2014, 17.39.43
    Author     : Enrico
--%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html:html>
    <head><title><bean:message key="title.elenco.prodotti"/></title></head>
    <body>
    <center>
        <h1><bean:message key="title.elenco.prodotti"/></h1>
        <table>
            <tr>
                <th><bean:message key='<%= "label.codice" %>'/></th> <%-- Esempio con scriptlet--%>
                <th><bean:message key="${'label.descrizione'}"/></th>  <%-- Esempio con EL --%>
            </tr>
            <logic:iterate id="prodotto" indexId="i" name="prodottiAF" property="prodotti">
                    <tr>
                        <td>
                            <bean:write name="prodotto" property="codice"/>
                        </td>
                        <td>
                            <bean:write name="prodotto" property="descrizione" />
                        </td>
                        <td>
                            <html:link action="/visualizzaDettaglioProdotto" paramId="indiceProdotto" paramName="i">
                                <bean:message key="link.dettagli" />
                            </html:link>
                        </td> 
                    </tr>
            </logic:iterate>
            <tr><td></td></tr>
            <tr>
                <td align="left">
                    <html:link action="/startInserisciProdotto">
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