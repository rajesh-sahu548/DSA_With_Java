import java.util.ArrayList;
import java.util.Scanner;

// import org.jcp.xml.dsig.internal.SignerOutputStream;

public class minute {
    public static void main(String[] args) {
//         int num[]={45,15,30,30,68};
//         int sum=0;
//         for(int i=0; i<num.length;i++){
//             sum+=num[i];
//         }
//     int y =sum/60;

//     int u = sum%60;

// System.out.println("hours"+y+" "+"minute"+u);






////   array list concept 
  
        
        
//         ArrayList<Integer> numbers = new ArrayList<>();

        
//         Scanner scanner = new Scanner(System.in);

// int sum=0;
//         int number;
//         do {
    
//             number = scanner.nextInt();

            
//             if (number != 0) {
//                 numbers.add(number);
//             }
//         } while (number != 0); 

//         System.out.println("ArrayList में Integers: " + numbers);
//        for(int i=0;i<numbers.size();i++){
//         if(numbers.get(i)<17){
//             sum+=200;
//         }
//         else if(numbers.get(i)>=17 && numbers.get(i)<40){
//         sum+=400;
//         }
// else{
//     sum+=300;
// }


//        }
// System.out.println(sum);

        ArrayList<String> list = new ArrayList<>();

       
        Scanner scanner = new Scanner(System.in);

       
        

        String input;
        while (!(input = scanner.nextLine()).equals("done")) {
            list.add(input);
        }
        
        System.out.println("ArrayList में इनपुट: " + list);
        for (String element : list) {
            System.out.print(element);
        }







        // String input;
        //         do {
            
        //             input = scanner.nextLine();
        
                    
        //             if ( !( input.equals("done") )) {
        //                 list.add(input);
        //             }
        //         } while ( ! (input.equals("done"))); 

        //        for (String element : list) {
        //     System.out.print(element+" ");
        //         }


               
            // for(int i=0; i<list.size();i++){
            //     if(list.get(i).equals("rajesh"));
            //     System.out.print(i+" ");
            // }

        
          
    }
}
