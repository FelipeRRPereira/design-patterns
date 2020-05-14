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

## State

Padrão utilizado controlar estados de uma aplicação diminuindo ifs desnecessários e isolamento de regras tornando o código mais enxuto.

Quando utilizar:
- Máquinas de estados.
- Diferentes comportamentos conforme o estado(em andamento, aprovado, finalizado, etc.).
- Controle de entregas/pacotes que tenha estados.
- Controle de pedidos.

## Builder

Padrão utilizado para simplificar e otimizar a responsabilidade de instanciar objetos. É basicamente uma classe construtora o que auxilia nos casos de muitos atributos opcionais. 

Quando utilizar:
- Presença de muitos atributos opcionais(Necessidade de muitos construtores).
- Atributos com instâncias de outras classes.