 # Estruturas de repetição
Laços de repetição, também conhecidos como laços de iteração ou simplesmente loops, são comandos que permitem iteração de código, ou seja, que comandos presentes no bloco sejam repetidos diversas vezes.

### Laços ou repetições são representados pelas seguintes estruturas:

 - For (para);

 - While (enquanto);

 - Do While (faça enquanto).


---


# FOR
O comando for (na tradução literal para a língua portuguesa “para”) permite que uma variável contadora, seja testada e incrementada a cada iteração, sendo essas informações definidas na chamada do comando. O comando for recebe como entrada uma variável contadora, a condição para continuar a execução e o valor de incrementação.

### For Each
O uso do for / each está fortemente relacionado, com um cenário onde contenha um array ou coleção, e assim, a interação é baseada nos elementos da coleção.

### Break e Continue
Break significa quebrar, parar, frear, interromper. E é isso que se faz, quando o Java encontra esse comando pela frente. Continue, como o nome diz, ele 'continua' o laço. O comando 
break interrompe o laço, já o continue interrompe somente a iteração atual.

---
# WHILE
O laço while (na tradução literal para a língua portuguesa “enquanto”) determina que, enquanto uma condição for válida, o bloco de código será executado. O laço while testa a condição antes de executar o código, logo, caso a condição seja inválida no primeiro teste o bloco nem será executado.

A estrutura de sintaxe, do controle de repetição while é exibida abaixo:

//estrutura do controle de fluxo while

```
while (expressão booleana de validação)
{
    // comando que será executado até que a 
    // expressão de validação torne-se falsa 
}
```

---
# Do While
O laço do / while (na tradução literal para a língua portuguesa “faça…enquanto”), assim como o laço while, considera que, enquanto uma determinada condição for válida, o bloco de código será executado. Entretanto, do / while
testa a condição após executar o código, sendo assim, mesmo que a condição seja considerada inválida, no primeiro teste o bloco será executado pelo menos uma vez.

A estrutura de sintaxe do controle de repetição do / while é exibida abaixo:

``` 
//estrutura do controle de fluxo do while

do
{
    // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}
while (expressão booleana de validação);
``` 
