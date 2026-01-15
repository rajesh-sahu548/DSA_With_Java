import java.util.*;

public class prime_vowel_count {
    public static void main(String[] args) {
     //    fibonacci
//          int n=7;
//          int a=0;
//          int b=1;
//          int c=0;
//          int even=0;
//          int odd=0;
//          System.out.print(0+" ");
//          System.out.print(1+" ");
//          for(int i=2; i<n;i++){
//          c=a+b;

//          System.out.print(c+" ");
//             a=b;
//             b=c;
//             if(c%2==0){
//                 even++;
//             }
//             else{
//                 odd++;
//             }
//          }
//          System.out.println();
// System.out.println(even+1);
// System.out.println(odd+1);


/// vowel count
 String str="hello welcome";

 int aa=0,ee=0,ii=0,oo=0,uu=0;
//  String e="aeiou";
 char c[]= str.toCharArray();

 LinkedHashMap<Character,Integer> map= new LinkedHashMap<>();

 for(int i=0; i<str.length();i++){

map.put(c[i],map.getOrDefault(c[i], 0)+1);


//     if(str.charAt(i)=='a'){
//         aa++;
//         map.put('a',aa);
//     }

//  if(str.charAt(i)=='e'){
//         ee++;
//         map.put('e',ee);
//     }
    
//     if(str.charAt(i)=='i'){
//         ii++;
//         map.put('i',ii);
//     }
//      if(str.charAt(i)=='o'){
//         oo++;
//         map.put('o',oo);
//     }
    
//     if(str.charAt(i)=='u' ){
//         uu++;
//         map.put('u',uu);
//     }
// else{
//     if(aa==0){
//         map.put('a', 0);
//     }
// if(ee==0){
// map.put('e', 0);
// }
// if(ii==0){
//     map.put('i', 0);
// }
// if(oo==0){
// map.put('o', 0);
// }
//    if(uu==0){
// map.put('u', 0);
//    }


//  }

    }


    for(Map.Entry<Character,Integer> entry: map.entrySet()){
        // System.out.println(entry.getKey()+":"+entry.getValue());

if(entry.getKey()=='o' && entry.getKey()=='e'&&  entry.getKey()=='a'){

             System.out.println(entry.getKey()+":"+entry.getValue());

}


        
         }



}
}