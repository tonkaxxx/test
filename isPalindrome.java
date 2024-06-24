
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class isPalindrome{
    public static void main(String[] args) {
        String s = "asdvba";
        List<Character> list = new LinkedList<>();
        for (char ch: s.toCharArray()){
            list.add(ch);
        }
        ListIterator<Character> fiter = list.listIterator();
        ListIterator<Character> biter = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (fiter.hasNext()&&biter.hasPrevious()){
            if (fiter.next()!=biter.previous()){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome==true){
            System.out.println("pal");
        } else {System.out.println("fake");}
    }
}
