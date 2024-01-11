/*In the context of arrays, the distinction between pass by reference and call by value is significant. In pass by reference, any modifications made within a regular function directly impact 
the original array in the main method. Conversely, in call by value, a duplicate of the value is employed, ensuring that alterations made within the function do not affect the original array in 
the main method.*/

public class ArraysFunctionArguments {
    public static void update(int [] marks,int nonChangable){
        nonChangable = 10;
        for(int i = 0;i < marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void printArray(int [] marks){
        for(int i = 0;i < marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nonChangable = 5;
        System.out.println("Non Changable Pass by Value: "+nonChangable);
        int [] marks ={97, 98, 99};
        printArray(marks);
        update(marks,nonChangable);
        System.out.println("Changable for marks (Pass by reference) ");
        printArray(marks);
    }
}
