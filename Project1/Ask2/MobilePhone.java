public class MobilePhone {
    private String Brand;
    private double price;

    MobilePhone(String Brand , double price) {
        this.Brand = Brand;
        this.price = price;
    }
    
    public String getBrand() {
        return this.Brand;
    }

    public double getPrice() {
        return this.price;
    }

    public void setBrand(String newBrand) {
        this.Brand = newBrand;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    
}