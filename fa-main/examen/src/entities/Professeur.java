package entities;

import java.util.List;

public class Professeur {
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    private String nomComplet;
    private int nci;
    private String grade;
    List<ProfesseurDeClasse>  professeurdDeClasses;
    public List<ProfesseurDeClasse> getProfesseurDeClasses(){
        return professeurdDeClasses;
    }
    public Professeur() {
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public int getNci() {
        return nci;
    }
    public void setNci(int nci) {
        this.nci = nci;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    
}
