 package repeatedQuestion;

import java.util.Arrays;

class a2b3u2u_arrange{
    static void  fun(int arr[],int n){
int temp;
int temp2;
for(int i=0; i<n;i++){
    if(arr[i]%2==0){
        temp=arr[i];
        // System.out.println(temp);
    }
    else{
        temp2=arr[i];
System.out.println(temp2);
    }
    
}

    }
//    
public static void main(String[] args) {
  int arr[]= {1,2,3,4,5,6,7,8,9,10,11};
  int n= arr.length;
fun(arr, n);

//  prime no or not code

    
}
}