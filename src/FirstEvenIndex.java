import java.util.Scanner;
public class FirstEvenIndex {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Input array size
            System.out.print("Enter array size: ");
            int n = input.nextInt();

            // Input array elements
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements:");
            for(int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }

            // Find index of first even number
            int index = -1; // -1 indicates not found
            for(int i = 0; i < n; i++) {
                if(arr[i] % 2 == 0) {
                    index = i;
                    break; // stop at first even number
                }
            }

            // Output
            if(index != -1) {
                System.out.println("Index of first even number: " + index);
            } else {
                System.out.println("No even number found.");
            }

            input.close();
        }
    }


