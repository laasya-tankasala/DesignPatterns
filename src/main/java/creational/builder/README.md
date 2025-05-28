# Builder Pattern

It is a _creational_ design pattern.

This pattern allows you **to build different configurations of an object** using the same step-by-step construction process, especially when multiple optional parameters or configurations are involved.

Popular use-case: StringBuilder

Let's say you have a class with a number of optional fields, think of the troubles you would go through to create an object.
1. An object with all fields initialized, you would require a constructor with so many parameters.
2. For every combination of fields, you would need a unique constructor. Several combinations, several overloaded constructors. Ugly code — hard to maintain or read.
3. Even worse, (refer to the example below) creating separate constructors for every combination quickly becomes unmanageable — especially when multiple fields share the same type, leading to duplicate or ambiguous signatures.

>class Address { <br>
>       @NotNull    <br>
>       String line1;  <br>
>       String line2;     //optional <br>
>       String landmark;  //optional <br>
>       @NotNull <br>
>       String state; <br>
>       @NotNull <br>
>       int pinCode; <br>
> }
>
I want to have a constructor for every possible combination.
1. All variables initialized
> class Address (String line1, String line2, String landmark, String state, int pinCode) { } 
2. No line2
> class Address (String line1, String landmark, String state, int pinCode) { }
3. No landmark
> class Address (String line1, String line2, String state, int pinCode) { }
4. No line2 and no landmark
> class Address (String line1, String state, int pinCode) { }

If you observe, constructors (2) and (3) have the same signatures, and it's not allowed. <br>
You can use constructor (4) and then set the missing field using setters, but then you'll deal with mutable objects, which can get very messy due to their unpredictable behavior, especially in multi-threaded applications. <br>
Even with `final` fields ensuring immutability, you’re still stuck with the complexity of initializing them across many different object configurations.
Also, there are going to be issues like readability and order sensitivity of the parameters.


We can deal with such classes easily by implementing the Builder pattern.

### How?

The Builder pattern follows the idea of adding parts step-by-step and then build the object at the end. That implies, until you choose to build, you'd be working with an intermediary builder object and can always add to it.

For example, you get a StringBuilder object (say **_s_**) and modify it as required. When you need the String object, then you call **_s.toString()_** which returns the immutable String object, but until then you keep modifying the StringBuilder object.

There are five elements in a Builder design pattern.

1. **Product**
    - the complex class whose objects you want to build.
2. **Builder**
    - an interface or an abstract class that helps you build an object of the Product.
    - not a concrete class, so that this can be used to create a ConcreteBuilder class for each variation of the product (if there are multiple).
3. **ConcreteBuilder**
    - implementation of the Builder customized for a specific variation.
4. **Director** (optional)
   - useful when a standard configuration is used to several objects.
   - defines the order in which we should call the construction steps so that we can re-use specific configurations of the products we are building.
   - helps to hide the details of the product construction from the client code.
5. **Client** (optional)
   - creates both the Builder and Director objects.
   - passes the Builder object to the Director to build it and finally, may receive the built Product.

What does a Builder interface usually have?
- all the fields of the Product class. (yes, that's quite some code duplicacy.)
- setter methods for all the fields.
- a build method which returns an object of the Product.

Note: To have the **Product constructor non-public** is a better practice, IMO. (of course boils down to the context to decide if it's actually better).
Because,
1. Builder class outside the Product class: We need to instantiate the object, so its access should be **package-private**.
2. Inner Builder class: **private**.
3. We want to **restrict the access** to Constructor. The object should be built via the Builder.

### Benefits:

- complex object constructions made simpler -- no telescoping constructors.
- can encapsulate construction and representation code (the Director class can play the role of abstraction).
- helps ensure immutability by separating object construction from representation and avoiding setters.

### Remember
Builder introduces a bit of boilerplate, so for simple objects with few fields, it might be overkill. <br>
examples: simple POJOs, classes with immutable (final) fields/immutable objects are not required, very few configurations are required, performance-critical and high-throughput cases with massive object creation

So, take a step back and examine your use-case before going ahead.

Bonus Reading:
- Lombok's @Builder
- Builder vs. Decorator vs. Factory
- more on roles of Director and Client
- why Java Code usually skips the Director in Builder Pattern
- how Builder Pattern impacts high-throughput applications.
