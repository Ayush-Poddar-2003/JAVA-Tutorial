class Employee{
    int age = 20;
    static int rollNo = 69;

    int basicSal = 20000;
    int incentive = 300;
    void countSal(){
        System.out.println(basicSal+incentive);
    }
}

class Test{
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println(emp1.age);
        //here we used object

        //If want to directly use class
        // System.out.println(Employee.age); //Will give error
        System.out.println(Employee.rollNo); //Work coz of static
    }
}