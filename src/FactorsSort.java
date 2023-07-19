import java.util.Arrays;
import java.util.Scanner;

public class FactorsSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[] array= new int[n];

        for(int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }
        for (int i=0;i<n-1;i++) {
            for (int j=0;j<n-i-1;j++) {
                if (countFactor(array[j])>countFactor(array[j+1])) {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }

    static int countFactor(int number) {
        int count=0;
        for(int i=1;i<Math.sqrt(number);i++){
            if(number%i==0){
                count++;
            }
        }
        return count;
    }

}