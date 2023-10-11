import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int[] array= new int[500-a+1];
        array[0]=a;
        int sum=array[0];

       for(int i=1;i<array.length;i++) {

           array[i] = array[i - 1] + 1;
           sum += array[i];
       }

           System.out.println(sum);

       }
    }

