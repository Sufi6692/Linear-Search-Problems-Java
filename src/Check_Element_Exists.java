import java.util.Arrays;
import java.util.Scanner;

public class Check_Element_Exists {
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
        System.out.print("Enter your target number in array: ");
        int key = input.nextInt();
        boolean ans =FindElement(array,key);
        if (ans){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

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
    static boolean FindElement(int[]array,int target){
         boolean ans = false;
        for (int i = 0; i < array.length; i++) {
            if (target==array[i]){
                ans = true;
                return ans;


            }
        }
        return ans;
    }
}
