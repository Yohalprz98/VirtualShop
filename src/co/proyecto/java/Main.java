package co.proyecto.java;

import co.proyecto.java.models.Order;
import co.proyecto.java.models.Product;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Welcome to the Virtual Shop. \n");

            Order order = new Order();
            Product product = null;
            showMenu(order, product);
            showOptions(order, product);


    }

    public static void showMenu(Order order, Product product){
        int answer = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of the product you want to " +
                "add to your order:\n" +
                "1. Shirt: $30\n" +
                "2. Jeans: $50\n" +
                "3. Shoes: $70\n" +
                "4. Hat: $20\n"));


        switch (answer){
            case 1:
                product  = new Product("Shirt",30);
                order.addProduct(product);
                break;
            case 2:
                product  = new Product("Jeans",50);
                order.addProduct(product);
                break;
            case 3:
                product  = new Product("Shoes",70);
                order.addProduct(product);
                break;
            case 4:
                product  = new Product("Hat",20);
                order.addProduct(product);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Enter a valid option");
        }
    }

    public static void showOptions(Order order, Product product){
        int answer = Integer.parseInt(JOptionPane.showInputDialog("What do you want to do now?\n" +
                "1. Add another product\n" +
                "2. Show order\n" +
                "3. Send order for payment\n" ));

        switch (answer){
            case 1:
                showMenu(order, product);
                showOptions(order, product);
                break;
            case 2:
                order.showOrder();
                showOptions(order, product);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Your order " + order.getIdOrder() +" has been sent for payment.");

        }

    }


}