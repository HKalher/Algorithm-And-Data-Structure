package Algo.Sorting.QuickSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by Henu Kumar
 */
// Using first element as pivot
public class QuickSort1 {
    private static int A[];
    private static int Swap(int a, int b){
        return a;
    }
    private static int Partition(int start, int end){
        int i=start+1;
        int pivot_element=A[start];
        for(int j=start+1;j<=end;j++){
            if(A[j]<pivot_element){
                A[j]=Swap(A[i],A[i]=A[j]);
                i++;
            }
        }
        A[i-1]=Swap(A[start],A[start]=A[i-1]);
        return i-1; // returning the position of pivot
    }
    private static void QuickSort(int start, int end){
        if(start<end){
            int pivot_position = Partition(start,end);
            QuickSort(start,pivot_position-1);  // for the first half
            QuickSort(pivot_position+1,end);    // for the second half
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out);
        System.out.println("Enter the number of elements in the array");
        int N = Integer.parseInt(br.readLine());
        A = new int[N+1];
//        System.out.println("Enter the input elements");
//        String input[] = br.readLine().split(" ");
//        for(int i=1;i<=N;i++){
//            A[i] = Integer.parseInt(input[i-1]);
//        }
        System.out.println("Enter the elements of the array");
        Random random = new Random();
        for(int i=1;i<=N;i++){
            A[i] = random.nextInt(1000-0);
            System.out.print(A[i]+" ");
        }
        int start=1,end=N;
        QuickSort(start,end);
        output.println("\nSorted Array:-");
        for(int i=1;i<=N;i++){
            output.print(A[i] + " ");
        }
        output.flush();
    }
}
