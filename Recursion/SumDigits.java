public class SumDigits {
    
public static void main(String[] args) {
    int sum = sumOfDigits(43042);
    System.out.println(sum);
}
    
public static int sumOfDigits(int sum)
{
        //base conditions 
        if(sum ==0)
        {
            return 0;
        }

        
    return sumOfDigits(sum/10)+ (sum%10);
}
}
