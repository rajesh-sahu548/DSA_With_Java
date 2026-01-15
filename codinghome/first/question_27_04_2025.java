public class question_27_04_2025 {
    public static int isprime(int n){
        for(int i = 2; i<=Math.sqrt(n); i++){
          if(n%i==0)
            return 0;
        }
        return 1;
     }
     public static void primeFactors(int n)
     {
        for(int i = 2; i<= n; i++){
            if(isprime(i)==1){
               int x = n;
               while(x%i==0){
                  System.out.print(i + " ");
               x=x/i;
               }
            }
         }
     }
    public static void main(String[] args) {
int n=25;
int num;
for(int i=0; i<n;i++){
   int flag=0;;
   for(int j=0; j<n;j++){

 if(n%i!=0){
        flag++;
        
        
    }
   }
}





      //   int n = 100;
      //   primeFactors(n);


//         int num=555;
//         int i= num;
//         int q=0;
//         while(num>0){
//       int  y= num%10;
//            q=q *10+y;
//             num=num/10;

//         }
//         System.out.println(q);
// if(i==q){
//     System.out.println("palin");
// }
// else{
//     System.out.println("not palin ");
// }

//// factorial number  
//    int num =5;
//    int sum=1;
//    for(int i=1 ;i<=num;i++){
//     sum=sum*i;
//    }
//    System.out.println(sum);

/// prime or not 
//  int num=13;
//  int flag=0;
//  for(int i=2;i<num;i++){
//     if(num%i==0){
//         flag++;
//     }
//  }
//  if(flag>=1){
//     System.out.println("not");
//  }
//  else{
//     System.out.println("yes");
//  }

 //
 
 
    }
}
