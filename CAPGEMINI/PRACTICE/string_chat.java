import java.util.*;
public class string_chat {
    static void move(String n, int len){
String s1="";
String s2="";
// String r="@";
for(int i=0;i<len;i++){
    if(n.charAt(i)=='#') {
        // s1=s1+n.charAt(i);
        s1=s1+"@";
    }
    else{
        s2=s2+n.charAt(i);
    }
}
String s3=s1.concat(s2);
System.out.println(s3);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    String n=sc.nextLine();
    int len=n.length();
    move(n, len);

// int arr[][]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
// for(int i=0;i<5;i++){
//     for(int j=0;j<3;j++){
//         System.out.print(arr[0][1]);
//         break;
//     }
//     break;
//     // System.out.println();
// }



    }
}
