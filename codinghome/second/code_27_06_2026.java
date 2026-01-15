package second;

public class code_27_06_2026 {
   public static void main(String[] args) {
    

    int num[]={56,23,5,3,5,7,9,4};
    int count=0;
    for(int i=0;i<num.length;i++){
        for( int j=0;j<num.length;j++){
if(num[i]>num[j]  &&  j>6){
    count++;
}
        }
    }
System.out.println(count);
        
   } 
}
