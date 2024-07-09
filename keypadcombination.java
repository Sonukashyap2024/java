public class keypadcombination {
    public static void combination(String digit, String []kp,String res)
    {
        if(digit.length()==0){
            System.out.println(res+" ");
            return;
        }


        int current= digit.charAt(0)-'0';
        String  currentchoice= kp[current];
        for(int i=0;i<currentchoice.length();i++)
        {
            combination(digit.substring(1), kp, res+currentchoice.charAt(i));
        }

    }
    public static void main(String[] args) {
        String digit="7799";
        String []kp={ " "," ", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(digit, kp, " ");

    }

}
