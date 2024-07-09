public class palindromesrting {
    public static boolean validpalindrome(String str,int left,int right)
    {
        while(left<right)
        {
            if(str.charAt(left)!= str.charAt(right))
            {
                return false;
            }
                 left++;
              right--;
              return true;
            
        }
        return validpalindrome(str, left+1, right-1);// true
        
    }
    public static void main(String[] args) {
        String str = "leve";
    int n= str.length()-1;
        if((validpalindrome(str, 0, n)))// true
        {
            System.out.println("yes palindrome");
        }
        else{
            System.out.println("no");
        }
    }
}
