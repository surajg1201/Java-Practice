package ArraysAndHashing;
import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int []nums= {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}