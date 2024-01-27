public class SubString {
    public static String subString(String str,int startIndex,int endIndex){
        String subStr = "";
        for (int i = startIndex;i < endIndex;i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(subString(str,0,5));
        System.out.println(str.substring(5,10));
    }
}
