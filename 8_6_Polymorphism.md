# Polymorphism
Polymorphism means "many forms",  
It occurs when we have many classes that are related to each other by inheritance.

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
  public static void main(String[] args) 
  {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}
```

`Animal myPig = new Pig();`

Step 1: What is happening here?

- new Pig() → You are creating a Pig object
- Animal myPig → You are storing it in a variable of type Animal

`Pig myPig = new Pig();` We can write this too.  
But if this we will lost functionalities like  

```java
Animal[] animals = { new Pig(), new Dog() };

for(Animal a : animals){
    a.animalSound();
}
```
> Java decides which method to run based on the object, not the variable type.

––
Even though variable is Animal,
Object is Pig, So Pig’s method runs.