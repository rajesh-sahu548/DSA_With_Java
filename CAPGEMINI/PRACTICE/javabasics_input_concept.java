import java.util.*;
public class javabasics_input_concept {
    static void fun(int arr[],int t){
        int j=1;
        while(j<=arr.length){
            System.out.println(j);
            j++;
        }
        System.out.println(j);
    }
    
    public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int t= sc.nextInt();
//         int arr[]=new int[t];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
// // fun(arr, t);

//         int j=1;
//         while(j<=t){
//             System.out.println(j);
//             j++;
//         }
    
           //  non reapting string in code 
Scanner sc= new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
String str= sc.next();

String newstr="";
int size= str.length();

for(int i=0; i<size;i++){
    char ch= str.charAt(i);
    if(newstr.indexOf(ch)==-1){
        newstr+=ch;

    }
System.out.println(newstr);
}
// System.out.println(newstr);


}

    }
}
