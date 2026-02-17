## <center>USER INPUT

The **Scanner** class is used to get user input, and it is found in the **java.util** package.

```java
import java.util.Scanner; 

class Main {
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    //System.in → take input from keyboard

    String a = sc.next();     //one word
    String b = sc.nextLine(); //full sentence
    int b    = sc.nextInt()
    double c = sc.nextDouble();
  }
}
```