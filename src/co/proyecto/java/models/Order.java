package co.proyecto.java.models;
import javax.swing.*;
public class Order {

    //attributes//
    private int idOrder;
    private static int orderCounter;
    private int productCounter;
    private static final int MAX_PRODUCTS = 20;              //I arbitrarily set 20 as the number of elements
    private Product [] products = new Product[MAX_PRODUCTS]; //for this array

    //constructor//
    public Order(){
        idOrder = ++orderCounter; /*orderCounter assigns an Id to the order based on how many orders have been
                                  previously created from the class Order*/
    }

    //methods//

    public int getIdOrder(){
        return idOrder;
    }

    /* The product is added to the array "products" through the index number assigned by the current value of
    "productCounter".
    ProductCounter is increased after every call to this method, indicating how many products
    the array has received. */

    //After reaching the MAX_PRODUCTS, else is called.
    public void addProduct(Product product){
        if (productCounter < MAX_PRODUCTS){
            products[productCounter] = product;
            JOptionPane.showMessageDialog(null,"Your product: " + product.getName() + "\n" +
                    "Has been added to the order: " + idOrder);
            productCounter++;

        }else JOptionPane.showMessageDialog(null, "You've reached the limit of products");
    }

    /* A "total" temporary variable is created to receive the sum of all prices and after the method finishes,
      it gets restarted waiting for another call to this method. */

    /* This method will get through every element of this array up to the value
        of the productCounter and will get its price. After calculating the total, this value is stored into
        the message variable to be returned. */
    public String calculateTotal(){
        double total = 0;
        for (int i = 0; i < productCounter; i++){
            total += products[i].getPrice();
        }
        String message = "\nTotal: $" + total + "\n";
        return message;
    }

    /* This method will get through every element of this array up to the value
       of the productCounter while getting its status which is stored into the message variable. */

    //calculateTotal is called from this method and message is printed through the JOptionPane class.
    public void showOrder(){

        String message = "\n IdOrder: " + idOrder +"\n";

        for (int i = 0; i < productCounter; i++){

            message += products[i].toString();
        }

        message += calculateTotal();
        JOptionPane.showMessageDialog(null, message);
    }

}
