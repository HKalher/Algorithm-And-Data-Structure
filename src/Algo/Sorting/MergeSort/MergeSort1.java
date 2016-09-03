package Algo.Sorting.MergeSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.Instant;
import java.util.Date;
import java.util.Random;
import java.util.Timer;

public class MergeSort1 {
    private static int A[];
    private static void merge(int start,int end,int mid){   // function to merge the partitioned array
        int temp[] = new int[end-start+1]; //Auxillary array
        int a=start, b=mid+1, index=0;
        for(int i=start;i<=end;i++){    // stores the elements in auxillary array in sorted order
            if(a>mid){  // check if the first part comes to an end or not
                temp[index++] = A[b++];
            }else if(b>end){    // check if second part comes to an end or not
                temp[index++] = A[a++];
            }else if(A[a]>A[b]){    // check which part has smaller element
                temp[index++] = A[b++];
            }else {
                temp[index++] = A[a++];
            }
        }
        index = 0;
        for(int i=start;i<=end;i++){    // copies the element from auxillary array to original array
            A[i] = temp[index++];
        }
    }

    private static void merge_sort(int start,int end){
        if(start < end){
            int mid = (start + end)/2;
            merge_sort(start,mid);  // for first part
            merge_sort(mid+1,end);  // for second part
            merge(start,end,mid);   // to merge
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
        Random random = new Random();
        for(int i=1;i<=N;i++){
            A[i]=random.nextInt(100000-0);
        }
        System.out.println("Enter the input elements");
        for(int i=1;i<=N;i++){
            System.out.print(A[i]+" ");
        }
        int start=1,end=N;
        long starttimer = System.currentTimeMillis();
        merge_sort(start,end);
        long stoptimer = System.currentTimeMillis();
        output.println("\nSorted Array:-");
        for(int i=1;i<=N;i++){
            output.print(A[i] + " ");
        }
        output.flush();
        long Elapsed=stoptimer-starttimer;
        System.out.println("\nElapsed Time "+ Elapsed);
    }
}
