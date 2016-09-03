package Algo.Sorting.CountSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by Henu Kumar
 */

public class CountSort1 {
    private static int A[];
    private static int SortedArray[];
    private static void CountSort(int N){
        int frequency[]=new int[1001];
        SortedArray=new int[N+1];
        for(int i=1;i<=N;i++){  // Calculates the frequency
            frequency[A[i]]++;
        }
        for(int i=1;i<1001;i++){   // Calculates the number of elements less than or equal to i
            frequency[i]=frequency[i]+frequency[i-1];
        }
        for(int i=N;i>0;i--){
            SortedArray[frequency[A[i]]]=A[i];  // put elements in sorted order in output array
            frequency[A[i]]--;  // decreases the frequency of the elements by one, as one of them is already placed in sorted array
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out);
        System.out.println("Enter the number of elements in the input array:");
        int N = Integer.parseInt(br.readLine());
        A = new int[N+1];
        Random random = new Random();
        for(int i=1;i<=N;i++){
            A[i] = random.nextInt(1000-0);
        }
        System.out.println("Enter the elements of the array:");
        for(int i=1;i<=N;i++){
            System.out.print(A[i]+ " ");
        }
        CountSort(N);
        System.out.println("\nSorted Array:-");
        for(int i=1;i<=N;i++){
            output.print(SortedArray[i] + " ");
        }
        output.flush();
    }
}
