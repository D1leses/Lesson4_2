import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int[] arr = new int[50];
        int neg = 0;
        int pol = 0;
        int zero = 0;
        int summaneg = 0;
        int summapol = 0;
        int summa = 0;

        for(int i=0; i<arr.length; i++){
            arr[i] = random.nextInt(101) - 50;

            if(arr[i]<0){
                neg++;
                summaneg+=arr[i];
            }
            if(arr[i]>0){
                pol++;
                summapol+=arr[i];
            }
            if(arr[i]==0){
                zero++;
            }
            summa=summaneg+summapol;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Количество отрицательных чисел:" +neg);
        System.out.println("Количество положительных чисел:" +pol);
        System.out.println("Количество нулей:" +zero);
        System.out.println("Сумма отрицательных чисел:" +summaneg);
        System.out.println("Сумма положительных чисел:" +summapol);
        System.out.println("Среднее по массиву:" +(double)summa/arr.length);
    }
}