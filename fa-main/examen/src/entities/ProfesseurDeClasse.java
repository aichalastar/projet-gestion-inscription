package entities;

public class ProfesseurDeClasse {
    private int id;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    Professeur professeur;
    public Professeur getProfesseur() {
        return professeur;
    }
    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
    Classe classes;

    public ProfesseurDeClasse() {
        
    }
    
    public Classe getClasses() {
        return classes;
    }
    public void setClasses(Classe classes) {
        this.classes = classes;
    }
}
