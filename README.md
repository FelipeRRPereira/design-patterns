# Design Patterns

Estudo sobre os **design patterns** existentes e suas aplicações.

## Strategy

Utiliza dos conceitos da orientação a objeto para implementar um código que propague suas estrategias utilizando interfaces.

Quando utilizar:
- Algorítimos similares
- Estruturas parecidas com regras diferentes
- Quantidade de condicionais excessivas

Ex.: cálculos de impostos, que seguem um calculo similar com regras e percentuais diferentes.

## Chain of Responsibility  
  
Padrão de encadeamento de processos possibilitando executa-los até que se obtenha uma resposta, tratando as condições especificas de cada processo de forma isolada e independente.

Quando utilizar:
- Cadeia de cálculos de descontos
- Processos que sabemos qual é o próximo a ser executado se o atual não retornar nenhum resultado
- Geração de arquivos de diferentes extensões

## Template Method

Padrão com o objetivo de centralizar as estruturas comuns entre métodos em um tamplate, implementando somente as diferenças estendendo o template.

Quando utilizar:
- Estruturas com comportamentos comuns
- Locais com condicionais minimamente diferentes

Ex.: calculo de impostos por estado.

## Decorator

Padrão utilizado para juntar comportamentos que estão em classes diferentes gerando uma sequência de acontecimentos encadeados.

Quando utilizar:
- Cálculo composto de impostos encadeados.