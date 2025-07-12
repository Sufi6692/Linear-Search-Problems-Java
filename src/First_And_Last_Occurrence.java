import java.util.Arrays;
import java.util.Scanner;

public class First_And_Last_Occurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = input.nextInt();
        if (n < 0){
            System.out.println("Kindly enter valued size of an greater than 0.");
            input.close();
            return;
        }
        int[] array = new int[n];
        ArrayInput(array,input);
        ArrayOutput(array);
        System.out.print("Enter your target number in array: ");
        int key = input.nextInt();
        FirstAndLastOccurrence(array,key);
        input.close();

    }
    static void ArrayInput(int[]array,Scanner input){

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element in array at index "+i+" : ");
            array[i] = input.nextInt();

        }
    }
    static void ArrayOutput(int[]array){
        System.out.println(Arrays.toString(array));
    }
    static void FirstAndLastOccurrence(int[] array, int key) {
        int first = -1;
        int last = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                if (first == -1) {
                    first = i; // Store first occurrence
                }
                last = i; // Keep updating last occurrence
            }
        }

        if (first == -1) {
            System.out.println("The number " + key + " is not found in the array.");
        } else {
            System.out.println("First occurrence of " + key + " is at index: " + first);
            System.out.println("Last occurrence of " + key + " is at index: " + last);
        }
    }

}
