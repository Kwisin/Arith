import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PDD4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            List list = new ArrayList();
            String s = in.nextLine();
            String[] arr = s.trim().split(" ");
            int[] arr1 = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                arr1[i] = Integer.parseInt(arr[i]);
            }
            for (int i = 1; i <= arr1[0]; i++) {
                for (int j = 1; j <= arr1[1]; j++) {
                    list.add(i * j);
                }
            }
            Object[] result = list.toArray();
            Arrays.sort(result);
            System.out.println(result[result.length - arr1[2]]);
        }
    }
}
