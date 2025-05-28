# Iterator Pattern

It is a _behavioral_ design pattern. <br>

As the name suggests, it allows the user **to traverse through an aggregate object sequentially** without worrying about its underlying implementation.

It follows: <br>
- **Single Responsibility Principle**: client code deals with the business logic only, bulky traversal code is handled by the iterator classes.
- **Open Closed Principle**: new iterators and aggregate classes can be created and passed to the client code without modifying anything.

It is useful when: <br>
- aggregate is a complex data structure like trees, graphs, etc.
- you need to traverse through the aggregate multiple times.
- you can have multiple traversal logics for the same aggregate and use any as necessary.

**Use-cases**: `java.list.Iterator` implemented by Collections, File readers, cursor objects in DB APIs, DOM elements

There are four key elements in the Iterator pattern. <br>
1. Iterator 
   - an interface
   - has the traversal methods — `hasNext();` and `next();`
2. ConcreteIterator
   - a concrete class
   - implements the `Iterator` interface and its methods for a specific aggregate.
3. Aggregate
   - an interface that maintains the collection of objects.
   - has the `createIterator();` method.
4. ConcreteAggregate
   - a concrete class, implementation of the `Aggregate` interface.
   - creates the `ConcreteIterator` object to traverse through it.

Note: other common optional methods implemented in the Iterator pattern: `remove();`, `previous()`, `hasPrevious()`, `current()`/`peek()`, `index()`, etc

### Thread Safety <br>
It is **not guaranteed** by Iterator pattern. <br>
When multiple threads interact with the aggregate (collection) or the iterator, several issues can arise if proper precautions are not taken.
Risks:
- `ConcurrentModificationException` in Java
- Inconsistent data
- Race conditions

### Benefits <br>
- **hides and decouples** the iteration logic from the client.
- **several iterators** can traverse through the same aggregate simultaneously.
- can delay/continue the iterator when needed.

This pattern ain't the better option in case
- you require **random** **access**.
- **simple aggregate objects** or built-in methods available.
- **complex or non-linear traversal** is required.
- performance-critical and **memory-sensitive** applications.
- **parallel or reactive processing** needed.

Bonus Reading:
- Thread-safety strategies
- Alternatives for scenarios where Iterator pattern can't help
