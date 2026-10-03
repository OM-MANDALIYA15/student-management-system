import java.util.*;
public class FindMajorityElementInArray
{
    public static void display(int arr[])
    {
        HashMap<Integer , Integer > h1 = new HashMap<>();
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(h1.containsKey(arr[i]))
            {
                h1.put(arr[i], h1.get(arr[i]) + 1);
            }
            else
            {
                h1.put(arr[i], 1);
            }
        }
        for(int key : h1.keySet())
        {
            if(h1.get(key) > n/3)
            {
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,2,3,1,1};
        display(arr);
        
    }
}