package phones;

public class ScreenSizeTag extends Tag{
    private double screenSize;

    public ScreenSizeTag(double screenSize){
        this.screenSize=screenSize;
    }

    @Override
    public boolean find(Phone phone) {
        return phone.getScreenSize()==screenSize;
    }
}
