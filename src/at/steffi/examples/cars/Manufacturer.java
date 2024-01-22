package at.steffi.examples.cars;

public class Manufacturer {
    private String Name;
    private String CountryOfOrigin;
    private String Discount;



    public Manufacturer (String Name, String CountryOfOrigin, String Discount) {
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

    public String getDiscount(){
        return Discount;
    }
}
