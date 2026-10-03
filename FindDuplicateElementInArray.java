import java.util.HashSet;
public class FindDuplicateElementInArray {
    public static void main(String[] args) {
        
        // Remove duplicate element in Array using hashset
        HashSet<Integer> set = new HashSet<>();
        int[] arr = {1, 2, 3, 4, 5, 1, 2};
        
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        System.out.println(set);

        // Find Duplicate element in Array usind hashset
        int[] arr1 = {1,2,3,1,2,5,6};

        for(int i=0;i<arr1.length;i++)   
        {
            if(set.contains(arr1[i]))
            {
                System.out.println(arr1[i]);
            }
            set.add(arr1[i]);
        }
    }
}