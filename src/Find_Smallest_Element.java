
import java.util.Arrays;
import java.util.Scanner;

public class Find_Smallest_Element {
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
        int smallestNum =FindMin(array);
        System.out.println("Smallest element in array : " +smallestNum);
    }
    static void ArrayInput(int[]array,Scanner input){

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element in array at index "+i+" : ");
            array[i] = input.nextInt();

        }
    }
    static void ArrayOutput(int[]array) {
        System.out.println(Arrays.toString(array));
    }
    static int FindMin(int[]array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return  min;
    }
}
