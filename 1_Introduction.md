# <center>Introduction
In 1991, **James Gosling** at Sun Microsystems started Green Project:Oak but name was trademarked  -> Java{coffee}.

Earlier Programs written for Windows wouldn’t run on Mac.  
Mac programs wouldn’t run on Linux.

Java came with this powerful idea:  
“Write Once, Run Anywhere.”  
You write code → it becomes bytecode.  
JVM reads that bytecode, hence code runs on any machine that has JVM

In 2010, Oracle Corporation bought Sun Microsystems.  
Since then, Oracle manages Java.

---
### WHAT?
High-level, Object-Oriented, Platform independent, Compiled and interpreted Language

---
### HOW?
Other languages:  
You write code → compile → machine code → runs only on that OS.

In Java :-

1. We write .java file => Java Compiler(Javac) converts **.java** into **.class**(Bytecode) ie. compilation in compile time.   
Bytecode: Not human readable, Not machine code, A middle language.  
2. **JVM** (Java Virtual Machine) executes that byte code ie. interpretation in runtime.


## JVM ?
A virtual computer inside your real computer that =>  
Executes bytecode, Manages memory, Does garbage collection, Ensures security

Components :-
1. **Class Loader**: Scans class path(where classes are defined)
   1. Loading
   2. Initialization
   3. Linking
2. **Byte Code Verifier**
3. **JVM Langauge Stack**: Manages thread
4. **Method Area**
5. **Registers**
6. **JIT Compiler**: Finds frequent run code and outputs


Overall we need to install JDK in our pc to run java.
![alt text](image.png)


## Basic Syntax

```java
public class Ayush{  
    public static void main ( String args[] ){  
        System.out.println("Hello Java");  
    }  
}  
//Save file as Ayush.java
//Same name as class
```
Every line of code that runs in Java must be inside a class.   
The class name should always start with an uppercase first letter.  
The name of the Java file must match the class name.

>We have made class 'Ayush' still we are able to run without object bcoz of static keyword
<br>

---
## <center>Java Comments

    // Single-line comment
    /* 
        These are multiline
        comments
    */

---
