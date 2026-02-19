# ABSTRACTION
Data abstraction is the process of hiding certain details and showing only essential information to the user.

- The abstract keyword is a non-access modifier, used for classes and methods:
- Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
- Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
- An abstract class can have both abstract and regular methods.

```JAVA
abstract class Animal {
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz");
  }
}

Animal myObj = new Animal(); // will generate an error
// it is not possible to create an object
```
### How ?
```java
abstract class Animal {
  
  public abstract void animalSound(); 
  // Abstract method (does not have a body)
  
  public void sleep() {
    System.out.println("Zzz");
  }
}

class Pig extends Animal {
  public void animalSound() {
      System.out.println("The pig says: wee wee");
     //The body of animalSound() is provided here
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
```

# <center> INTERFACE
An interface is a completely "abstract class" that is used to group related methods with empty bodies:

Notes on Interfaces:
- Like abstract classes, interfaces cannot be used to create objects
- Interface methods do not have a body - the body is provided by the "implement" class
- On implementation of an interface, you must override all of its methods
- Interface methods are by default abstract and public
- Interface attributes are by default public, static and final
- An interface cannot contain a constructor (as it cannot be used to create objects)

```java
interface Animal {
  public void animalSound();
  public void run(); 
  // interface method (does not have a body)
}
```
To access the interface methods, the interface must be "implemented" by another class with the implements keyword (instead of extends).

```java
interface Animal {
  public void animalSound();
  public void sleep();
}

class Pig implements Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    System.out.println("Zzz");
  }
}

class Main {
  public static void main(String[] args) 
  {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
```

### MULTIPLE INTERFACES
```java
interface FirstInterface {
  public void myMethod();
}

interface SecondInterface {
  public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Some text..");
  }
  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}

class Main {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}
```