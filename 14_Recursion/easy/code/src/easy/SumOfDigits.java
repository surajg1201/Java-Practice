package easy;

public class SumOfDigits {
    public static void main(String[] args) {
        int ans = digiSum(1236);
        System.out.println(ans);
    }
    static int digiSum(int n){
        if(n==0){
            return 0;
        }

        return digiSum(n/10) + n%10;

    }
}
