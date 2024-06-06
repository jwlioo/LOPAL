# Lógica de Programação e Algortimos



## 1. Variáveis

Sao utilizados para armazenar valores que podem mudar(variar) durante a programaçao

exemplo:

    String nome = joao;
    
## 2. Constantes
Uma constante é um item de dados nomeado com um valor predefinido

    int voto =0;
## 3. Operadores
sao simbolos utilizados para fazer operaçoes matematicas.
## 4. Atribuição

é usado para atribuir valores as variaveis

    int x = 10 
## 5. Aritméticos
Sao usados para realizar operaçoes matematicas 
exemplo:

    int a = 10
    int b = 5
    int soma = a+b 
## 6. Lógicos

sao usados para fazer operaçoes booeleanas.

exemplo: 

    boolean verdadeiro = true;

    
## 7. Condicionais

A Estrutura Condicional, possibilita a escolha de um grupo de ações e comportamentos a serem executadas, quando determinadas condições são ou não satisfeitas. A Estrutura Condicional pode ser Simples ou Composta.

## - Simples
estrutura condicional simples usando if.

exemplo:

    int idade =18;
     if(idade >=18) {
         System.out.print("vc é maior de idade");

     }
## - Composta
usando if e else

exemplo:

        
    int idade =16;
     if(idade >=18) {
         System.out.print("vc é maior de idade.");

     }
     else {
         System.out.print("vc é menor de idade.");
     }
## - Encadeada

Em um controle de fluxo condicional, nem sempre nos limitamos ao se (if) e senão (else), poderemos ter uma terceira, quarta e ou inúmeras condições.

     int nota = 6;

	if (nota >= 7)
		System.out.println("Aprovado");
	else if (nota >= 5 && nota < 7)
		System.out.println("Recuperação");
	else
		System.out.println("Reprovado");
    }
    }
    
## 8. Laços de repetição

tambem conhecido como loops, sao estruturas de controle fundamentais em programaçao que permitem a execuçao repetida de um bloco de codigo.

## - Contador (for)

Estrutura de repetição que utiliza um contador.

exemplo:
    for (int i = 0; i < 5; i++) {
    System.out.println("Contador: " + i);
    }
## - Condicional (while)
Estrutura de repetição que utiliza uma condição.


    int i = 0;
    while (i < 5) {
    System.out.println("Contador: " + i);
    i++;
    
## 9. Vetores
são estruturas de dados que armazenam usualmente uma quantidade fixa de dados de um certo tipo; por esta razão, também são conhecidos como estruturas homogêneas de dados.

exemplo:

    int[] numeros = {1, 2, 3, 4, 5};
    for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
    }
## 10. Matrizes
Matrizes sao vetores, usadadas para armazenar dados em um grade bidimensional.

exemplo:
        
        int[] [] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
