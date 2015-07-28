import java.util.Comparator;
 
public class compare implements Comparator<Shape>{
 
    @Override
    public int compare(Shape o1, Shape o2) {
        // write comparison logic here like below , it's just a sample
        return o1.compareTo(o2);
    }
}