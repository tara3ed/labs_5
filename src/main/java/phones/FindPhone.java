package phones;
import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FindPhone {
    private List<Phone> data=new PhoneDB().getPhoneData();

    public List<Phone> find(List<Tag> tags) {
        List<Phone> result = new LinkedList<>();
        for (Phone phone : data) {
            boolean matchesAllTags = true;
            for (Tag tag : tags) {
                if (!tag.find(phone)) {
                    matchesAllTags = false;
                    break;
                }
            }
            if (matchesAllTags) {
                result.add(phone);
            }
        }
        return result;
    }

    public List<Phone> byColor(Color col) {
        List<Tag> tags =new ArrayList<>();
        tags.add(new ColorTag(col));
        return find(tags);
    }
    
    public List<Phone> byModel(String mod) {
        List<Tag> tags=new ArrayList<>();
        tags.add(new ModelTag(mod));
        return find(tags);
    }
    
    public List<Phone> byMSize(int memSize) {
        List<Tag> tags = new ArrayList<>();
        tags.add(new MSizeTag(memSize));
        return find(tags);
    }
    
    public List<Phone> byModelAndPriceLow(String mod, double price) {
        List<Tag> tags = new ArrayList<>();
        tags.add(new ModelTag(mod));
        tags.add(new PriceTag(price));
        return find(tags);
    }
    
    public List<Phone> byMSizeAndNotColor(int memSize, Color col) {
        List<Tag> tags = new ArrayList<>();
        tags.add(new MSizeTag(memSize));
        tags.add(new NotTag(new ColorTag(col)));
        return find(tags);
    }

    public List<Phone> byModelAndPriceLowAndColor(String mod, double price, Color color) {
        List<Tag> tags = new ArrayList<>();
        tags.add(new ModelTag(mod));
        tags.add(new PriceTag(price));
        tags.add(new ColorTag(color));
        return find(tags);
    }
}
