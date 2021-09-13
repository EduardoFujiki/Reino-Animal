
package reinoanimal;

public class Anfibios extends Cordados {
   
    private String viscosidade;
    
    @Override
    public void caracteristica(){
        System.out.printf("Caracteristica:%s\n",notocorda);
    }
    
    @Override 
     public void movimento(){
         System.out.println("salto");
    }   
    
    @Override 
     public void alimento(){
         System.out.println("insetos");
    }   
}
