import java.util.*;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in nums1: ");
        int n1 = scanner.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter the elements of nums1:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of elements in nums2: ");
        int n2 = scanner.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter the elements of nums2:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = scanner.nextInt();
        }
        NextGreaterElement solution = new NextGreaterElement();
        int[] result = solution.nextGreaterElement(nums1, nums2);
        System.out.println("Next Greater Elements: " + Arrays.toString(result));
        scanner.close();
    }
}