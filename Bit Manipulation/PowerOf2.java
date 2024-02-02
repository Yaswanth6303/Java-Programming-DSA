public class PowerOf2 {
    public static boolean isPowerOfTwo(int n){
        return (n & (n - 1)) == 0; //Then true else false
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(4));
        System.out.println(isPowerOfTwo(5));
    }
}
