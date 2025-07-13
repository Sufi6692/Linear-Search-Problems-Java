import java.util.Arrays;
import java.util.Scanner;

public class MaxFrequency_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = input.nextInt();
        if (n <= 0){
            System.out.println("Please enter a valid array size greater than 0.");
            input.close();
            return;
        }
        int[] array = new int[n];
        ArrayInput(array,input);
        ArrayOutput(array);
        MaxFrequency(array);


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
    static void MaxFrequency(int[]array){

        int maxCount = 0;
        int mostFrequent = -1;
        for (int k : array) {
            int count = 0;
            for (int i : array) {
                if (k == i) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = k;
            }

        }

        System.out.println(mostFrequent + " (" + maxCount + " times)");


    }
}
