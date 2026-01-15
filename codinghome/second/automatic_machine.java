package second;
import java.util.*;
public class automatic_machine {

    

    
  public static void main(String[] args) {

  int[] arr1 = {1, 4, 6, 6};
        int[] arr2 = {2, 3, 4, 5};

        Set<Integer> set = new HashSet<>();

        // Add all elements to HashSet (duplicates will be removed)
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }

        // Convert to list
        List<Integer> result = new ArrayList<>(set);

        // Sort list
        Collections.sort(result);

        System.out.println("Merged, Sorted, Unique (List): " + result);

        // ✅ Convert List<Integer> to int[]
  //       int[] finalArray = result.stream().mapToInt(i -> i).toArray();

  //       // Print final array
  //       System.out.println("Final int[] array:");
  //       for (int num : finalArray) {
  //           System.out.print(num + " ");
  //       }


// List<Integer> result = Arrays.asList(1, 2, 3, 4, 5, 6);

// Create int[] of same size
int[] finalArray = new int[result.size()];

// Copy elements one by one
for (int i = 0; i < result.size(); i++) {
    finalArray[i] = result.get(i);
}

// Print the array
for (int num : finalArray) {
    System.out.print(num + " ");
}









  // String str = "rajeshraj";
  //       LinkedHashSet<Character> ha = new LinkedHashSet<>();

  //       for (char ch : str.toCharArray()) {
  //           if (ha.contains(ch)) {
  //               // System.out.println("First repeated character: " + ch);
  //               break;
  //           }
  //           ha.add(ch);
  //       }
        
	// 	// Convert LinkedHashSet to String
  //       StringBuilder sb = new StringBuilder();
  //       for (char ch : ha) {
  //           sb.append(ch);
  //       }

  //       String s = sb.toString();
  //       System.out.println("Converted String: " + s);
  
  
  


  }  
}
