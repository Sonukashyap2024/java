public class stair {
    public static int Stair(int n){
        if(n==2||n==1){
            return n ;
        }
        int a=Stair(n-1);
        int b =Stair(n-2);
        return a+b;
    }
    public static void main(String[] args) {
        int n=5;
       System.out.println(Stair(n));

    }
    
}
