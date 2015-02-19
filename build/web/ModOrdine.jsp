<%-- 
    Document   : ModOrdine
    Created on : 2-ott-2014, 9.28.20
    Author     : Enrico
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<html:html>
    <head><title><bean:message key="title.dettaglio.ordine"/></title></head>
    <body>
    <center> 
        <h1><bean:message key="title.dettaglio.ordine" /></h1>
        
        <html:form action="/modificaOrdine" method="GET">
            <font color='blueviolet'>
               (Modificare l'indirizzo dell'Ordine <u>DIRETTAMENTE E SOLO</u> da questa pagina)
            </font>
            <p>
            <b><bean:message key="label.numero.ordine" />:</b>&nbsp;
            <html:text property="numeroOrdine" readonly="true"/>
            <p>   
            <b><bean:message key="label.data" /></b>
            <br>
            <bean:message key="label.anno"/>:&nbsp;
            <html:text property="anno" readonly="true"/>&nbsp;
            <%-- <font color="red"><html:errors property="anno" /></font> --%>
            <br>
            <bean:message key="label.mese"/>:&nbsp;
            <html:text property="mese" readonly="true"/>&nbsp;
            <%-- <font color="red"><html:errors property="mese" /></font> --%>
            <br>
            <bean:message key="label.giorno"/>:&nbsp;
            <html:text property="giorno" readonly="true"/>&nbsp;
           <%-- <font color="red"><html:errors property="giorno" /></font> --%>
            <p>
            <b><bean:message key="label.indirizzo" />:</b><br>
            <html:text property="indirizzo" />&nbsp;
            <font color="red"><html:errors property="indirizzo" /></font>
            <p>
            <b><bean:message key="label.cliente" /></b>
            <br>
            <bean:message key="label.nome" />:&nbsp;
            <html:text property="nome" readonly="true" />
            <br>
            <bean:message key="label.cognome" />:&nbsp;
            <html:text property="cognome" readonly="true" />
            <p>
            <table>
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
                   <td><html:link action="/gestisciOrdini.do" >
                   <bean:message key="link.elenco.ordini"/>
                   </html:link></td>
                   
                   <td align="center"><html:link action="/eliminaOrdine" >
                         <bean:message key="link.elimina" /> 
                   </html:link></td>
               </tr>        
            </table>
        </html:form>
        <br><br>
       
         <font color='blue'><h3>Prodotti Ordinati</h3></font>
          <html:link action="/startAggiungiProdottoA">
                 <bean:message key="link.inserisci.prodotto"/>
        </html:link>
        <p>
           <table width='300' border='2' cellpadding='5' cellspacing='0' bordercolor='blue'>
           <tr>
                <th style='font-weight:bold;'>Descrizione</th><th style='font-weight:bold;'>Quantità ordinata</th>
                <th>Costo del prodotto</th><th>Modifica</th><th>Elimina</th>
           </tr>
           <logic:iterate id="prodottoOrdinato" indexId="i" name="modOrdineAF" property="prodottiOrdinati" >
                <tr>
                    <td>
                    <%--  <input type='hidden' name="indProdottoOrdinato" value="${i}" /> --%>
                      <bean:define id="prodotto" name="prodottoOrdinato" property="prodotto"/> 
                      <%-- ${prodottoOrdinato.prodotto.descrizione}  --%>       
                      <bean:write name="prodotto" property="descrizione" /> 
                    </td>
                    <td>
                        <%-- ${prodottoOrdinato.quantita} EL --%>
                        <bean:write name="prodottoOrdinato" property="quantita" />
                        
                    </td>
                    <td>
                        <%-- ${prodottoOrdinato.costoUnitario} EL --%>
                        <bean:write name="prodottoOrdinato" property="costoUnitario" />
                    </td>
                    
                    <td>
                        <html:link action="/modificaProdottoOrdinatoA" paramId="indProdottoOrdinato" paramName="i">
                            <bean:message key="submit.modifica"/>
                        </html:link>
                    </td>
                    <td>
                         <html:link action="/eliminaProdottoOrdinatoA" paramId="indProdottoOrdinato" paramName="i">
                            <bean:message key="link.elimina"/>
                        </html:link>
                    </td>           
                </tr>
           </logic:iterate>
           </table>
           <br><br>
    </center>
    </body>
</html:html>