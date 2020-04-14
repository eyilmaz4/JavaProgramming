package classTypes;

public class RetailStoreTest {
    public static void main(String[] args) {
        RetailStore store1=new RetailStore("cookie",200);
     RetailStore store2= new RetailStore("candy", 500);
     store1.showQuantity();
     store2.showQuantity();
     RetailStore.showTotalQuantity();

    }
}
