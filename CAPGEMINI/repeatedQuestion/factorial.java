package repeatedQuestion;

public class factorial {
    static String helper(String str,int n){
        int sum=0;
        
        String ans="";
        for(int i=1;i<n;i+=2){
            sum+=str.charAt(i);
            if(sum>=n){
                ans+=str.charAt(i-1);
                return ans;
            }
            
        }
        return "-1";
    }
    
    public static void main(String[] args) {

String str="a2b3c3";
int n=6;
 System.out.println(helper(str, n));





        // int sum=1;
        // int n=5;
        // for(int i=0;i<=n;i++){
        //     sum*=i;
        // }
        // System.out.println(sum);



    }
}
