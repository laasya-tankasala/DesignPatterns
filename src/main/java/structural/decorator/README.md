# Decorator Pattern

It is a _structural_ design pattern. <br>

This pattern allows you to _**dynamically add additional functionalities**_ to an object. <br>
It follows the 
   - _single responsibility principle_ by dividing functionality between classes with unique area of concern.
   - _open-closed principle_, as new objects can be created without modifying the existing structure promoting flexibility and extensibility.

Why? To avoid _**class explosion**_. (For more, read https://www.c-sharpcorner.com/article/understanding-and-managing-class-explosion-in-software-design/)  <br>
This pattern is an _**efficient alternative to subclassing**_ as we can augment an object's behaviour without creating an entirely new object and also an extension is bound to compile-time unlike the decorator pattern which does it at run-time. 

Use cases: I/O streams in most languages, any extending functionality with a base component, wherever multiple combinations of features are required.

It usually has 4 key components. 

1. Base Component:  
   - an abstract class or interface.
   - defines the **base interface** that can be decorated.
2. Decorator:
   - also an abstract class or interface.
   - **wraps the base component** and adds additional behaviours.
3. Concrete Component:
   - concrete class, **implementation of the component** interface.
4. Concrete Decorator:
   - concrete class, **implementation of the decorator** with added **specific behaviours**.


Relations: <br>
Decorator is-a and has-a Base Component. <br>
ConcreteComponent is-a Base Component. <br>
ConcreteDecorator is-a Base Component. <br>

Implementations: <br>
Decorator package has only the template implemented, look into pizza package for a more meaningful and comprehensible implementation.

Bonus Reading: 
- How is this pattern implemented in I/O streams?
