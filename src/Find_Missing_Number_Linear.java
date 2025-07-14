import java.util.Arrays;
import java.util.Scanner;

public class Find_Missing_Number_Linear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of N (from 1 to N, including the missing one): ");
        int N = input.nextInt();  // full size including missing number

        if (N <= 1) {
            System.out.println("N must be greater than 1 to have a missing number.");
            input.close();
            return;
        }

        int[] array = new int[N - 1];  // array of size N-1 since one number is missing
        ArrayInput(array, input);
        ArrayOutput(array);
        FindMissingNumber(array, N);
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

    static void FindMissingNumber(int[] array, int N) {
        for (int num = 1; num <= N; num++) {
            boolean found = false;
            for (int j : array) {
                if (j == num) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Missing Number is: " + num);
                return;
            }
        }
        }
    }

