import java.util.Scanner;

public class lastOccurence {
    public static int lastOccurences(int [] array, int x){
        int index = -1;
        for (int i = 0;i < array.length;i++){
            if(array[i] == x){
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements");
        int [] array = new int[n];
        for (int i = 0;i < array.length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("The Index of Last Occurence is: " + lastOccurences(array, x ));
    }
}
