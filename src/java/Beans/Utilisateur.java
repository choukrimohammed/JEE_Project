package Beans;
// Generated 28-Dec-2022 08:36:58 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Utilisateur generated by hbm2java
 */
@Entity
@Table(name="utilisateur"
    ,catalog="livredor"
)
public class Utilisateur  implements java.io.Serializable {


     private String pseudo;
     private String nom;
     private String prenom;
     private String motDePasse;

    public Utilisateur() {
    }

    public Utilisateur(String pseudo, String nom, String prenom, String motDePasse) {
       this.pseudo = pseudo;
       this.nom = nom;
       this.prenom = prenom;
       this.motDePasse = motDePasse;
    }
   
     @Id 

    
    @Column(name="Pseudo", unique=true, nullable=false, length=45)
    public String getPseudo() {
        return this.pseudo;
    }
    
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    
    @Column(name="Nom", nullable=false, length=45)
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    
    @Column(name="Prenom", nullable=false, length=45)
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    
    @Column(name="MotDePasse", nullable=false, length=45)
    public String getMotDePasse() {
        return this.motDePasse;
    }
    
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }




}


