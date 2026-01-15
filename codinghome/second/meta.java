package second;
import java.util.*;

import javax.swing.SpringLayout;
public class meta {
    public static int num(int n){
        if(n<=0){
            return 1;
        }
        else{
        return     n*num(n-1);
        }
    }
 public static void main(String[] args) {
// System.out.println(num(4));

    Scanner sc= new  Scanner(System.in);
    int t= sc.nextInt();
    int c=0;
    for(int i=1;i<=t;i++){
if(i%2==0 && i%4==0&& i%8==0 && i%10 !=0){
    c++;
    System.out.print(i+" ");
}
 } 
 System.out.println(c);  





}
}