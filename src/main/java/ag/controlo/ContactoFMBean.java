/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ag.controlo;

import ag.modelo.Contacto;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author manuelpambasagejorge
 */
@Named(value = "contactoFMBean")
@RequestScoped
public class ContactoFMBean {
    
    Contacto contacto = new Contacto();

    @PostConstruct
    public void init () {
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
    
    
    public String guardar () {
        return "adicionado";
    }
    
   
    
}
