package classTypes;

public class RetailStoreArray {
    private String[] products;
    private static int totalQuantity;
    private int[] quantities;

    public RetailStoreArray(String[] products, int[] quantities) {
        this.products = products;
        this.quantities = quantities;
        int result = 0;
        for (int i = 0; i < this.quantities.length; i++) {
            result += this.quantities[i];
        }
        totalQuantity = result;
    }
// with index number
    public void addQuantity(int index, int quantity) {
        this.quantities[index] += quantity;
    }
// with product name
    public void addQuantity(String productName, int quantity) {
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i].equalsIgnoreCase(productName)) {
                this.quantities[i] += quantity;
            }
        }
    }
//with index number
        public void sellQuantity ( int index, int quantity){
            this.quantities[index] -= quantity;
        }
// with product name
        public void sellQuantity(String productName,int quantity){
            for (int i = 0; i < this.products.length; i++) {
                if (this.products[i].equalsIgnoreCase(productName)) {
                    this.quantities[i] -= quantity;
                }
            }
        }
        public void showQuantityOfProduct ( int index){
            System.out.println(this.products[index] + ": " + this.quantities[index]);
        }
// with product name
    public void showQuantityOfProduct (String product){

        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i].equalsIgnoreCase(product)) {
                System.out.println(this.products[i] + ": " + this.quantities[i]);

            }
        }
    }
        public void showAll () {
            System.out.println();
            System.out.println("----------------------------------");
            for (String pros:this.products) {
                System.out.format("%s \t\t", pros);
            }
            System.out.println();
            for (int quos:this.quantities) {
                System.out.format("%d \t\t\t", quos);
            }
            System.out.println();
            System.out.println("----------------------------------");
        }

    }
