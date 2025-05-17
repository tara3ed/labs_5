package phones;

public class ModelTag extends Tag{
    private String model;

    public ModelTag(String model){
        this.model=model;
    }

    @Override
    public boolean find(Phone phone){
        return phone.getModel().equalsIgnoreCase(model);
    }
}
