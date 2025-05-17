package phones;

public class PriceTag extends Tag{
    private double maxPrice;

    public PriceTag(double maxPrice){
        this.maxPrice=maxPrice;
    }

    @Override
    public boolean find(Phone phone) {
        return phone.getPrice()<maxPrice;
    }
}
