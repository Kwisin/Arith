package LeetCode;


public class No8 {
    public static int myAtoi(String str) {
        double result = 0;
        int flag = 0;
        int point_flag = 0;
        String trim = str.trim();
        System.out.println(trim);
        if(trim.equals("+")||trim.equals("-")){
            return 0;
        }
        if(str.length()==0||trim.length()==0){
            return 0;
        }
        if(IsSymbol(trim.charAt(0))&&IsSymbol(trim.charAt(1))){
            return 0;
        }
        if(!IsNum(trim.charAt(0))&&!IsSymbol(trim.charAt(0))){
            return 0;
        }
        for (int i=1; i<trim.length(); i++){
            char s = trim.charAt(i);
            if(!IsNum(s)){
                if( s == '.' && point_flag==0){
                    point_flag = 1;
                    continue;
                }
                String temp = String.valueOf(s);
                String[] split = null;
                if(s == '.'){
                    System.out.println("point");
                    split = trim.split("\\.");
                    String v = split[0]+"."+split[1];
                    result = Double.parseDouble(v);
                }else{
                    System.out.println("not point");
                    split = trim.split(temp);
                    System.out.println(split.length);
                    System.out.println(split[0]);
                    if(split[0].equals("+")||split[0].equals("-")){
                        return 0;
                    }
                    if(split[0].length()==0){
                        System.out.println(temp+split[1]);
                        result = Double.parseDouble(temp+split[1]);
                    }else{
                        result = Double.parseDouble(split[0]);
                    }
                }
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            result = Double.parseDouble(trim);
        }
        if(result>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(result<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int)result;
    }
    public static boolean IsNum(char s){

        if(s=='1'||s=='2'||s=='3'||s=='4'||s=='5'||s=='6'||s=='7'||s=='8'||s=='9'||s=='0'){
            return true;
        }
        return false;
    }
    public static Boolean IsSymbol(char s){
        if(s == '+' || s== '-'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "+123123+";
        //System.out.println(Double.parseDouble(s));
        String s1 = "+-";
        System.out.println(myAtoi(s));
    }
}
