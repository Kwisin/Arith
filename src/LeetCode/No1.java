package LeetCode;

import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class No1 {


    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {

        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode node1 = l1,node2 = l2;
        ListNode result = new ListNode(0);
        ListNode current = result;
        while(node1!=null && node2!=null){
            ListNode flag = new ListNode((node1.val+node2.val)%10);
            current.next = flag;
            current = flag;
            if(node1.val+node2.val>=10){
                if(node1.next==null){
                    ListNode node1tail = new ListNode(1);
                    node1.next = node1tail;
                }else{
                    ListNode temp = node1;
                    //while()
                    node1.next.val+=1;
                    if(node1.next.val==10){
                        node1.next.val = 0;
                        ListNode node1tail = new ListNode(1);
                        node1.next.next = node1tail;
                    }
                }
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        if(node1!=null){
            current.next = node1;
        }
        if(node2!=null){
            current.next = node2;
        }
        return result.next;
    }




    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode node1=l1, node2=l2;
        ListNode result = new ListNode(0);
        ListNode current = result;
        int temp = 0;
        while(node1!=null || node2!=null){
            if(node1==null){
                node1=new ListNode(0);
            }
            if(node2==null){
                node2=new ListNode(0);
            }
            current.next = new ListNode((node1.val+node2.val+temp)%10);
            if(node1.val+node2.val+temp>=10){
                temp = 1;
            }else{
                temp = 0;
            }
            node1 = node1.next;
            node2 = node2.next;
            current = current.next;
        }
        if(temp==1){
            current.next = new ListNode(1);
        }
        return result.next;
    }






    /*
    for(int i=0;i<chars.length&&chars.length-i>result;i++){
        set.clear();
        for(int j=i;j<chars.length&&chars.length-j+1>result;j++){
            if(!set.add(chars[j])){
                int temp = set.size();
                //System.out.println("temp:"+temp);
                if(temp > result){
                    result = temp;
                }
                set.clear();
                set.add(chars[j]);
            }
        }
        int temp = set.size();
        if(temp>result){
            result = temp;
        }
        //System.out.println("result:"+result);
    }*/
    public  int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        if(chars.length==0){
            result = 0;
        }
        Set<Character> set = new HashSet<>();
        int i = 0;
        for(char c : chars){
            while(!set.add(c)){
                result = Math.max(set.size(),result);
                set.remove(chars[i]);
                i++;
            }
        }
        int temp = set.size();
        if(temp>result){
            result = temp;
        }
        return result;
    }



    public double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        double result = 0;
        int i = 0, j = 0;
        if ((m + n) % 2 == 1) {
            for (int k = 0; k < (m + n + 1) / 2; k++) {
                if (nums1[i] < nums2[j]) {
                    result = nums1[i];
                    i++;
                    continue;
                } else {
                    result = nums2[j];
                    j++;
                    continue;
                }
            }
        } else {
            for (int k = 0; k < (m + n + 2) / 2; k++) {
                if (i == n) {
                    if (k == (m + n - 2) / 2) {
                        result += nums2[j];
                    }
                    if(k == (m + n) / 2){
                        result += nums2[j];
                        break;
                    }
                    j++;
                    continue;
                } else if (j == m) {
                    if (nums1[i] < nums2[j]) {
                        if (k == (m + n - 2) / 2) {
                            result += nums1[i];
                        }
                        if(k == (m + n) / 2){
                            result += nums2[i];
                            break;
                        }
                        i++;
                        continue;
                    } else {
                        if (nums1[i] < nums2[j]) {
                            if (k == (m + n - 2) / 2) {
                                result += nums1[i];
                            }
                            if(k == (m + n) / 2){
                                result += nums2[i];
                                break;
                            }
                            continue;
                        } else {
                            if (k == (m + n - 2) / 2) {
                                result += nums2[j];
                            }
                            if(k == (m + n) / 2){
                                result += nums2[j];
                                break;
                            }
                            j++;
                            continue;
                        }
                    }
                }
                result = result / 2;
            }
        }
        return result;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int result = 0;
        int beforeMid = 0 , Mid = 0;
        int flag1 =0 , flag2 = 0;
        for(int i=0;i<(int)(nums1.length+nums2.length)/2+1;i++){
            if(nums1[flag1]<nums2[flag2]){
                beforeMid = Mid;
                Mid = nums1[flag1];
                flag1++;
            }else{
                beforeMid = Mid;
                Mid = nums2[flag2];
                flag2++;
            }
        }
        if((nums1.length+nums2.length)%2==1){
            result = (beforeMid+Mid)/2;
        }else{
            result = Mid;
        }
        return result;
    }



    public static void main(String[] args) {
        No1 no = new No1();
        Map<Character,ArrayList<Integer>> map = new LinkedHashMap();
        ArrayList list = new ArrayList();
        list.add(1);
        map.put('c',list);
        ArrayList<Integer> c = map.get('c');
        c.add(2);
        ArrayList<Integer> c1 = map.get('c');
        c.add(10);
        System.out.println(c1.get(2));
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(no.findMedianSortedArrays(nums1,nums2));
    }
}
