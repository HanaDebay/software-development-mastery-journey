what is OOP?
- is a programming paradigm where we structure program using object-real world entities that have data and behaviors.
4 pillars of OOP
1. Abstraction - show only what is necessary
    - hiding complex implementation details
      - why it matters
    - it reduce complexity
    - makes our code clean
    - prevents exposing internal logic
2. Encapsulation - protect the data 
    - wrapping data(variables) and methods in to single unit(class) and restricting access to the data using access modifiers.
    - to prevent external code form directly changing your data
      - why it matters 
    - protect sensitivity data
    - prevents accidental modification
    - maintains code integrity
3. Inheritance – Reuse existing code
    - allows one class to acquire the properties and methods of another class.
        - Benefits
          - Reusability 
          - Less code duplication 
          - Easier maintenance 
4. Polymorphism – One action, many forms
   -allows the same method or object to behave differently depending on the situation.
        - There are two types
**Compile-time polymorphism(method overloading)**
    **** same method name, different parameters
**Runtime polymorphism(method overriding)**
    **** child class provides its own implementation of a parent class method.
   Why it matters:
-      Flexibility
-      Code becomes dynamic
-      Supports clean architecture (e.g., interfaces)
 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 ***** Class – “Blueprint of an object”
 A class defines the structure and behavior of objects.
 It contains:
Variables (attributes)
Methods (functions/behaviors)

****** Object – “Instance of a class”
An object is a real instance created from the class blueprint.
The object has its own values
****** Constructor – “Initializes an object”
A constructor is a special method that runs automatically when an object is created.
Characteristics:
*     Same name as the class
*     No return type
*     Used to set initial values
Access Modifiers (public, private, protected)
  * control who can access a variable or method.
1. public – “Accessible everywhere” 
2. private – “Accessible only inside the same class”
3. protected – “Accessible in the same package + subclasses”
4. (default) – no modifier
    * Accessible only inside the same package.