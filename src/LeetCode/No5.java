package LeetCode;

/**
 * 类比No.214；
 */
public class No5 {

    public static String longestPalindrome(String s) {
        int len = s.length();
        if(len == 0){
            return "";
        }
        int[][] dp = new int[len][len];
        int maxLen = 0;
        String result = String.valueOf(s.charAt(0));
        for(int i=0; i<len; i++){
            dp[i][i] = 1;
        }
        for(int i=0; i<len-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = 1;
                maxLen = 1;
                result = s.substring(i,i+2);
            }else{
                dp[i][i+1] = 0;
            }
        }
        for(int i=2; i<len; i++){
            for(int j=0; j<len-i&& j+i <len ; j++){
                if(dp[j+1][j+i-1]==1 && s.charAt(j) == s.charAt(j+i)){
                    dp[j][j+i] = 1;
                    if( i > maxLen ){
                        maxLen = i;
                        result = s.substring(j,j+i+1);
                    }
                }else{
                    dp[j][j+i] = 0;
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
