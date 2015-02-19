/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ordini.action;

import entity.Ordine;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ordini.action_form.ModOrdineAF;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import service.CGestioneOrdini;
import utility.Data;

/**
 *
 * @author Enrico
 */
public class ModificaOrdineA extends Action {
    
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm,
                            HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws Exception
    {
        ModOrdineAF modOrdineAF = (ModOrdineAF) actionForm;
        CGestioneOrdini cGestOrdini = (CGestioneOrdini)servletRequest.getSession().getAttribute("cGestOrdini");
       
        Ordine ordine = modOrdineAF.getOrdine();
//        Data dataSpedizione = modOrdineAF.getData();
        String indirizzo = modOrdineAF.getIndirizzo();
//        cGestOrdini.modificaDataOrdine(ordine, dataSpedizione);
        cGestOrdini.modificaIndirizzoOrdine(ordine, indirizzo);
        
        return actionMapping.findForward("next");
        
    }
    
}
