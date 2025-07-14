
import java.util.Arrays;
import java.util.Scanner;


public class Check_If_Array_Is_Sorted {
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
        CheckIfArrayIsSorted(array);
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
    static void CheckIfArrayIsSorted(int[]array) {

        boolean ans = true;
        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] > array[i + 1]) {
                ans = false;
                break;

            }
        }
        if (ans) {
            System.out.println("Array is sorted");
        } else {

            System.out.println("Array is not sorted");
            System.out.println("Array sorted would be look like this : ");
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
        }

    }
}

