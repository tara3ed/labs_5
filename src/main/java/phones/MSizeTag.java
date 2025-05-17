package phones;

public class MSizeTag extends Tag{
    private int memorySize;

    public MSizeTag(int memorySize){
        this.memorySize=memorySize;
    }

    @Override
    public boolean find(Phone phone) {
        return phone.getMemorySize()==memorySize;
    }
}
