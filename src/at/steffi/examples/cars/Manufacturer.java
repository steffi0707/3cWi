package at.steffi.examples.cars;

public class Manufacturer {
    private String Name;
    private String CountryOfOrigin;
    private double Discount;



    public Manufacturer (String Name, String CountryOfOrigin, double Discount) {
        this.Name = Name;
        this.CountryOfOrigin = CountryOfOrigin;
        this.Discount = Discount;
    }

    public String getName(){
        return Name;
    }

    public String getCountryOfOrigin(){
        return CountryOfOrigin;
    }

    public double getDiscount(){
        return Discount;
    }

    public void setDiscount(double Discount) {
        this.Discount = Discount;
    }
}
