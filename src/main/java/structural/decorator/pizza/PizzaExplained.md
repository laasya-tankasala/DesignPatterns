# Pizza Generator

In this implementation, <br>

BaseComponent: Pizza base <br>
Decorator: Toppings <br> 
ConcreteComponent: Pizza Bases _{ Margherita Pizza, BBQ Pizza }_ <br> 
ConcreteDecorator: Pizza Toppings _{ Olives, Bacon, Extra Cheese }_ <br>

The goal is to prepare a pizza with **any one base** and with **0 or more toppings**. <br>
For example, a Margherita Pizza with no toppings _or_ a BBQ Pizza with Olives _or_ a BBQ Pizza with Cheese and Bacon.

Two functions in the base component Pizza class,

1. Pizza - to generate the pizza. 
2. Cost - to calculate the cost. (Any pizza base costs the same, but each topping costs extra.)


