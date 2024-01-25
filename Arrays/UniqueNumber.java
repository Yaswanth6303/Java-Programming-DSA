import java.util.Scanner;

public class UniqueNumber {
    public static int findUnique(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[i] = array[j] = -1;
                }
            }
        }
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                answer = array[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Unique Element is: " + findUnique(array));
    }
}
