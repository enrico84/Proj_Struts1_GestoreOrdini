<%-- 
    Document   : VInsProdottoOrdinato
    Created on : 4-ott-2014, 19.00.19
    Author     : Enrico
--%>

<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html:html>
    <head>
        <title>
            <bean:message key="title.inserimento.prodotto.ordine"/>
        </title>
    </head>
    <body>
    <center>
        <h1><font color='blue'><bean:message key="title.inserimento.prodotto.ordine"/></font></h1>
        <bean:define id="cliente" name="ordine" property="cliente"/>
        <h2>Inserimento nell'ordine di <bean:write name="cliente" property="nome" />
            <bean:write name="cliente" property="cognome" /></h2> 
        
        <html:form action="/aggiungiProdotto">
            <table>
                <tr>
                  <th><bean:message key="title.elenco.prodotti" /></th>
                 <th>                   
                       <html:select property="indProdottoOrdinato"> 
                        <logic:iterate id="prodotto" indexId="i" name="insProdottoOrdineAF" property="prodotti">
                        <html:option value="${i}">
                                <bean:write name="prodotto" property="descrizione" />,
                                <bean:write name="prodotto" property="unitaMisura" /> ---&nbsp;disponibilità:&nbsp
                                <bean:write name="prodotto" property="disponibilita" />
                                </html:option>
                        </logic:iterate> 
                        </html:select>
                    </th>
                    <%-- <td style="color:red;"><html:errors property="indProdottoOrdinato" /></td> --%>
                </tr>
                <tr><td></td></tr>
                <tr>
                    <th><bean:message key="label.costo.prodotto"/>&nbsp;(€):</th>
                    <td><html:text property="costoUnitario" /></td>
                    <td style="color:red;"><html:errors property="costoUnitario" /></td>
                </tr>
                <tr><td></td></tr>
                <tr>
                    <th><bean:message key="label.quantita"/>:</th>
                    <td><html:text property="quantita" /></td>
                    <td style="color:red;"><html:errors property="quantita" /></td>
                </tr>
                <tr><td></td></tr>
                <tr><td></td></tr>
                <tr>
                   <td><html:submit>
                   <bean:message key="submit.inserisci" />
                   </html:submit></td>
              
                   <td align="center"><html:reset>
                   <bean:message key="reset.annulla" />
                   </html:reset></td>
               
                   <td><html:link action="/gestisciOrdini.do" >
                   <bean:message key="link.elenco.ordini"/>
                   </html:link></td>
               </tr>
            </table>
        </html:form>
        <p>
            <font color="red"><html:errors property="esistente"/></font>
    </center>
    </body>
</html:html>
