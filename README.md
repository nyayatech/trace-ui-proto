# trace-ui-proto
Lineage data tool: UI tech choice analysis
* Related task: https://github.com/nyayatech/credo-lineage/issues/7 
* Related Milestone: https://github.com/nyayatech/credo-lineage/milestone/1

**context:**

This repository addresses task 1 of the front end lineage milestone. The aim of this work is to evaluate different technological options for the UI.

The techs under consideration are: 

- Reaflow 
- Mermaid
- Reagent flowgraph 

| library   | virtual dom | rendering container  | clojurescript           | adoption                                     | style                        | relevant features                                 | data structure |
| --------- | ----------- | -------------------- | ----------------------- | -------------------------------------------- | ---------------------------- | ------------------------------------------------- | -------------- |
| reaflow   | `yes`       | `canvas`             | `wrap: reagent/reframe` | stars: 1.7k<br />last update: last week      | basic included, customizable | - rich set of interactions<br />- component hooks | flattened      |
| flowgraph | `yes`       | `standard dom` (WIP) | `native`                | stars: 11<br />last update: 2018             | basic, customizable          | - reagent handlers                                | nested         |
| mermaid   | `no`        | `svg`                | `wrap: vanilla js`      | stars: 62k<br />last update: under heavy dev | basic included, customizable | - static callbacks <br />- dom events             | DSL, flattened |

Investigation strategy:

- understand effective technologies pros and cons, development effort, difficulties, helpful tools  
- produce a sample UI that can be used as a widget to exhibit the tech
- identify styling strategies and tech burden (eg css libraries / framework and compilers)  
- specify iframe requirements for embeddability 

On top of those considerations we should be able to:

- chose a technology
- set up the project for the next step https://github.com/nyayatech/credo-lineage/issues/8  

## embeddable widget & cross origin 

In order for the widget to be embedded by other pages as an `iframe` CSP issues have to be considered: https://developer.mozilla.org/en-US/docs/Web/HTML/Element/iframe

## dev

This project uses:

- clojurescript 
- shadow-cljs 

to build and serve locally the demo widgets.



## Analysis

### reaflow

- in progress

### mermaid

- in progress

## flowgraph

- in progress

## Results
Expected output date: 27-10-2023




