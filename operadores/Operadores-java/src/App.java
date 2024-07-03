
public class App {
    public static void main(String[] args) throws Exception {
        int modulo = 19 % 3;
        System.out.println(modulo);
        
        //classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";
	
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        //operador unário
        int numero = 5;
        numero = numero * -1;
        System.out.println(numero); 
            
        //operador ternário
        int a, b;

        a = 5;
        b = 6;
        
        String resultado = a==b ?"verdadeiro":"falso";
        
         System.out.println(resultado);

         //COMPARAÇÃO AVANÇADA
        String nome1 = "JAVA";
        String nome2 = "JAVA";
        
        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA");
        
        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); //true
        
        //equals na parada
        System.out.println(nome1.equals(nome2)); //??
        System.out.println(nome2.equals(nome3)); //??
        System.out.println(nome3.equals(nome4)); //??

        //OPERADORES LÓGICOS
        // && Operador Lógico "E"
        // || Operador Lógico "OU"

        boolean condicao1=true;

        boolean condicao2=false;

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
        expressões. 
        É como se estivesse escrito:
        "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        */

        if(condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");;

        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");
    }
}
