/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer in Jan 2024
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        
        int number = getInputNumber();
        System.out.println(sumOfNumbers(number));
        System.out.println(gaussianSumOfNumbers(number));
        getGaussianSumOfNumbersRunTime(number);
        getSumOfNumbersRunTime(number);
        System.out.println("Run time of SumOfNumbers is : " + getSumOfNumbersRunTime(number) +
                            " milliseconds. Run time of GaussianSumOfNumbers is : "+ getGaussianSumOfNumbersRunTime(number)+" milliseconds.");
    }
    public static int sumOfNumbers(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    public static int getInputNumber() { // gee, may thi sis useful in another lab?
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = scan.nextInt();
        scan.close();
        return num;
    }
    // for Extra Credit
   public static int gaussianSumOfNumbers(int n) {
        return n*(n+1)/2;
    }

    public static long getSumOfNumbersRunTime(int n) {
        long startTime = System.currentTimeMillis();
        sumOfNumbers(n);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
    public static long getGaussianSumOfNumbersRunTime(int n) {
        long startTime = System.currentTimeMillis();
        gaussianSumOfNumbers(n);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}
