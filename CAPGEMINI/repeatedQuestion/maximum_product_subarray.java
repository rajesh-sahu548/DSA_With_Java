package repeatedQuestion;

public class maximum_product_subarray {
    public static void main(String[] args) {
        int arr []={1,2,3,4};
        int n= arr.length;
        int max=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

if(arr[i]*arr[j]<max){
    max=arr[i]*arr[j];
    
}
            }
            // System.out.println(max);
        }
        System.out.println(max);
    }
}
