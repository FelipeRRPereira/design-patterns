<h1 align="center">
  ☕ 🏗️ <br/>
  Design Patterns
</h1>

[![Autor](https://img.shields.io/badge/Student-FelipeRRPereira-A51116?style=flat-square)](https://github.com/FelipeRRPereira)
[![Languages](https://img.shields.io/github/languages/count/FelipeRRPereira/design-patterns?color=A51116&label=Langueges&style=flat-square)](#)
[![GitHub issues](https://img.shields.io/github/issues/FelipeRRPereira/design-patterns?color=A51116&label=Issues&style=flat-square)](https://github.com/FelipeRRPereira/design-patterns/issues)
[![GitHub forks](https://img.shields.io/github/forks/FelipeRRPereira/design-patterns?color=A51116&label=Forks&style=flat-square)](https://github.com/FelipeRRPereira/design-patterns/network)
[![GitHub stars](https://img.shields.io/github/stars/FelipeRRPereira/design-patterns?color=A51116&label=Stars&style=flat-square)](https://github.com/FelipeRRPereira/design-patterns/stargazers)

## Conteúdos

<ul>
  <li><a href="#-strategy">Strategy</a></li>
  <li><a href="#-chain-of-responsibility">Chain of Responsibility</a></li>
  <li><a href="#-template-method">Template Method</a></li>
  <li><a href="#-decorator">Decorator</a></li>
  <li><a href="#-state">State</a></li>
  <li><a href="#-builder">Builder</a></li>
  <li><a href="#-observer">Observer</a></li>
  <li><a href="#-factory">Factory</a></li>
  <li><a href="#-flyweight">Flyweight</a></li>
</ul>

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

Padrão utilizado para desacoplar métodos ou ações após determinado comportamento, onde é criado um _Observer_ capaz de executar ações sem saber exatamente que ações.

Quanto utilizar:

- Alto acoplamento com parâmetros comuns.
- Lista de métodos que devem ser executados pós ação qualquer.
- Geração de uma _Nota fiscal_ ou _Pedido_.

## Factory

Padrão utilizado também para facilitar a criação de objetos como o _Builder_, porém a principal diferença é que o _Factory_ é utilizado para objetos mais simples que precisam ser instanciados.

Quando utilizar:

- Objetos com frequência de utilização e lógica simples.
- Objetos de conexão.

## Flyweight

Padrão utilizado para criar uma lista de instancias que se repetem com muita frequência. Com este padrão é possível economizar memoria, pois diminuí o número de novas instancias.

Quando utilizar:

- Softwares de produção de músicas(classes de notas musicais).
- Aplicações gráficas.
