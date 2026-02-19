# Java Collections Framework 
It provides a set of interfaces (like List, Set, and Map) and  
a set of classes (ArrayList, HashSet, HashMap, etc.) that implement those interfaces.

All of these are part of the `java.util` package.

---
# <CENTER>LIST

The List interface is part of the Java Collections Framework  
Since List is an interface, you cannot create a List object directly.

We use a class that implements the List interface :-

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
    cars.add(0, "Mazda"); // Insert element at index

    cars.get(0);  // Get the first element

    cars.set(0, "Opel");

    cars.remove(0);

    cars.clear(); //To remove all the elements

    Collections.sort(cars);  // Sort cars
    Collections.sort(cars, Collections.reverseOrder());
  }
}
```

### 2. Linked List
From Java 10, you can use the var keyword to declare a LinkedList variable without writing the type twice

```java
LinkedList<String> cars = new LinkedList<String>();

var cars = new LinkedList<String>(); // With var
```

Sometimes you will see both List and LinkedList in Java code, like this:
```java
import java.util.List;
import java.util.LinkedList;

List<String> cars = new LinkedList<>();
```
This means the variable (cars) is declared as a List (the interface), but it stores a LinkedList object (the actual list). Since LinkedList implements the List interface, this is possible.


- addFirst( ):	Adds an element to the beginning of the list	
- addLast( ):	Add an element to the end of the list	
- removeFirst( ):	Remove an element from the beginning of the list	
- removeLast( ):	Remove an element from the end of the list	
- getFirst( ):	Get the element at the beginning of the list	
- getLast( ):	Get the element at the end of the list	

---
# <center> SET
The Set interface is part of the Java Collections Framework and is used to store a collection of unique elements.

Common classes that implement Set:-
### 1. HashSet

```JAVA
// Import the HashSet class
import java.util.HashSet;

public class Main {
  public static void main(String[] args) 
  {
    HashSet<String> cars = new HashSet<String>();
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");  // Duplicate
    // even though "BMW" is added twice, it only appears once

    cars.contains("Mazda");
    cars.remove("Volvo");
    cars.clear();
    cars.size();
  }
}
```
```JAVA
import java.util.Set;
import java.util.HashSet;

Set<String> cars = new HashSet<>();
```

### 2. TreeSet
A TreeSet is a collection that stores unique elements in sorted order.

### 3. LinkedHashSet
A LinkedHashSet is a collection that stores unique elements and remembers the order they were added.

---
# <center> MAP
The Map interface is a part of the Java Collections Framework and is used to store key-value pairs.  
Each key must be unique, but values can be duplicated.

### 1. HashMap
A HashMap stores key-value pairs, which are great when you want to store values and find them by a key (like a name or ID):
```java
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
  }
}
```

### 2. TreeMap
A TreeMap is a collection that stores key/value pairs in sorted order by key.

### 3. LinkedHashMap
A LinkedHashMap stores keys and values, and keeps them in the same order you put them in.

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