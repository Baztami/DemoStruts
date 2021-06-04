/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Collection;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author bazta
 */
public class Compte implements Serializable{
    
    
    private int numCompte   ;
    private String codeCLient;
    @JoinColumn(name = "codeclient", referencedColumnName = "client")
    @ManyToOne
    private Client client;
    @OneToMany(mappedBy="compte")
    private Collection<Operation> operations;

    public Compte(Collection<Operation> operations) {
        this.operations = operations;
    }

    public Collection<Operation> getOperations() {
        return operations;
    }

    public void setOperations(Collection<Operation> operations) {
        this.operations = operations;
    }

    public Compte(int numCompte, String codeCLient, double solde) {
        this.numCompte = numCompte;
        this.codeCLient = codeCLient;
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Compte(Timestamp DateCreation, double solde) {
        this.dateCreation = (Timestamp) DateCreation;
        this.solde = solde;
    }
    private Timestamp dateCreation;
    private double solde;
      public Compte( ) {
          
          super();
         
    }

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int NumCompte) {
        this.numCompte = NumCompte;
    }

    public String getCodeCLient() {
        return codeCLient;
    }

    public void setCodeCLient(String codeCLient) {
        this.codeCLient = codeCLient;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Timestamp DateCreation) {
        this.dateCreation = DateCreation;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    
}
