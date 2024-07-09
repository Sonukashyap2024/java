public class permutations {
  /* public static void printpermutation(String ans,String s){
          
        if(s.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char current =s.charAt(i);
            String left=s.substring(0, i);
            String right= s.substring( i+1);
            printpermutation(ans+current, left+right);
            
        }
         
    } */
    public static void permu(String ans,String str){

        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++)
        {
            char curr=str.charAt(i);
            String left=str.substring(0, i);
            String right= str.substring( i+1);
            permu(ans+curr,left+right);




        }
    }
    public static void main(String[] args) {
        String s="abc";

           //printpermutation(" ", s);
           permu("", s);


        
    }
    
}
