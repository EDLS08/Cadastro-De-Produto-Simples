# Cadastro de Produtos — POO em Java

Exercício simples em Java que representa produtos e calcula o valor total correspondente ao estoque.

## Conceitos praticados

- Classes e objetos
- Encapsulamento com atributos privados
- Construtores e getters/setters
- Validação com `IllegalArgumentException`
- Métodos de instância e cálculos numéricos

## Regra de negócio

O valor do estoque é calculado por:

`preço × quantidade`

A classe `Product` impede nomes vazios e valores negativos para preço ou quantidade.

## Requisitos e execução

JDK 8 ou superior.

```bash
javac -d out src/Main.java src/Product.java
java -cp out Main
```

## Idioma

[Read in English](README.md)
