<%-- 
    Document   : VClienti
    Created on : 26-set-2014, 14.38.07
    Author     : Enrico
--%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<html:html>
    <head><title><bean:message key="title.elenco.clienti"/></title></head>
    <body>
    <center>
        <h1><bean:message key="title.elenco.clienti"/></h1>
        <table>
            <tr>
                <th><bean:message key='<%= "label.nome" %>'/></th> <%-- Esempio con scriptlet--%>
                <th><bean:message key="${'label.cognome'}"/></th>  <%-- Esempio con EL --%>
            </tr>
            <logic:iterate id="cliente" indexId="i" name="clientiAF" property="clienti">
                    <tr>
                        <td>
                            <bean:write name="cliente" property="nome"/>
                        </td>
                        <td>
                            <bean:write name="cliente" property="cognome" />
                        </td>
                        <td>
                            <html:link action="/visualizzaDettaglioCliente" paramId="indiceCliente" paramName="i">
                                <bean:message key="link.dettagli" />
                            </html:link>
                        </td> 
                    </tr>
            </logic:iterate>
            <tr><td></td></tr>
            <tr>
                <td align="left">
                    <html:link action="/startInserisciCliente">
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