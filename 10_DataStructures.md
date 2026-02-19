# The Java Collections Framework 
It provides a set of interfaces (like List, Set, and Map) and  
a set of classes (ArrayList, HashSet, HashMap, etc.) that implement those interfaces.

All of these are part of the java.util package.

- Use List classes when you care about order, you may have duplicates, and want to access elements by index.
- Use Set classes when you need to store unique values only.
- Use Map classes when you need to store pairs of keys and values, like a name and its phone number.

---
# <CENTER>LIST
### 1. ArrayList
An ArrayList is a resizable array that can grow as needed.  
It allows you to store elements and access them by index.

```java
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) 
  {
    ArrayList<String> cars = new ArrayList<String>();

    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");

    cars.add(0, "Mazda"); // Insert element at index

    cars.get(0);  // Get the first element

    cars.set(0, "Opel");

    cars.remove(0);

    cars.clear(); //To remove all the elements

    System.out.println(cars);
  }
}
```

### 2. Linked List

- addFirst( ):	Adds an element to the beginning of the list	
- addLast( ):	Add an element to the end of the list	
- removeFirst( ):	Remove an element from the beginning of the list	
- removeLast( ):	Remove an element from the end of the list	
- getFirst( ):	Get the element at the beginning of the list	
- getLast( ):	Get the element at the end of the list	


# HashSet
A HashSet is a collection where every element is unique - no duplicates are allowed.

# HashMap
A HashMap stores key-value pairs, which are great when you want to store values and find them by a key (like a name or ID):
```java
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
  }
}
```

# Iterators
```java
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    // Create an ArrayList of Strings
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Get an iterator for the ArrayList
    Iterator<String> it = cars.iterator();

    // Iterate through the list using the iterator
    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
```