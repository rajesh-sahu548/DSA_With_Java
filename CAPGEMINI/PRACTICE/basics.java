import java.util.*;
public class basics {

    public static void main(String[] args) {

String str = "sillpyspiders";
char[] ch= str.toCharArray();
int y= ch.length;
Map <Character,Integer> map= new HashMap<>();
int i=0;
while(i != y){
if(map.containsKey(ch[i])== false){
	map.put(ch[i], 1);
}
else{
 int oldval= 	map.get(ch[i]);
 int newwal= oldval+1;
 map.put(ch[i], newwal);
}
i++;
}
Set<Map.Entry<Character,Integer>> hmap =map.entrySet();
for(Map.Entry<Character, Integer> data:hmap  ){
	// System.out.print(data.getKey());
	
	// System.out.print(data.getValue());
	// System.out.println();


	if (data.getValue()==1){
		System.out.print(data.getKey());
		break;
	}
System.out.println();

// if(data.getValue()>1){
// 	System.out.print(data.getKey());
// }

}



	}

}
