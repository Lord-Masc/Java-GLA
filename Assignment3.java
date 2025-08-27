
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
public class Assignment3 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics" , "John Doe",450.50);
        b1.displayDetails();

        Car c1 = new Car("Toyota","Fortuner");
        c1.display();
    }
}
