package reinoanimal;


public class Mamiferos extends Cordados{
    private String pelos;
    private String glandulasmamarias;
    
    @Override
    public void caracteristica(){
        System.out.printf("Caracteristica:%s\n",notocorda);
    }
    
    @Override 
     public void movimento(){
         System.out.println("patas");
    }
     
     @Override 
     public void alimento(){
         System.out.println("leite");
    }   
}
