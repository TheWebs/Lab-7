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
public class Product {
    private String name;
    private int quantity;
    private boolean isChecked;
    
    public Product(String name)
    {
       this.name = checkName(name);
       quantity = 1;
       isChecked = false;
    }
    
    private String checkName(String name)
    {
         if(name == null) return "Desconhecido";
         return name;    
    }
    
    public void increaseUnit()
    {
        quantity++;
    }
    
    public void decreaseUnit()
    {
        if(quantity > 0) quantity--;
    }
    
    public void inverse()
    {
        if(isChecked) isChecked = false;
        else isChecked = true;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isIsChecked() {
        return isChecked;
    }

    public void setName(String name) {
        this.name = checkName(name);
    }

    public void setQuantity(int quantity) {
        if(quantity > 0) this.quantity = quantity;
    }
    
    public String getInformation()
    {
        String teste = "";
        teste = name + ", " + quantity + " " + booleanToText(isChecked);
        return teste;
    }
    
    public String booleanToText(boolean bool)
    {
        if(bool) return "(X)";
        return "";
    }
    
     public void increaseUnits(int amount)
    {
        quantity += amount;
    }
    
}
