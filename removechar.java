import java.util.Scanner;

public class removechar {
    public static String removeoccurance(String str,int idx)
    {
        if(idx==str.length())
        {
            return " ";
        }
    String ans= removeoccurance(str, idx+1);
    char current=str.charAt(idx);
if(current !='a')
{
    return current+ans;
}
else{
    return ans;
}
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(removeoccurance(str, 0));
    }
}
