package classTypes;

public class RetailStoreArrayTest {
    public static void main(String[] args) {
        String [] products={"Tea","Sugar","Bread"};
        int [] quantities={10, 5, 7};
        RetailStoreArray myStore=new RetailStoreArray(products,quantities);
        myStore.showAll();
        myStore.addQuantity(0,2);
        myStore.showAll();
        myStore.sellQuantity(2,3);
        myStore.showAll();
        myStore.showQuantityOfProduct(0);
        myStore.showQuantityOfProduct("tea");
        myStore.showQuantityOfProduct("bread");
    }
}
