
## ENTRADA 1
### PERGUNTA
- Como descobrir o tipo de dado de uma variável em Kotlin.
### RESPOSTA
- Usando `nome_da_var::class`.
### O QUE ESTAVA ERRADO, DESNECESSÁRIO, OU NÃO HAVIA ENTENDIDO
- Desconhecia a sintaxe e método responsável por isso.
### MUDANÇA E O MOTIVO
- Apenas adicionei `println(nome_da_var::class)` para descobrir se eu tinha acertado os tipos.


## ENTRADA 2
### PERGUNTA
- O que é o operador `!!`, e qual é o problema de usar ele nesse código em específico?
### RESPOSTA
- Interpreta um valor como não nulo. Nesse caso, o ponteiro está definido como nulo, mas como está usando `!!`, ele interpreta como não nulo (contradição), por isso se usa `?`.
### O QUE ESTAVA ERRADO, DESNECESSÁRIO, OU NÃO HAVIA ENTENDIDO
- O problema não estava na declaração do ponteiro, e sim do uso de !! depois no `println()`.
### MUDANÇA E O MOTIVO
- Apenas troquei o `!!` por `?`, visto que o valor é nulo.


## ENTRADA 3
### PERGUNTA
- O que é lambda e qual é sua relação com este exercício?
### RESPOSTA
- É uma função que não tem nome. Pode ser armazenada em uma variável e passada como argumento para outras funções. O exercício pede justamente para criá-la e utilizá-la, depois utilizando-a no `.map`.
### O QUE ESTAVA ERRADO, DESNECESSÁRIO, OU NÃO HAVIA ENTENDIDO
- Desconhecia o termo.
### MUDANÇA E O MOTIVO
- Consegui fazer o exercício com o exemplo que o modelo utilizou. `.map {}`.
