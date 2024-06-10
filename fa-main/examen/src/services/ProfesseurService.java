package services;

import java.util.List;


import entities.Professeur;
import entities.ProfesseurDeClasse;
import repositories.ProfesseurDeClasseRepository;
import repositories.ProfesseurRepository;

public class ProfesseurService {
    ProfesseurRepository professeurRepository=new ProfesseurRepository();
    ProfesseurDeClasseRepository professeurDeClasseRepository=new ProfesseurDeClasseRepository();
    public void ajouterUnProfesseur(Professeur professeur)  {
        professeurRepository.insert(professeur);
        Professeur lastProfesseur= professeurRepository.selectLastProfesseur();
        List<ProfesseurDeClasse>professeurDeClasses = professeur.getProfesseurDeClasses();
        for(ProfesseurDeClasse pc : professeurDeClasses){
            pc.setProfesseur(lastProfesseur);
            professeurDeClasseRepository.insert(pc);
        }
    }
    
    
    }
    
    

