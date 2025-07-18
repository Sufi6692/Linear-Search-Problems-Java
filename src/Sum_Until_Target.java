import java.util.Arrays;
import java.util.Scanner;

public class Sum_Until_Target {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a size of array : ");
        int n = input.nextInt();
        int[]array = new int[n];
        ArrayInput(array,input);
        ArrayOutput(array);
        System.out.print("Enter a target : ");
        int target = input.nextInt();
        SumUntilTarget(array,target);
        input.close();
    }
   static void ArrayInput(int[]array,Scanner input){
       for(int i = 0; i < array.length; i++) {
           System.out.print("Enter a element at index "+i+" : ");
           array[i]=input.nextInt();

       }
   }
   static void ArrayOutput(int[]array){
       System.out.println(Arrays.toString(array));
   }

    static void SumUntilTarget(int[] array, int target) {
        int sum = 0;
        for(int j : array) {
            sum += j;
            if (j == target) {
                System.out.println("Sum until target is found: " + sum);
                return;
            }
        }
        System.out.println("Target not found in the array.");
    }
}
