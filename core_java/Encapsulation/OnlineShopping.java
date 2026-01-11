public class OnlineShopping{

    public static void main(String[] args){

        ShoppingCart s1 = new ShoppingCart(2);

        s1.addItems(3);

        s1.removeItems(1);

        s1.display();

    }
}
class ShoppingCart{

    private int itemCount;

    ShoppingCart(int itemCount){
        this.itemCount = itemCount;
    }

    public void addItems(int count){

        if(count > 0){
            itemCount += count;
        }
        else{
            System.out.println("Adding new items should more than zero");
        }

    }

    public void removeItems(int count){
        
        if(itemCount - count > 0){
            itemCount -= count;
        }
        else{
            System.out.println("Removing Items should <= items in cart!");
        }

    }

    public void display(){
        System.out.println("Total Items in Cart: " + itemCount);
    }
}