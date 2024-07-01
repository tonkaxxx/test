import java.util.*;
 
public class arlist {
   
    public static void main(String[] args)
    {
        PriorityQueue<String> names = new PriorityQueue<>();
        List<String> arnames = new ArrayList<>();
        names.add("one");
        names.add("two");
        names.add("the");
        for (String s : names) {
            arnames.add(s);
        }
        arnames.add("asfas");
        System.out.println(arnames);
    }
    
}