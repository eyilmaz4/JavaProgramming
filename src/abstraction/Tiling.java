package abstraction;

public class Tiling extends Quete {
   private String material;

    public Tiling(String customerName, double totalSQRF, double price, String material) {
        super(customerName, totalSQRF, price);
        this.material = material;
    }

    @Override
    public String toString() {
        return "Tiling{" +
                "material='" + material + '\'' +
                ", customerName='" + customerName + '\'' +
                ", totalSQRF=" + totalSQRF +
                ", price=" + price +
                '}';
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    double calculateTotalPrice(){
        return super.price*super.totalSQRF;
    }
    void printQuete(){
        System.out.println("name:"+super.customerName+"\t"+"sqft:"+super.totalSQRF+"\t"+"price:"+super.price+"\t"+"material:"+this.material);
    }
    public double calMaterialPrice(String material){
       double result=0;
        if(material.equalsIgnoreCase("wood")){
             result=result+calculateTotalPrice()+2.4;
        }
        else if(material.equalsIgnoreCase("tile")){
            result=result+calculateTotalPrice()+1.99;
        }
        else {
            System.out.println("not valid");
        }

        return result;
    }
}
