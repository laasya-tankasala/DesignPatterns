# Prototype Pattern

It is a _creational_ design pattern.

This pattern is to let you **_clone/copy_** an object by exposing a method clone() in a parent interface.

Use-cases: Configuration heavy systems, UI component libraries (e.g., clone a styled button template), Game development (e.g., clone enemies with base stats)

Let's say you have a class Phone with three fields { brand, model, storage } <br>
> class Phone { <br>
>   public String brand; <br>
>   public String model; <br>
>   public String storage; <br>
> } <br>

and an object of class Phone called Phone1 with the values { Apple, iPhone 14, 256GB } <br>
> Phone phone1 = new Phone(); <br>
> phone1.brand = "Apple"; <br>
> phone1.model = "iPhone 14"; <br>
> phone1.storage = "256GB"; <br>

if you do not know the actual values,
and you would like to create another object phone1 with the same field values as phone1, it's straightforward;
you can assign the corresponding field values of phone1 to phone2.
> Phone phone2 = new Phone(); <br>
> phone2.brand = phone1.brand; <br>
> phone2.model = phone1.model; <br>
> phone2.storage = phone2.storage; <br>

BUT what if 
- one/more of the fields is private, then how can you access those values?
- you need to make a number of objects with a number of fields,
you are going to have to write all of it again and again.
That is a lot of redundant code which is neither maintainable nor readable.

### Why?
- to get access to the private variables.
- to avoid tight coupling.
- in third party applications, we may not have access to the class but only its concrete objects.
- in some cases, we might know the interface but not the concrete class.

### How to overcome? <br>
- define a **_common interface for all the objects that support cloning_**
so that you have a consistent method name for the clone method
(instead of multiple names: getClone(), clone(), doClone(),
the interface implementation compels to use the same name across all its classes).
- **_polymorphic constructor_**: create a constructor which accepts the same class object as its argument.

One of the best examples of how consistent naming benefits the developer is the Collections Framework.
The implementation differs from one collection to another (like List<>Set<>Queue),
but for a specific operation, the method is the same across all the collection classes.
(to add an element, add(E e);, to clear an object, clear();)
The developer need not memorize the method names for every collection individually.

### Shallow Copy vs. Deep Copy
Shallow Copy: **Only the references** are copied —
if the object has mutable fields (like lists or other objects),
both the original and the clone will point to the same sub-objects.
<br>
Deep copy: **the entire object graph** is cloned — including all nested mutable objects —
so the original and clone are completely independent.

### Thread-Safety
Cloning can have thread-safety concerns if mutable fields are shared between instances unintentionally
(especially with shallow copies).
So in multi-threaded environments, using deep copies or synchronization might be necessary.

### Benefits:
- decoupled.
- access to the private fields.
- saves resources and time.
- get rid of repeated initialization code.

So it's always better to choose this? Probably not.
- if object creation is simple and is not resource intensive.
- objects vary from each other significantly. (If the differences are minor, you can clone and modify. Otherwise, you would again have to re-assign almost all the fields.)
- cloning logic is complicated. (when the object has deeply nested or circular references, creating a deep copy would get very tough.)
- if object creation requires logic or different variations, patterns like Factory Method or Builder might be a better fit.

Checkout _document_ package for implementation of real-world use-case (Google Docs, Canva) of Prototype Pattern.

Brownie: Prototype Registry, Prototype vs. Factory vs. Builder, more on Shallow copy vs. Deep copy and thread-safety.