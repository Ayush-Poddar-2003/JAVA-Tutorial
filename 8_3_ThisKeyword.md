## This Keyword

The this keyword in Java refers to the current object in a method or constructor.
Sometimes a constructor / method has a parameter with the same name as a class variable. When this happens, the parameter temporarily hides the class variable inside that method or constructor.

To refer to the class variable and not the parameter, you can use the this keyword:

```java
public class Main {
  int x;

  public Main(int x) {
    this.x = x; 
  }

  public static void main(String[] args) {
    Main myObj = new Main(5);
    System.out.println("Value of x = " + myObj.x);
  }
}
```

```java
public class Main {
  int modelYear;
  String modelName;

  public Main(String modelName) { 
    this(2020, modelName);
    //The call to this() must be the first statement inside the constructor.
  }

  public Main(int modelYear, String modelName) {
    this.modelYear = modelYear;
    this.modelName = modelName;
  }

  public void printInfo() {
    System.out.println(modelYear + " " + modelName);
  }

  public static void main(String[] args) {
    Main car1 = new Main("Corvette");
    Main car2 = new Main(1969, "Mustang");

    car1.printInfo();
    car2.printInfo();
  }
}

// Output
// 2020 Corvette
// 1969 Mustang
```