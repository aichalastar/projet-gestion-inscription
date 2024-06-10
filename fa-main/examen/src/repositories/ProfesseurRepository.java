package repositories;

import java.sql.ResultSet;
import java.sql.SQLException;




import entities.Professeur;

public class ProfesseurRepository extends Database {
    private final String SQL_INSERT="INSERT INTO `professeur` ( `nci`, `nomcComplet`'grade') VALUES (?,?);";
    private final String SQL_LAST_VALUE_INSERT="SELECT Max(`id_professeur`) as max FROM `professeur`";
    public void insert(Professeur professeur){
        try {
             ouvrirConnexion();
             initPrepareStatement(SQL_INSERT);
             statement.setInt(1,professeur.getNci());
             statement.setString(2,professeur.getNomComplet());
             statement.setString(3,professeur.getGrade());
             executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public  Professeur selectLastP(){
        Professeur professeur=null;
        try {
            ouvrirConnexion();
            initPrepareStatement(SQL_LAST_VALUE_INSERT);
     
            ResultSet rs = executeSelect();
            while (rs.next()) {
                professeur=new Professeur(); 
                professeur.setId(rs.getInt("max")); 
             
            }
       } catch (SQLException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }
       return professeur;
      }
      public  Professeur selectLastProfesseur(){
        Professeur professeur=null;
        try {
            ouvrirConnexion();
            initPrepareStatement(SQL_LAST_VALUE_INSERT);
     
            ResultSet rs = executeSelect();
            while (rs.next()) {
                professeur=new Professeur(); 
                professeur.setId(rs.getInt("max")); 
             
            }
       } catch (SQLException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }
       return professeur;
      }
      

    

    
}
