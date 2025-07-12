import java.util.Arrays;
import java.util.Scanner;

public class Count_Occurrences_In_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int n = input.nextInt();
        if(n<=0){
            System.out.println("Enter a valid size of an array");
            input.close();
            return;
        }
        int[] array = new int[n];
        InputArray(array,input);
        PrintArray(array);
        System.out.print("Enter a element you want to count : ");
        int key = input.nextInt();
       int count = CountOccurrencesInArray(array,key);
        if (count == 0) {
            System.out.println("The number " + key + " does not exist in the array.");
        } else {
            System.out.println("The number " + key + " occurs " + count + " times.");
        }

        input.close();


    }

    static void InputArray(int[]array,Scanner input){

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter array element at index "+i+" : ");
            array[i] = input.nextInt();
        }
    }
    static void PrintArray(int[]array){
        System.out.println(Arrays.toString(array));
    }
    static int CountOccurrencesInArray(int[]array,int key){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (key==array[i]){
                count++;

            }
        }
        return count;
    }
}
