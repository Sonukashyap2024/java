public class printSubseq {
    public static void ssq(String str , String current)
    {
        if(str.length()==0)
        {
            System.out.println(current);
            return;
        }
        char curr= str.charAt(0);
        String remaining = str.substring(1);
        ssq(remaining, current+curr);
        ssq(remaining, current);
return ;
    }
    
    public static void main(String[] args) {
        ssq("abc", " ");
    }
}
