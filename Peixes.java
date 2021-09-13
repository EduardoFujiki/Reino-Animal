package reinoanimal;

public class Peixes extends Cordados {
     
    private String nadadeira;
    
   
   @Override
    public void caracteristica(){
        System.out.printf("Caracteristica:%s\n",notocorda);
    }
    
    
    @Override 
     public void movimento(){
         System.out.println("Nadando");
    }
     
    @Override 
     public void alimento(){
         System.out.println("racao");
    }   
}
