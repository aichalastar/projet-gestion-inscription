
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Classe;
import entities.Professeur;
import entities.ProfesseurDeClasse;
import services.ClasseService;
import services.ProfesseurService;



public class ResponsablePedagogiqueView {
    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc = new Scanner(System.in);
        ClasseService classeService=new ClasseService() ;
        do{
            System.out.println("1-Ajouter une classe");
            System.out.println("2-Lister les classes");
            System.out.println("3-Ajouter des professeurs");
            System.out.println("4-Lister les professeurs");
            System.out.println("5-Filtrer les classes d'un professeur");
            choix=sc.nextInt();
            sc.nextLine();
            switch (choix) {
                case 1:
                System.out.println("Entrez le niveau de la classe(L1, L2, L3)");
                String niveau=sc.nextLine();
                System.out.println("Entrez la filière de la classe");
                String filiere=sc.nextLine();
                Classe cl= new Classe();
                cl.setNiveau(niveau);
                cl.setFiliere(filiere);
                classeService.ajouterClasse(cl);
                System.out.println("BRAVOOOOO CLASSE AJOUTEE ");


                    break;
                case 2:
                System.out.println("la liste des classes:");
                List<Classe> classes= classeService.ListerClasse();
                for(Classe classe: classes){
                    System.out.println(classe.getNiveau()+""+ classe.getFiliere());

                }
                

                    break;

                case 3:
                Professeur professeur=new Professeur();
                System.out.println("entrer le nci");
                professeur.setNci(sc.nextInt());
                System.out.println("entrer le nomComplet");
                professeur.setNomComplet(sc.nextLine());
                System.out.println("entrer le grade");
                professeur.setGrade(sc.nextLine());
                classes = classeService.ListerClasse();
                    int response;
                    List<ProfesseurDeClasse> ListerClasse= new ArrayList<>();
                    do {
                        for (Classe classe : classes) {
                            System.out.println(classe.getNiveau()+"-"+classe.getFiliere());
                          }
                         System.out.println("Veuillez selectionner la classe à laquelle vous voulez affecter");
                          int idClasse=sc.nextInt(); 
                          cl= classeService.findClasseById(idClasse);
                          if (cl!=null) {

                            ProfesseurDeClasse professeurDeClasse=new ProfesseurDeClasse();
                            professeurDeClasse.setProfesseur(professeur);
                             int inside=0;
                            
                            professeur.getProfesseurDeClasses().add(professeurDeClasse);

                          }else{
                             System.out.println("Cet Id n'existe pas");
                          } 
                          
                         
                         System.out.println("Voulez continuez 1-Oui 2-Non"); 
                         response=sc.nextInt(); 
                       
                    } while (response==1);
                    

                    if (professeur.getProfesseurDeClasses().size()==0) {
                          System.out.println("Le professeur doit avoir  au moins une classe");
                    }else{
                        
                        
                    }

                    break;
                    case 4 :
                    System.out.println("les professeurs sont les suivantes");
                    
                    break;
                    
                
                    
                    
                default:
                    break;
            }
        }while(choix!=5);
    }
    
}
