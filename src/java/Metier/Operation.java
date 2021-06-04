/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author bazta
 */
public class Operation implements Serializable {
    
      private int numOperation;

    public int getNumOperation() {
        return numOperation;
    }

    public void setNumOperation(int NumOperation) {
        this.numOperation = NumOperation;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int NumCompte) {
        this.numCompte = NumCompte;
    }

    public Date getDateOperation() {
        return DateOperation;
    }

    public void setDateOperation(Timestamp DateOperation) {
        this.DateOperation = DateOperation;
    }

    public double getMontantMv() {
        return montantMv;
    }

    public void setMontantMv(double montantMv) {
        this.montantMv = montantMv;
    }

    public String getMouvement() {
        return mouvement;
    }

    public void setMouvement(String mouvement) {
        this.mouvement = mouvement;
    }

    public Operation(Timestamp DateOperation, double montantMv, String mouvement) {
        this.DateOperation = (Timestamp) DateOperation;
        this.montantMv = montantMv;
        this.mouvement = mouvement;
    }
      private int numCompte;
      private Timestamp DateOperation;
      private double montantMv;
        private String mouvement;

    public Operation(int NumOperation, int numCompte, double montantMv, String mouvement) {
        this.numOperation = NumOperation;
        this.numCompte = numCompte;
        this.montantMv = montantMv;
        this.mouvement = mouvement;
    }
      
          @ManyToOne
          @JoinColumn(name = "numcompte", referencedColumnName = "client")

      private Compte compte;

    public Operation(int NumOperation, int NumCompte, Timestamp DateOperation, double montantMv, String mouvement) {
        this.numOperation = NumOperation;
        this.numCompte = NumCompte;
        this.DateOperation = DateOperation;
        this.montantMv = montantMv;
        this.mouvement = mouvement;
    }
      
      
    
}
