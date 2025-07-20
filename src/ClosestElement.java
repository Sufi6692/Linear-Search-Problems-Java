import java.util.Arrays;
import java.util.Scanner;

public class ClosestElement {
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

        int closest = ClosestElem(array, target);
        System.out.println("Closest element to " + target + " is: " + closest);

        input.close();
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

    static int ClosestElem(int[] array, int target) {
        int closest = array[0];
        int minDiff = Math.abs(array[0] - target);

        for (int i = 1; i < array.length; i++) {
            int currentDiff = Math.abs(array[i] - target);

            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                closest = array[i];
            }
        }
        return closest;
    }
}
