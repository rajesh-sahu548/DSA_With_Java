
package repeatedQuestion;

import java.util.Scanner;

public class find_total_sum {
    static int find(int n,int arr [],int p){
        int t=0;
        for(int i=p-1;i<p+1;i++){
            int diff=Math.abs(arr[i]-arr[i+1]);
            t+=diff;
        }
        return t;
    }
    public static void main(String[] args) {
//          Scanner sc= new Scanner(System.in);
//         int t= sc.nextInt();
//         int arr[]=new int[t];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
// int n= sc.nextInt();
//  int p=find(n, arr, n);
// System.out.println(p);


// for(int i=0;i<arr.length;i++){
// int i=0;
// while(i<=t){
//     if(i==n){
//       int sum=  arr[i]-arr[i-1];
//       int yum=arr[i+1]-arr[i];
//       int u= sum+yum;
//       System.out.println(u);
//     }
    
//     else{
//         System.out.println("invalid");
//         break;
//     }
// i++;
// }


int sum=0;

int arr[]= {2,20,34,34,45,6};
int max= 0;
for( int i=0; i<arr.length-1;i++){
    int diff= Math.abs(arr[i]-arr[i+1]);
// sum+=diff;
if (diff>max){
    max= diff;
}
}

// System.out.println(sum);
System.out.println(max);






    }
}
