public class ModularExponentiation {
    public static int modularExponentiation(int a,int n,int x){ //a^n
        int ans = 1;

        while (n > 0){
            if ((n & 1) != 0){ //Check LSB
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans % x;
    }
    public static void main(String[] args) {
        System.out.println(modularExponentiation(2, 5,13));
    }
}
