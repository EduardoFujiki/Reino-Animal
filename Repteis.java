package reinoanimal;

public class Repteis extends Cordados {
    private String ovos;
    
    @Override
    public void caracteristica(){
        System.out.printf("Caracteristica:%s\n",notocorda);
    }
    
    @Override 
     public void movimento(){
         System.out.println("rastejando");
    } 
    
    @Override 
     public void alimento(){
         System.out.println("pequenos animais");
    }   
}
