package LeetCode;

public class No11 {

    public int maxArea(int[] height) {

        if(height.length==0||height.length==1){
            return 0;
        }
        if(height.length==2){
            int s = height[0]-height[1];
            return Math.abs(s);
        }
        int left=0,right=height.length-1;

        return 0;
    }

    public static void main(String[] args) {

    }
}
