package LeetCode;

public class No6 {

    public static String convert(String s, int numRows) {
        if(s.length()==0||numRows==0){
            return "";
        }
        if(numRows==1){
            return s;
        }
        int len = s.length();
        double ceil = Math.ceil(len / (2 * numRows - 2))+1;
        int col = (int)ceil*(numRows-1);
        char[][] re = new char[numRows][col];
        int index = 0;
        int dir = -1;
        int i=0, j=0;
        while(index < s.length()){
            if (dir == -1 && i < numRows) {
                re[i][j] = s.charAt(index);
                if(i==numRows-1){
                    dir = 1;
                    i--;
                    j++;
                }else{
                    i++;
                }
                index++;
                continue;
            }
            if(dir == 1 && i >= 0){
                re[i][j] = s.charAt(index);
                if( i == 0 ){
                    dir = -1;
                    i++;
                }else{
                    i--;
                    j++;
                }
                index++;
                continue;
            }
        }
        String result = "";
        for(int t=0;t<re.length;t++){
            for(int k=0;k<re[0].length;k++){
                if(re[t][k] != '\0'){
                    result += String.valueOf(re[t][k]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(convert("LEETCODEISHIRING",3));
    }

}
