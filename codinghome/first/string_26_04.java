// package first;
import java.util.*;
public class string_26_04 {
    public static void main(String[] args) {
        String str="abc123bbb4sbf";

 
char ch[]=str.toCharArray();
int sum=0;
for(int i=0; i<ch.length;i++){
    if(ch[i]>='0' && ch[i]<='9'){
// int y= ch[i]-'0';
int y= (int ) ch[i];
sum+=y;
    }
}
System.out.println(sum);



// for(int i=0; i<str.length();i++){
//     if(Character.isDigit(ch[i])){
//         // int y =Integer.parseInt(String.valueOf(ch[i]));
//   int y =Integer.parseInt(ch[i]);
//         sum+=y;
//     }
    

// }


// System.out.println(sum);



/////////
//  String str="my name is rajesh sahu";
//  String word[]=str.split(" ");
//  String largestword="";
//  for(int  i=0; i<str.length();i++){
//     if(word[i].length()>largestword.length()){
//         largestword=word[i];

//     }

    
//  }
// System.out.println(largestword);

    





    }
}