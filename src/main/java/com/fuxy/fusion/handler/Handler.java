package com.fuxy.fusion.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author JasonFuxy
 */
public class Handler {

    public static int[] charge(int[] nums1, int[] nums2){

        List list = new ArrayList();

        for (int i = 0; i < nums1.length; i++) {
            //nums1每循环一次，就初始化一个栈
            Stack<Integer> stack = new Stack<>();
            for (int j = nums2.length-1; j >= 0 ; j--) {
                stack.push(nums2[j]);
            }
            int current = nums1[i];
            List temp = new ArrayList();

            while (!stack.isEmpty()){
                Integer pop = stack.pop();
                if(!stack.isEmpty()){
                    //肯定会存在相等的情况
                    if(pop == current){
                        //相等时，需要去判断栈中的剩余元素是否存在比当前数大的元素
                        Integer peek = stack.peek();
                        if(peek > current){
                            //紧接着的下个元素就满足情况
                            temp.add(peek);
                            break;
                        }else {
                            //需要判断余下的元素中是否存在
                            while (!stack.isEmpty()){
                                Integer pop1 = stack.pop();
                                if(pop1 > current){
                                    temp.add(pop1);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            if(temp.size() == 0){
                temp.add(-1);
            }
            list.addAll(temp);
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = (int)list.get(i);
        }

        return result;
    }

    public boolean exist(char[][] board, String word) {
        if(board.length == 0 || null == word || "".equals(word)){
            return false;
        }

        for(int i = 0; i< board.length; i++){
            int flag = word.length();
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == (word.charAt(--flag))){
                    --flag;
                    if(((i - 1 >= 0 && board[i - 1][j] == (word.charAt(flag)))) || ((j - 1) >= 0 && board[i][j - 1] == (word.charAt(flag))) || ((j + 1 <= board[i].length) && board[i][j + 1] == (word.charAt(flag))) || ((i + 1 <= board[i].length) && board[i + 1][j] == (word.charAt(flag)))){
                        return true;
                    }else{
                        return false;
                    }
                }


            }
        }
        return false;

    }

    public int movingCount(int m, int n, int k) {
        int result = 0;
        for(int i = 0; i <= m - 1; i++){
            for(int j = 0; j <= n- 1; j++){
                int temp = 2 * i + 2 * j - 2;
                if(temp <= k){


                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        if(a + b <= c){

        }

        ListNode head = new ListNode(1);

        ListNode second = new ListNode(3);

        ListNode third = new ListNode(2);
        head.next = second;
        second.next = third;


        List<Integer> list = new ArrayList();

        while(head != null){
            list.add(head.val);
            head = head.next;
        }

        int[] result = new int[list.size()];
        for(int i = 0; i <= list.size() - 1; i++){
            result[list.size() -1 - i] = list.get(i);
        }
        System.out.println(result);

    }

     public static class ListNode {
      int val;
     ListNode next;
      ListNode(int x) { val = x; }
  }







}
