


class Book{
    String title;
     String author; 
     double price;
    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
     void displayDetails(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }
    
}

class Car{
    String brand;
    String model;

    public Car() {
        this.brand = brand;
        this.model = model;

    }
    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public void display(){
        System.out.println("Brand is "+brand+" Model is "+model);
    }


    

}

class MathOperation{
    
    public int add(int a, int b){
        // System.out.println(a+b);
        return  a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }

}

class Student{
  private String name ;
  private int marks ;

    public int getMarks() {
        return marks;
    }

    // public String getName() {
    //     return name;
    // }
    public String getName() {
        return name;
    }
    
    
     public void setName(String name){
        this.name = name;
     }
    
}

public class Assignment3 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics" , "John Doe",450.50);
        b1.displayDetails();

        Car c1 = new Car("Toyota","Fortuner");
        c1.display();

       MathOperation m1 = new MathOperation();
       System.out.println( m1.add(2, 4));
       System.out.println(m1.add(2, 4,6));
       System.out.println(m1.add(23.00, 34.91));

       Student e1 = new Student();
       e1.setName("yash verma");

       System.out.println(e1.getName());



    }
}
