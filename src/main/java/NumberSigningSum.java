public class NumberSigningSum {

    public static int numberSigningSum(int n){
        String nVal = String.valueOf(n);
        int even = 0;
        int odd = 0;
        for(int i = 0; i < nVal.length(); i++){
            int data = Integer.parseInt(String.valueOf(nVal.charAt(i)));
            if(i%2==0) even += data;
            else odd -= data;
        }
        return even + odd;
    }
}
