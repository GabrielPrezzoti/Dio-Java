# Métodos
 
 ## Critérios
 Exemplos sugeridos para nomenclatura de métodos:

Copy
somar(int n1, int n2){}

abrirConexao(){}

concluirProcessamento() {}

findById(int id){}

## Critério de definição de métodos
Como sabemos a melhor forma, de definir os métodos das nossas classes? Para chegar à essa conclusão, somos auxiliados por uma convenção estrutural para todos os métodos. Essa convenção é determinada pelos aspectos abaixo:

1 - Qual a proposta principal do método? Você deve se perguntar constantemente até compreender a real finalidade do mesmo.

2 - Qual o tipo de retorno esperado após executar o método? Você deve analisar se o método será responsável por retornar algum valor ou não.

*Caso o método não retorne nenhum valor, ele será representado pela palavra-chave void.*

3 - Quais os parâmetros serão necessários para execução do método? Os métodos às vezes precisarão de argumentos como critérios para a execução.

4 - O método possui o risco de apresentar alguma exceção? Exceções são comuns na execução de métodos, as vezes é necessário prever e tratar a possível existência de uma exceção.

5 - Qual a visibilidade do método? Avaliar se será necessário que o método seja visível a toda aplicação, somente em pacotes, através de herança ou somente a nível a própria classe.