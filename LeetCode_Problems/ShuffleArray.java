import java.util.Arrays;

public class ShuffleArray {


public static void main(String[] args) {
    int []arr= {
        1,2,3,4,5,6,7,8
    };
    int [] answer = shuffle(arr, 4); 
}


  static  public int[] shuffle(int[] nums, int n) {

        int [] ans = new int[nums.length];
        int [] left = new int [n];
        int []right = new int [n]; 
        int j =0;
        for(int i=0; i<nums.length; i++)
        {
            if(i<n)
            {
                left[i] = nums[i];
                System.out.println(left[i]);
            }
                if(i>=n)
                {
               
                
                right[j]=nums[i];
                System.out.println(right[j]);
                j++;

                }
        }   
        j=0;
        System.out.println("Loop 1st ended :");
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        for(int i =0; i<ans.length; i++)
        {

            if( i==2 || i==0 ||i==4||i==6 )
            {

                ans[i] = left[i];
            System.out.println( "i value when left  : "+i); 

                System.out.println("l : "+ans[i]);
          }

          else{
            System.out.println( "i value when right  : "+i); 
            ans[i] = right[j];
            System.out.println("r :"+ans[i]);
            j++;}

           
            }
        System.out.println(Arrays.toString(ans));
    return ans;
        }
      
}
