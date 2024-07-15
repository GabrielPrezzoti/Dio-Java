public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };  // Em arrays, o índice inicia em 0
    
        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
        for(String aluno : alunos) {          //utilizando for Each
            System.out.println("nome do aluno é :" + aluno);     
          }
    
    }
    }

