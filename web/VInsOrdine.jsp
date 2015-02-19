<%-- 
    Document   : VInsOrdine
    Created on : 1-ott-2014, 12.55.27
    Author     : Enrico
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html:html>
    <head><title><bean:message key="title.inserimento.ordine" /></title></head>
    <body>
    <center>
        <font color='blue'><h1>Aggiungi Ordine</h1></font>
        <html:form action="/inserisciOrdine" method="GET">
           <font color='blueviolet'>I campi con * sono obbligatori</font>
           <p>
            <table cellspacing="2" cellpadding="2">
                <tr>
                    <td style='font-weight:bold;'><bean:message key="label.numero.ordine" />*:</td>
                    <td><html:text property="numeroOrdine"/></td>
                    <td style="color: red;"><html:errors property="numeroOrdine"/></td>
                </tr>
                <tr><td></td>
                    <td align='center' style='font-weight:bold;'><bean:message key="label.data" /></td>
                </tr>
                <tr>
                    <td><bean:message key="label.giorno" />*:</td>
                  <%--  <td><html:text property="giorno"/></td> --%>
                     <td>
                        <html:select property="giorno"> 
                            <html:option value='-1' >Seleziona un giorno...</html:option>
                            <html:option value='1'>1</html:option><html:option value='2'>2</html:option><html:option value='3'>3</html:option>   
                            <html:option value='4'>4</html:option><html:option value='5'>5</html:option><html:option value='6'>6</html:option>
                            <html:option value='7'>7</html:option><html:option value='8'>8</html:option><html:option value='9'>9</html:option>
                            <html:option value='10'>10</html:option><html:option value='11'>11</html:option><html:option value='12'>12</html:option>
                            <html:option value='13'>13</html:option><html:option value='14'>14</html:option><html:option value='15'>15</html:option>
                            <html:option value='16'>16</html:option><html:option value='17'>17</html:option><html:option value='18'>18</html:option>    
                            <html:option value='19'>19</html:option><html:option value='20'>20</html:option><html:option value='21'>21</html:option>
                            <html:option value='22'>22</html:option><html:option value='23'>23</html:option><html:option value='24'>24</html:option>
                            <html:option value='25'>25</html:option><html:option value='26'>26</html:option><html:option value='27'>27</html:option>    
                            <html:option value='28'>28</html:option><html:option value='29'>29</html:option><html:option value='30'>30</html:option>
                            <html:option value='31'>31</html:option>    
                        </html:select>
                    </td>  
                    <td style="color: red;"><html:errors property="giorno"/></td>
                </tr>
                <tr>
                    <td><bean:message key="label.mese" />*:</td>
                    <%--<td><html:text property="mese"/></td>>--%>
                      <td>
                         <html:select property="mese"> 
                            <html:option value='-1' >Seleziona un mese...</html:option>
                            <html:option value='1'>1</html:option><html:option value='2'>2</html:option><html:option value='3'>3</html:option>   
                            <html:option value='4'>4</html:option><html:option value='5'>5</html:option><html:option value='6'>6</html:option>
                            <html:option value='7'>7</html:option><html:option value='8'>8</html:option><html:option value='9'>9</html:option>
                            <html:option value='10'>10</html:option><html:option value='11'>11</html:option><html:option value='12'>12</html:option>
                        </html:select> 
                      </td>
                    <td style="color: red;"><html:errors property="mese"/></td>
                </tr>
                <tr>
                    <td><bean:message key="label.anno" />*:</td>
                    <td><html:text property="anno"/></td>
                    <td style="color: red;"><html:errors property="anno"/></td>
                </tr>
                <tr><td></td></tr>
                <tr>
                    <td style='font-weight: bold'><bean:message key="label.indirizzo" />*:</td>
                    <td><html:text property="indirizzo"/></td>
                    <td style="color: red;"><html:errors property="indirizzo"/></td>
                </tr>
                <tr><td></td></tr>
                <tr>  
                    <td style='font-weight:bold'><bean:message key="label.cliente" />*:</td>           
                    <td>
                        <html:select property="indCliente">
                            <%-- Qua il cliente lo recupera da InsModOrdine --%>
                          <html:option value="-1" >Seleziona un cliente...</html:option>
                          <logic:iterate id="cliente" indexId="i" name="insModOrdine" property="clienti">
                               <html:option value="${i}" >
                                    <bean:write name="cliente" property="nome"/>
                                    <bean:write name="cliente" property="cognome" />
                                </html:option>
                            </logic:iterate>
                        </html:select>
                    </td>
                   <td style="color: red;"><html:errors property="indCliente"/></td> 
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
               
                   <td><html:link action="/gestisciOrdini" >
                   <bean:message key="link.elenco.ordini"/>
                   </html:link></td>
                </tr>
            </table>
        </html:form> 
    </center>
    </body>
</html:html>