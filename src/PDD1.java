import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PDD1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            List list1 = new ArrayList();//ji
            List list2 = new ArrayList();//ou
            List result = new ArrayList();
            String s = in.nextLine();
            String[] arr = s.trim().split(",|;");
            int[] arr1 = new int[arr.length];
            for(int i=0;i<arr.length;i++){
                arr1[i] = Integer.parseInt(arr[i]);
            }
            int N = arr1[arr1.length-1];
            for(int i=0;i<arr1.length-1;i++){ //分奇数偶数
                if(arr1[i]%2==1){
                    list1.add(arr1[i]);
                }else{
                    list2.add(arr1[i]);
                }
            }
            Object[] arr2 =  list1.toArray();//ji
            Object[] arr3 =  list2.toArray();//ou
            Arrays.sort(arr2);
            Arrays.sort(arr3);
            if(N <= arr3.length){
                for(int i=0;i<N;i++){
                    result.add(arr3[arr3.length-i-1]);
                }
            }else{
                for(int i=0;i<N;i++){
                    if(i<arr3.length){
                        result.add(arr3[arr3.length-i-1]);
                    }else{
                        result.add(arr2[arr2.length-(i-arr3.length+1)]);
                    }
                }
            }
            String STR = result.get(0)+",";
            for(int i=1;i<result.size();i++){
                if(i == result.size()-1){
                    STR += result.get(i);
                }else{
                    STR += result.get(i)+",";
                }
            }
        STR.trim();
        System.out.println(STR);
        }
    }
}
