package reinoanimal;


public class ReinoAnimal {

    
    public static void main(String[] args) {
       Peixes tilapia = new Peixes();
       Anfibios sapo = new Anfibios();
       Repteis cobra = new Repteis();
       Aves galinha = new Aves();
       Mamiferos boi = new Mamiferos();
       
       
       
       tilapia.movimento();
       sapo.movimento();
       cobra.movimento();
       galinha.movimento();
       boi.movimento();
       
       tilapia.alimento();
       sapo.alimento();
       cobra.alimento();
       galinha.alimento();
       boi.alimento();
   
    }
}
    
