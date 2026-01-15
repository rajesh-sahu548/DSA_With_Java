package repeatedQuestion;

public class loop2_loop3 {
    public static boolean fun(int arr[], int r){
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]+arr[j]== r){
                    // System.out.println("true");
                    return true;
                
                }
                break;
            }
        }
        return false;
    }
    public static void main(String[] args) {
      
    int arr[] ={ 1,2,3,4,5,6,7};
    int r= 9;
     boolean u= fun(arr, r);

System.out.println(u);






    }
}
