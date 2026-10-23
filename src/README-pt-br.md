# Java: Object-Oriented Programming (OOP) Practice

A fundamental Java console application designed to practice Object-Oriented Programming (OOP) concepts, focusing on class structuring and encapsulation.

## 🚀 Concepts Practiced

* **Encapsulation:** Protecting class attributes using `private` visibility and exposing them safely via public `Getters` and `Setters`.
* **Constructors:** Implementing object initialization with the `this` keyword to map parameters to instances.
* **Methods & Return Types:** Creating business logic to calculate values (`Double`) and return data to the caller.
* **String Formatting:** Using `System.out.printf` with `%.2f` for cleaner decimal formatting of monetary values.

## 📋 Features

1. Defines a `Product` blueprint with name, price, and quantity.
2. Instantiates multiple products in a separate `Main` orchestrator class.
3. Dynamically updates inventory stock levels using setter methods.
4. Computes and displays the total financial value of the inventory in the console.

## 🛠️ How to Run

1. Compile both source files together:
   ```bash
   javac Main.java Product.java
   ```
2. Run the main class:
   ```bash
   java Main
   ```
