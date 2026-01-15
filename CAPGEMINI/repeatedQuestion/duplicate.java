package repeatedQuestion;
import java.util.*;
public class duplicate {
    // static boolean dup(int arr[]){
    
    //     for(int i=0;i<arr.length-1;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i]==arr[j]){
    //             return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

static void fu(int arr[],int m){
    Arrays.sort(arr);
    for(int i=0;i<m;i++){
         int y=arr[m-1]-arr[0];
         System.out.println(y);
         break;
    }
System.out.println();
}

    public static void main(String[] args) {
        // largest and smallest element print 
int arr[]={7,3,2,4,9,12};
int m=5;
fu(arr, m);




    // Scanner sc= new Scanner(System.in);
//     int n= sc.nextInt();
//     int arr[]=new int[n];
// for(int i=0;i<n;i++){
//     arr[i]=sc.nextInt();
// }
//   boolean y=dup(arr);
//   System.out.println(y);





    }
}
