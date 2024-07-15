public class ExemploBreakContinue {
    public static void main(String[] args) {
	
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;  // caso fosse Continue, a saída sera 1,2,4,5 e não imprimiria o 3 pois mudaria o fluxo daquela interação.
            
            System.out.println(numero);
            
        }
        
        }
}
