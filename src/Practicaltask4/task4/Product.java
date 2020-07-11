package Practicaltask4.task4;
public class Product {
       protected String name;
        protected int price;
        protected int quantity;


     public Product(String name,int price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", price=" + price + ", quantity=" + quantity + '}';

    }
}



