package easy;

public class ProductOfDigits {
    public static void main(String[] args) {
        int ans = digiProd(12);
        System.out.println(ans);
    }
    static int digiProd(int n){
        if(n%10==n){
            return n;
        }
        return digiProd(n/10) * n%10;

    }
}
