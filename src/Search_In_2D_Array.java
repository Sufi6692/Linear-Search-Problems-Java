import java.util.Arrays;
import java.util.Scanner;

public class Search_In_2D_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of an row : ");
        int row = input.nextInt();
        System.out.print("Enter size of an col : ");
        int col = input.nextInt();
        if (row <= 0 || col <= 0) {
            System.out.println("Kindly enter a valid size of an array greater than 0.");
            input.close();
            return;
        }
        int[][] array = new int[row][col];
        ArrayInput(array,input);
        ArrayOutput(array);
        System.out.print("Enter a target Number to search : ");
        int target = input.nextInt();
        FindElementIn2DArray(array,target);

    }
    static void ArrayInput(int[][]array,Scanner input){
        for (int i = 0; i <array.length;i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter element at (" + i + "," + j + "): ");
                array[i][j] = input.nextInt();

            }

        }
    }
    static void ArrayOutput(int[][]array){
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }

    }
    static void FindElementIn2DArray(int[][] array, int target) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    System.out.println("Element found at: " + i + ", " + j);
                    found = true;
                    break;
                }
            }
            if (found) break; // stop after finding once
        }
        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }

}