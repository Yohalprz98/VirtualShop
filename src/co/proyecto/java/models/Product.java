package co.proyecto.java.models;

public class Product {

    //attributes//
    private  int idProduct;
    private static int productCounter;
    private String name;
    private double price;

    //Constructor//
    public Product(){

        idProduct = ++productCounter; /*productCounter assigns an Id to the product based on how many products
                                        have been previously created from the class Product*/

    }
    //constructor overloading
    public Product(String name, double price){
        this();
        this.name = name;
        this.price = price;
    }

    //methods - getters and setters//
    public int getIdProduct(){
        return idProduct;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }

    public String toString(){
        return "\nProduct:\n" +
                "IdProduct: "+ idProduct + "\nName: " + name + "\nPrice: " + price + "\n";
    }
}
