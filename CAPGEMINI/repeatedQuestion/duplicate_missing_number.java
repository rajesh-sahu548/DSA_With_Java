package repeatedQuestion;
import java.util.*;
public class duplicate_missing_number {
    // static void fun(int arr[], int n){
// Arrays.sort(arr);
//  int sum= ((n+1)*(n+2))/2;
// for(int i=0;i<n;i++){
// sum=sum-arr[i];
// }
// System.out.println(sum);
//     }


 


   
 

    public static void main(String[] args) {

//         int arr[]= {1,2,3,4,5,7};
// int n= arr.length;
// fun(arr, n);
  


// 
int j;

for(int i=1;i<=100;i++){
    for( j=2;j<i;j++){
    if(i%j==0){
        break;
    }

    }
    if(i==j){
System.out.println(i);
} 



// String str = "Hello";

// str = "Bye";

// System.out.println(str);






    
    }
}

