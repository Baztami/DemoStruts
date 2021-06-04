/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author bazta
 */
public class Form1 extends org.apache.struts.action.DynaActionForm {
  
    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        
        if(this.get("codeCLient").toString()==null || this.get("codeCLient").toString().trim().length()==0){
            errors.add("code",new ActionMessage("erreur.code"));
        
        
        }
        
         if(this.get("nomClient").toString()==null || this.get("nomClient").toString().trim().length()==0 ){
            errors.add("age",new ActionMessage("erreur.age"));
        
        
        }
 if(this.get("adresseClient").toString()==null || this.get("adresseClient").toString().trim().length()==0 ){
            errors.add("adresseClient",new ActionMessage("erreur.adresseclient"));
        
        
        }   
    
        return errors;
    }
}
