public class frequencyarray {
    public static void main(String[] args) {
        String str= "abaaacdaa";
         int []freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            
             int idx= (int)ch-97;
             freq[idx]++;

            
        }
        int maxfreq=-1;
        for (int i = 0; i < freq.length; i++) {
            maxfreq= Math.max(maxfreq,freq[i]);
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]==maxfreq)
            {
                char ch=(char)(i+97);
                System.out.println(ch+" ");
            }
        }
    }
    
}
