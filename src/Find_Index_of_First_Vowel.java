import java.util.Arrays;
import java.util.Scanner;

public class Find_Index_of_First_Vowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kindly enter an array size  : ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Kindly enter a valid array size greater then 0");
        }

        String[] array = new String[n];

        ArrayInput(array,input);
        ArrayOutput(array);
       int ans =  FindIndexOfFirstVowel(array);
        System.out.println(ans);
    }
    static void ArrayInput(String[]array,Scanner input){

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a char at index "+i+" : ");
            array[i] = input.next();
        }
    }
    static void ArrayOutput(String[]array){
        System.out.println(Arrays.toString(array));
    }
    static int FindIndexOfFirstVowel(String[]array){

        for (int i = 0; i < array.length; i++) {
           if(array[i].equalsIgnoreCase("a")||array[i].equalsIgnoreCase("i")||array[i].equalsIgnoreCase("e")||array[i].equalsIgnoreCase("o")||array[i].equalsIgnoreCase("u")){
               return i;
           }
        }
        return -1;
    }
}
