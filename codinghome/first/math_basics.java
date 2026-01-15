import java.util.*;
public class math_basics {
    // public static boolean armstrong(int n){
    //     int r=n;
    //     int sum=0;
    //     while(n>0){
    //         int y=n%10;
    //         sum+=y*y*y;
    //         n=n/10;
    //     }
    //       if(sum==r){
    //     return true;
    // }
    // return false;
    // }
    public static int  fibonaaciele(int  n){
        int f=0;
        int s=1;
        int i;
        int t=0;
        for( i=1; i<n;i++){
          t= f+s;
         f=s;
         s=t;
        //  if(i==n-1){
            //  System.out.print(t);
            //  break;
             
        //  }/
    
        }
      
return t;
    }
    public static void main(String[] args) {

//       Scanner sc= new Scanner(System.in);
//         int samester= sc.nextInt();
//         int arr[]= new int[samester];

//          int sub= sc.nextInt();
//         for(int i=0; i<samester;i++){
//             // int sub= sc.nextInt();
//             int min=0;
//             while(sub>0){
                
//                 int marks= sc.nextInt();
//                 if(marks>min){
//                     min= marks;
// arr[i]=min;
// sub--;
//                 }
                
//             }
//             // System.out.println(min+"  ");
            
//         }

// for(int i=0; i<arr.length;i++){
//     System.out.println(arr[i]);
// }









// int n= 5;
//  int r= fibonaaciele(n);
//  System.out.println(r);

// int n=153;
// boolean b= armstrong(n);
// System.out.println(b);

//         Scanner sc= new Scanner(System.in);
//         int n1= sc.nextInt();
//         int n2= sc.nextInt();

//         int on1=n1;
//         int on2=n2;

//         while(n1%n2!=0){
// int rem = n1%n2;
// n1=n2;
// n2= rem;

//         }

// int gcd=n2;
// int lcm=(on1*on2)/gcd;


// System.out.println(gcd);
// System.out.println(lcm);


    }
}
