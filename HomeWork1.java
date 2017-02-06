package Module2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Linkin on 06.02.2017.
 */
public class HomeWork1 {
    public static void main(String[] args) {
        int[] array = {90, -247, 44, 674, 3234, -57, 666, -777, 88, 11};
        double[] doubles = {1.5, -2.554, 5.66, 8.3, 6.66, 7.77, 8.88, 9.99, 100.1, 42.65};
        HomeWork1 s = new HomeWork1();
        s.sum(array);
        s.sum(doubles);
        s.min(array);
        s.min(doubles);
        s.max(array);
        s.max(doubles);
        s.maxPositive(array);
        s.maxPositive(doubles);
        s.multiplication(array);
        s.multiplication(doubles);
        s.secondLargest(array);
        s.secondLargest(doubles);
        s.modulus(array);
        s.modulus(doubles);
    }
    public void sum(int array[]) {
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array[i];
        }
        System.out.println(" SummInt= " + summ);
        ;
    }
    public void sum(double doubles[]) {
        double summ = 0;
        for (int i = 0; i < doubles.length; i++) {
            summ += doubles[i];
        }
        System.out.println(" Summ Double= " + summ);
        ;
    }
    public void min(int array[]) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(" MinInt: " + min);
    }
    public void min(double doubless[]) {
        double min = doubless[0];
        for (int i = 0; i < doubless.length; i++) {
            if (doubless[i] < min) {
                min = doubless[i];
            }
        }
        System.out.println(" MinDouble: " + min);
    }
    public void max(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(" MaxInt: " + max);
    }
    public void max(double doubless[]) {
        double max = doubless[0];
        for (int i = 1; i < doubless.length; i++) {
            if (doubless[i] > max) {
                max = doubless[i];
            }
        }
        System.out.println(" MaxDouble: " + max);
    }
    public void maxPositive(int array[]) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {

            if ((array[i] >= 0) && (array[i] > max)) {
                max = array[i];
            }
        }
                System.out.println(" MaxPositiveInt: " + max);
    }
    public void maxPositive(double doubles[]) {
        double max = 0.0;
        for (int i = 0; i < doubles.length; i++) {

            if ((doubles[i] >= 0) && (doubles[i] > max)) {
                max = doubles[i];
            }
        }
        System.out.println(" MaxPositiveDouble: " + max);
    }
    public void multiplication (int array[]){
        long multi=1;
        for (int i = 0; i <array.length ; i++) {
            multi*=array[i];
        }
        System.out.println(" MultiplicationInt: "+multi);
    }
    public void multiplication (double doubles[]){
        double multi=1;
        for (int i = 0; i <doubles.length ; i++) {
            multi*=doubles[i];
        }
        System.out.println(" MultiplicationDouble: "+multi);
    }
    public void secondLargest (int array[]){
        int max=0;
        int max2=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if ((array[i]>max2)&&(max2<max))
                max2=array[i];
        }
        System.out.println(" SecondLargestInt: "+max2);
    }
    public void secondLargest (double doubles[]){
        double max=0;
        double max2=0;
        for (int i = 0; i <doubles.length ; i++) {
            if (doubles[i] > max) {
                max = doubles[i];
            } else if ((doubles[i]>max2)&&(max2<max))
                max2=doubles[i];
        }
        System.out.println(" SecondLargestDouble: "+max2);
    }
    public void modulus (int array[]){
        int x;
        int z;
        int index=array.length-1;
        x=array[0]%array[index];
        z=(array[index]%array[0]);
        System.out.println(" Modulus of first and last  int element :" +x);
        System.out.println(" Modulus of last and first  int element :" +z);
    }
    public void modulus (double doubles[]){
        double x;
        double z;
        int index=doubles.length-1;
        x=doubles[0]%doubles[index];
        z=(doubles[index]%doubles[0]);
        System.out.println(" Modulus of first and last  double element  :" +x);
        System.out.println(" Modulus of last  and first  double element :" +z);
    }
}