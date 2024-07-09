public class skipachar {
    public static void skip(int i,String s, String ans){
             
if(i==s.length())
    
{
    System.out.println(ans);
    return;
}
if(s.charAt(i)!='a') ans+=s.charAt(i);
skip(i+1, s, ans);
 return;

    }
    public static void main(String[] args) {
        String s= "allahabad";
        skip(0,s," ");
    }
}
