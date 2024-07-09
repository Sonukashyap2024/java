public class reversestring {
    public static String srtingreverse(String str,int idx)
    {
        if(idx==str.length())
        {
            return " ";
        }
        String ans= srtingreverse(str, idx+1);
        char current= str.charAt(idx);
        return ans+current;
    }
    public static void main(String[] args) {
        String str= "ecnalubmA";
        System.out.println(srtingreverse(str, 0));
    }
    
}
