package repeatedQuestion;

public class kth_position {


    public static void main(String[] args) {
    int arr[]={5,8,2,7,6,1,4};
    int k=3;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
            
        
        }

        if(i==k){
            System.out.println(arr[i]);
            



     
    }


}



// for(int i=0;i<arr.length;i++){
//     System.out.print(arr[i]+ " ");
// }









    }
}
