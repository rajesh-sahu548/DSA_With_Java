package programmerpoint;

import java.util.HashMap;
import java.util.Map;

public class splitt {
public static void main(String[] args) {
  String str = "abcda";
        char ch[] = str.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }









    
//     String s= "my name rajesh sahu";
//     String s1[]=s.split(" ");
// int j=0;
// int size= s1.length;
// for(int  i =size-1; i>=0; i--){
//     // System.out.println(s1[i]);




// }


// String s= "rajesh";
// String t= "RAjesH";
// System.out.println(s.equals(t));
// System.out.println(s.compareTo(t));

// String s= "my name rajesh sahu  and     beco,e";
//  s= s.replaceAll("\\s", "");
// System.out.println(s);

// String a= "rajesh";
// String b="sahu";
// a=a+b;
// b= a.substring(0, a.length()-b.length());
// a= b.substring(b.length());
// System.out.println(a+"  "+ b);


// String s= "rajesh";
// String w="hseraj";
// String newString= s.concat(s);
// if(newString.contains(w)){
// System.out.println("rotationa; ");
// }
// else{
//     System.out.println("non rotational ");
// }


// char c= 'a';
// System.out.println((int)c);


}

}
