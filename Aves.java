package reinoanimal;

public class Aves extends Cordados {
    private String bico;
    private String asas;
    
    @Override
    public void caracteristica(){
        System.out.printf("Caracteristica:%s\n",notocorda);
    }
    
    @Override 
     public void movimento(){
         System.out.println("voo");
    }
    
     @Override 
     public void alimento(){
         System.out.println("insetos");
    }   
}
