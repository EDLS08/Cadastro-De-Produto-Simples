# Product Inventory — Java OOP

A small Java console exercise that models products and calculates the total value represented by the stock.

## Concepts practiced

- Classes and objects
- Encapsulation with private attributes
- Constructors and getters/setters
- Input validation through `IllegalArgumentException`
- Instance methods and numeric calculations

## Business rule

The stock value is calculated as:

`price × quantity`

The `Product` class prevents empty names and negative prices or quantities.

## Requirements and execution

JDK 8 or newer.

```bash
javac -d out src/Main.java src/Product.java
java -cp out Main
```

## Language

[Leia em português](README-pt-br.md)
