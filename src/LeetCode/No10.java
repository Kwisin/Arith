package LeetCode;

import java.util.Arrays;

public class No10 {

    public boolean isMatch(String s, String p) {

        if(s.length()==0){
            return true;
        }
        if(p.length()==0){
            return false;
        }

        char[] S_chars = s.toCharArray();
        char[] P_chars = p.toCharArray();
        int S_len = s.length();
        int P_len = p.length();
        int S_flag = 0, P_flag = 0;
        int bp[][] = new int[S_len][P_len];
        for(int i=0;i<S_len;i++){
            Arrays.fill(bp[i],0);
        }
        if(P_chars[0] == '*'){
            return false;
        }

        while( S_flag < S_len && P_flag < P_len ){
            if(P_chars[P_flag] == '*'){
                if( S_chars[S_flag] == P_chars[P_flag-1] || P_chars[P_flag-1]=='.' ){

                }
            }else if( S_chars[S_flag] == P_chars[P_flag] || P_chars[P_flag]=='.' ){
                bp[S_flag][P_flag] = 1;
                if( P_chars[P_flag] == '*' ){
                    S_flag++;
                }else{
                    S_flag++;
                    P_flag++;
                }
            }else{

            }
        }





        return true;
    }

    public static void main(String[] args) {

    }
}
