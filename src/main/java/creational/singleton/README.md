# Singleton Pattern

It is a **creational** design pattern. <br>

This pattern is to make sure that _only one instance_ of its kind exists. <br>
It provides a _single point of access_ to the shared resource or object from anywhere in the application.<br>

** always make the _default constructor private_ to avoid creating new objects outside the class.<br>

Use cases: Logging instances, Configuration management, Database connection pooling, Print spoolers, etc.<br>

Pre-requisites: keywords (static, volatile, private, final), concepts (class loading mechanism, multi-threading) <br>

There are four popular ways to implement the Singleton Design Pattern.<br>

1. **Eager Initialization**
   - simple, thread-safe, static initialization.
   - when the class is loaded, the instance is created and stored in a static variable.
   - because the instance is created during class loading, multiple threads accessing it would see the same instance.
   - **Drawbacks:** created even when not really used, so unnecessary resource consumption.
    
2. **Lazy Initialization**
   - creates the instance only when it's actually necessary. (so, good if instance creation is complex or resource intensive)
   - **Drawbacks:** not thread-safe, when multiple threads reach (instance==null) simultaneously, there's a good chance to create two instances.

3. **Synchronized** 
   - thread-safe version of Lazy Initialization logic.
   - **Drawbacks:** impacts performance in highly concurrent systems. When there are a number of threads coming in, 
     every thread shall obtain a lock, check for/get the instance and then release it and locking mechanism is very costly.

4. **Double-checked Locking** 
   - unlike Synchronized mechanism, this approach does not obtain the lock unless the instance is not yet created. 
   - important to note, the instance variable is made _volatile_ to prevent cache incoherence issues.
   - **Drawbacks:** volatile keyword is not compatible with Java 1.4 and below, and just that it's complexer than other implementations.

Bonus Reading:
- BillPughSingleton
- StaticBlockSingleton
- ENUM singleton
