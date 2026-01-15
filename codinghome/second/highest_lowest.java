package second;
import java.util.*;
public class highest_lowest {

    //  System.out.println(re+ sum);
public static void main(String[] args){
// Scanner sc= new Scanner(System.in);
// int t= sc.nextInt();


// String re=" ";
// int sum=0;
// for(int i=0; i<t;i++){
//     String  name= sc.next();
//     int age = sc.nextInt();
//     char ch= sc.next().charAt(0);
//     String gen= sc.next();


//     if(age >20){
// re=name;
//     }


//     if(gen.equals("female")){
// int r= (int) ch;
// sum+=r;
//     }
// }
// System.out.println(sum);



















    // Scanner sc= new Scanner(System.in);
//     int t= sc.nextInt();
//     int arr[]=new int[t];
//     for(int i=0; i<t;i++){
//         arr[i]=sc.nextInt();
//     }
//     int max=100;
//     int min=-1;
//     for(int i=0;i<t;i++){
//         if(arr[i]>min){
//             min=arr[i];
//         }

//          if(arr[i]<max){
// max=arr[i];

//         }
//     }
//     System.out.println(max+" "+ min);


///// majority element 
 Scanner sc= new Scanner(System.in);
 int t= sc.nextInt();
 int arr[]= new int[t];
 for(int i=0; i<t;i++){
arr[i]= sc.nextInt();
 }

  HashMap< Integer ,Integer>map= new HashMap<>();
          for(int i=0; i<arr.length;i++){
            // if(map.containsKey(arr[i])){
           map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

        //   }
        }
         

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
    ////   remove duplicate element 
    if(entry.getValue()>t/2){
    
        System.out.println( entry.getKey());
        break;
    }
// if(entry.getValue()>1){
//     System.out.println( entry.getKey());
// }
// else{
//     System.out.println(-1);
// }

}





}

}
