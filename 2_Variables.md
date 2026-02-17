# <center>VARIABLES

### final
Used to make variable as a constant.

---

We have 3 types of variables :-
1. Local : Declared inside a method or block, Lives in stack, temporary.  
Must be initialized before use.  
Cannot use access modifiers (no public/private)
2. Static : Shares single copy/memory to all objects.
2. Reference : A reference variable does NOT store actual object, It stores the ADDRESS of the object in heap.

```java
class A
{
    int a; // Instance
    
    static int b = 7; // Static variable
    
    public static void main(String args[])
    {
        int c = 9; // Local variable
        System.out.println(c);

        A ref = new A(); // ref is reference variable
        ref.a = 20;
        System.out.println(ref.a); 
        // reference variable need object

        System.out.println(A.b); 
        // static variables are accessed directly via class
    }
}
```




---
### Identifiers Naming
- Names can also begin with $ and _ 

---