# Inheritance
To inherit from a class, use the extends keyword.  
If you don't want other classes to inherit from a class, use the final keyword

```java
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Animal myPig = new Pig();
    Animal myDog = new Dog();
        
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}
```

## Super
In Java, the super keyword is used to refer to the parent class of a subclass.

The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.

It can be used in two main ways:
- To access attributes and methods from the parent class
- To call the parent class constructor
