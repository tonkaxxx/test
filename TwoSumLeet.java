import java.util.ArrayList;
import java.util.Iterator;

class TwoSumLeet {
    public static void main(String[] args) {
        int target = 9; 
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);     //0
        nums.add(2);     //1
        nums.add(3);     //2
        nums.add(4);     //3
        nums.add(5);     //4
        nums.add(6);     //5
        nums.add(7);     //6
        nums.add(8);     //7
        nums.add(9);     //8
        nums.add(10);    //9
        System.out.println(nums);
        nums.toString();
        System.out.println();
        Iterator<Integer> it = nums.iterator();
        boolean isEnded = false;
        int j = nums.size();
        while(it.hasNext()){
            for (int i=0;i<j;i++){
                nums.get(i);
                for (int n=0;n<j&&n!=i;n++){
                    nums.get(n);
                    if (i+n==target){
                        System.out.println(i+", "+n);
                        isEnded = true;
                    }
                }
                if (isEnded == true){break;}
                else {System.out.println("still running");}
            }
        }
    }

    @Override
    public String toString() {
        return "TwoSumLeet []";
    }
}