package enumerations;
public enum Civilite {  // dans le fichier Civilite.java  
  
    MADAME("MME"), MADEMOISELLE("MLLE"), MONSIEUR("MR") ;  
      
     private String abreviation ;  
      
     private Civilite(String abreviation) {  
         this.abreviation = abreviation ;  
    }  
      
     public String getAbreviation() {  
         return  this.abreviation ;  
    }  
}