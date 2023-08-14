package objects;

public class PayObject {

    private int standardPrice;
    private int tax;

    public PayObject(int standardPrice, int tax) {
        this.standardPrice = standardPrice;
        this.tax = tax;
    }

    public int getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(int standardPrice) {
        this.standardPrice = standardPrice;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }
}
