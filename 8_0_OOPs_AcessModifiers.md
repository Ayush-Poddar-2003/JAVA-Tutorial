# OOPS

Why ?  
Readibility, Reusability, DRY

OOPs : Object oriented programming {S:System/Structure-Real life like inheritence, inddpendant of language}


---
### CLASS ?
Blueprint for object, Name always capital

```
class Myclass
{
    ~ data members/Attributes/Properties/State  
    ~ member functions//Methods/Behaviour

    psvm{

    }
}
```
---
### OBJECT ?
Real life entity  

`className objectName = new className()`.   
new => Allocates memory to object  
className() => constructor


---
# <CENTER> ENCAPSULATION
Wrapping of data in a single unit

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

**Static** : It lets us use that variable anywhere in that program

But with these any way one is able to access our information, so here come other aspect i.e. Security

---
### Getters, Setters & Acess Modifiers

# ACCESS MODIFIERS
#### 1. Public :  
Accessible from anywhere, outside the class BUT within a program.

---
#### 2. Private :
- By default all the members of a class are private.
- Members cam't be accessed or viewed from outside the class directly.
- Only the friend and functions (within same class) can access private members.

---
#### 3. Protected :
Very similar to a private but can be accessed via derived classes 