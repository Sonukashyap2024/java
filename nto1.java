public class nto1 {
    public static void printnumber(int n){
if(n==0)
{   
    return;
} 

System.out.println(n);
printnumber(n-1);


    }
public static void main(String[] args) {
    int n=10;
    printnumber(n);
}

}
