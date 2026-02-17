# Constructor

A constructor in Java is a special method that is used to initialize objects.  
The constructor is called when an object of a class is created.  
It can be used to set initial values for object attributes  
Constructor name must match the class name, with no return type.  
All classes have constructors by default, if you do not create a class constructor yourself, Java creates one for you. 

```java
public class Main 
{
  int x;

  public Main() {
    x = 5;  // Set the initial value
  }

  public static void main(String[] args) 
  {
    Main myObj = new Main(); 
    // Create an object of class Main 
    // (This will call the constructor)

    System.out.println(myObj.x); // Print the value of x
  }
}

// Outputs 5
```