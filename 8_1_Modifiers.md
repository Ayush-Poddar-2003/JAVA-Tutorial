# Access Modifiers

For classes, you can use either public or default:

- public:	The class is accessible by any other class  
- default: The class is only accessible by classes in the same package  
- private: The code is only accessible within the declared class  
- protected	The code is accessible in the same package and subclasses


---
# Non Access Modifiers
- Final: If you don't want the ability to override existing attribute values
- An abstract method is always inside abstract class, and it does not have a body. The body is provided by the subclass.
- Static: Belongs to the complete class, can use without object
```java
class Employee{
    int age = 20;
    static int rollNo = 69;
}

class Test{
    public static void main(String[] args) 
    {
        Employee emp1 = new Employee();
        System.out.println(emp1.age); //here we used object

        //If want to directly use class
        // System.out.println(Employee.age); //Will give error
        System.out.println(Employee.rollNo); //Work coz of static
    }
}
```