package entities;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
    private String matricule;
    private String nomComplet;
    private String tuteur;
    private int id;
    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    List<Inscription>  inscriptions =new ArrayList<>();

    public Etudiant() {
    }
    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public String getTuteur() {
        return tuteur;
    }
    public void setTuteur(String tuteur) {
        this.tuteur = tuteur;
    }
    public List<Inscription> getInscriptions() {
        return inscriptions;
    }
    public void setInscriptions(List<Inscription> inscriptions) {
        this.inscriptions = inscriptions;
    }
    

    
}
