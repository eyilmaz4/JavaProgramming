package classTypes;

public class RetailStore {
   private String product;
    private static int totalQuantity;
    private int  quantity;

    public RetailStore(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        totalQuantity+=this.quantity;
    }
    public void receiveQuantity(int quantity){
        this.quantity+=quantity;
        this.totalQuantity+=quantity;
    }
    public void sellQuantity(int quantity){
        this.quantity-=quantity;
        totalQuantity-=quantity;
    }
    public void showQuantity(){
        System.out.println("this product has amount of : "+this.quantity);
    }
    public static void showTotalQuantity(){
        System.out.println("Total quantity is: "+totalQuantity);
    }
}
