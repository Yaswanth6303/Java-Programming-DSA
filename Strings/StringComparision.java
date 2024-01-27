public class StringComparision {
    public static void main(String[] args) {
        String s1 = "Yaswanth";
        String s2 = "Yaswanth";
        String s3 = new String("Yaswanth");
        if (s1 == s2){
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }

        if (s1 == s3){
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }

        if (s1.equals(s3)){
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }
    }
}
