/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7;

/**
 *
 * @author franc
 */
public class Lab7 {

    
    public static void main(String[] args) {
        Product product1 = new Product("Ovos");
        product1.inverse();
        System.out.println(product1.getInformation());
        
        Product product2 = new Product("Leite");
        Product product3 = new Product("Fraldas");
        ShoppingList shoppingList1 = new ShoppingList();
        shoppingList1.addProduct("Pure");
        shoppingList1.addProduct("Batatas");
        shoppingList1.show();
    }
    
}
