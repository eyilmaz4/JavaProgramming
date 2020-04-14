package abstraction;

abstract class Quete {
     String customerName;
     double totalSQRF;
     double price;

    public Quete(String customerName, double totalSQRF, double price) {
        this.customerName = customerName;
        this.totalSQRF = totalSQRF;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Quete{" +
                "customerName='" + customerName + '\'' +
                ", totalSQRF=" + totalSQRF +
                ", price=" + price +
                '}';
    }

    abstract double calculateTotalPrice();

     abstract void printQuete();

}
