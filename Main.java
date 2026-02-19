import java.util.ArrayList;

public class Main {
  public static void main(String[] args) 
  {
    ArrayList<String> cars = new ArrayList<String>();

    cars.add("Volvo");
    cars.add(0, "Mazda"); // Insert element at index

    System.out.print(cars.get(0));  // Get the first element

    cars.set(0, "Opel");

    cars.remove(0);

    cars.clear(); //To remove all the elements

    System.out.println(cars);
  }
}