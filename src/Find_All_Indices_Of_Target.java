
import java.util.Arrays;
import java.util.Scanner;

public class Find_All_Indices_Of_Target {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Kindly enter array size ");
        int n = input.nextInt();
        if (n<=0){
            System.out.println("Kindly enter a valid array size greater than 0. ");
            input.close();
            return;
        }
        int[] array = new int[n];
        ArrayInput(array,input);
        ArrayOutput(array);
        System.out.print("Kindly enter a target number : ");
        int target = input.nextInt();
        FindAllIndices(array,target);
        input.close();

    }
    static void ArrayInput(int[]array,Scanner input){
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a element at index "+i+" : ");
            array[i] = input.nextInt();
        }
    }
    static void ArrayOutput(int[]array){
        System.out.println(Arrays.toString(array));
    }
    static void FindAllIndices(int[] array, int target) {
        System.out.print("Target found at indices: [");
        boolean first = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(i);
                first = false;
            }
        }
        System.out.println("]");
    }

}
