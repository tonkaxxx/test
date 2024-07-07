import java.util.*;

public class faangCombineTwoArr {
    public static void main(String[] args) throws IllegalArgumentException {
        int[] arr1 = {1, 2, 3, 0, 0, 0, 0};
        int[] arr2 = {4, 5, 6, 7, 0, 0, 0};
        Set<Integer> nums1 = new TreeSet<>();
        Set<Integer> nums2 = new TreeSet<>();
        
        for (int num : arr1) {
            nums1.add(num);
        }
        
        for (int num : arr2) {
            nums2.add(num);
        }
        
        System.out.println(nums1); 
        System.out.println(nums2); 
        nums1.addAll(nums2);
        System.out.println("answer   ->    "+nums1);
        System.out.println(nums2); 
    }
}
