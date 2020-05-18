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

## Observer

Padrão utilizado para desacoplar métodos ou ações após determinado comportamento, onde é criado um *Observer* capaz de executar ações sem saber exatamente que ações.

Quanto utilizar:
- Alto acoplamento com parâmetros comuns.
- Lista de métodos que devem ser executados pós ação qualquer.
- Geração de uma *Nota fiscal* ou *Pedido*.

## Factory

Padrão utilizado também para facilitar a criação de objetos como o *Builder*, porém a principal diferença é que o *Factory* é utilizado para objetos mais simples que precisam ser instanciados.

Quando utilizar:
- Objetos com frequência de utilização e lógica simples.
- Objetos de conexão.