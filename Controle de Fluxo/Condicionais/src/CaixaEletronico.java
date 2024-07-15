public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 17.0;
 
        if(valorSolicitado < saldo){             //Condicional Simples, caso não seja verdadeiro, nada acontece, caso seja Composta, passa para a próxima instrução
         saldo = saldo - valorSolicitado;
        System.out.println("Novo saldo é " + saldo);
        }
        else
        System.out.println("Saldo insuficiente");

     }
}
