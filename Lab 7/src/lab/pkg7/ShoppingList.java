
package lab.pkg7;
import java.util.ArrayList;

public class ShoppingList {
    private ArrayList<Product> productList;
    
    public ShoppingList()
    {
        productList = new ArrayList<>();
    }
    
    public void addProduct(String productName)
    {
        for(Product product : productList)
        {
            if(product.getName().equals(productName))
            {
                product.increaseUnit();
                return;
            }
        }
        Product product2 = new Product(productName);
        productList.add(product2);
    }
    
    public String getInformation()
    {
        String teste = "Lista de compras:\n";
        for(Product product : productList)
        {
            teste += product.getInformation() + "\n";
        }      
        return teste;
    }
    
    public void show()
    {
        System.out.println(getInformation());
    }
    
    private boolean checkNumber(int number)
    {
        return (number > -1 && number < productList.size());  
    }
    
    public void removeIndex(int number)
    {
        if(checkNumber(number)) 
        {
            productList.remove(number);
        }
    }
    
    public void changeState(int number)
    {
        if(checkNumber(number)) 
        {
            productList.get(number).inverse();
        }
    }
    
    public void increaseUnit(int number)
    {
        if(checkNumber(number)) 
        {
            productList.get(number).increaseUnit();
        }
    }
    
    public void decreaseUnit(int number)
    {
        if(checkNumber(number)) 
        {
            productList.get(number).decreaseUnit();
        }
    }
    
    public void removeUnchecked()
    {
        for(int i = productList.size()-1; i > -1; i--)
        {
            if(productList.get(i).isIsChecked())
            {
                productList.remove(i);
            }
        }
    }
    
    public int getIndex(String name)
    {
        if(name == null) return -1;
        for(int i = 0; i < productList.size(); i++)
        {
            if(productList.get(i).getName().equals(name)) return i;
        }
        return -1;
    }
    
    public boolean removeByName(String name)
    {
        if(getIndex(name) != -1)
        {
            removeIndex(getIndex(name));
            return true;
        }
        return false;
    }
    
    public boolean changeStateByName(String name)
    {
        if(getIndex(name) != -1)
        {
            changeState(getIndex(name));
            return true;
        }
        return false;
    }
    
    public void importProducts(Product[] products)
    {
        if(products == null || products.length == 0) return;
        for(int i = 0; i < products.length; i++)
        {
            if(getIndex(products[i].getName()) != -1)
            {
                productList.get(getIndex(products[i].getName())).increaseUnits(products[i].getQuantity());
            }
            else
            {
                productList.add(products[i]);
            }
        }
    }
    
    public Product[] exportProducts()
    {
        return (Product[])productList.toArray();
    }
}
