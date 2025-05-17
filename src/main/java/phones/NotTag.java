package phones;

public class NotTag extends Tag{
    private Tag condition;

    public NotTag(Tag condition){
        this.condition=condition;
    }

    @Override
    public boolean find(Phone phone) {
        return !condition.find(phone);
    }
}
