import java.util.Arrays;
import java.util.Scanner;

public class SecondOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Kindly enter a valid array size greater than 0.");
            input.close();
            return;
        }

        int[] array = new int[n];
        ArrayInput(array, input);
        ArrayOutput(array);

        System.out.print("Enter a target number: ");
        int target = input.nextInt();

        SecondOccurrenceElem(array,target);
    }
    static void ArrayInput(int[] array, Scanner input) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array[i] = input.nextInt();
        }
    }

    static void ArrayOutput(int[] array) {
        System.out.println("Your array: " + Arrays.toString(array));
    }

    static void SecondOccurrenceElem(int[]array,int target){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==target){
                count++;
                if (count==2){
                    System.out.println("Second occurrence of " + target + " is at index: " + i);
                    return;
                }
            }
        }

// If loop completes and second occurrence not found
        System.out.println("Second occurrence of " + target + " not found.");
    }
}
