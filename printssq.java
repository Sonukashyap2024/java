import java.util.ArrayList;

public class printssq {
    public static ArrayList<String> getssq(String str){
    ArrayList<String> ans= new ArrayList<>();
    {
        if(str.length()==0)
        {
            ans.add(" ");
            return ans;
        }
        char curr= str.charAt(0);
        ArrayList<String> smallans= getssq(str.substring(1));
        for(String S:smallans)
        {
            ans.add(S);
            ans.add(curr+S);
        }
        return ans;
    }
}
    public static void main(String[] args) {
        String str= "abc";
        System.out.println(getssq(str));

    
}
}
