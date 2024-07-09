public class digitsum {

public static int digit(int n)
{
    if(n>=0&&n<=9)
    {
        return n;
    }
    int ans = digit(n/10)+n%10;
    return ans;
}

    public static void main(String[] args) {
        int n=  9878;
        System.out.println(digit(n));
        
    }
}
