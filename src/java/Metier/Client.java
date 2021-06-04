/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author bazta
 */
@Entity


public class Client  implements Serializable{
    @Id @GeneratedValue
    private String codeCLient;

   
    private String nomClient;
    
    
    
    
    
     public String getNomClient() {
            return nomClient;
    }
    
    
     

    public void setNomClient(String NomClient) {
        this.nomClient = NomClient;
    }

    public String getAdresseClient() {
        return adresseClient;
    }

    public void setAdresseClient(String adresseClient) {
        this.adresseClient = adresseClient;
    }

    public Client(String codeCLient, String NomClient, String adresseClient, Collection<Compte> comptes) {
        this.codeCLient = codeCLient;
        this.nomClient = NomClient;
        this.adresseClient = adresseClient;
        this.comptes = comptes;
    }
    private String adresseClient; 
    @OneToMany(mappedBy="client")
    private Collection<Compte> comptes;
    
    public Client(){}

    public Collection<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(Collection<Compte> comptes) {
        this.comptes = comptes;
    }

    public Client(String NomClient, String adresseClient) {
        this.nomClient = NomClient;
        this.adresseClient = adresseClient;
    }

    public String getCodeCLient() {
        return codeCLient;
    }

    public void setCodeCLient(String codeCLient) {
        this.codeCLient = codeCLient;
    }

    public Client(String codeCLient, String NomClient, String adresseClient) {
        this.codeCLient = codeCLient;
        this.nomClient = NomClient;
        this.adresseClient = adresseClient;
    }

    /**
     *
     * @return
     */
    
    
            
      
    

  
    
}
