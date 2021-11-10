/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Jeremie
 */
public class Utilisateur {
    
     private int numero;
     private String nom;
     private String statut;

    public Utilisateur(int numero, String nom, String statut) {
        this.numero = numero;
        this.nom = nom;
        this.statut = statut;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
     
     
     
    
    
    
    
    
    
}
