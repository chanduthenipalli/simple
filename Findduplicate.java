import java.util.*;
class Findduplicate
{
    static int findDuplicate(int[] arr) 
    {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) 
        {
            
            if (arr[i] == arr[i+1])//2==2
            {
                return arr[i];
            }
            
        }
        return 0;
    }
    public static void main(String args[]) 
    {
        int arr[] = {4,1,2,4,3,4};
        System.out.println("The duplicate element is " + findDuplicate(arr));
    }
}
