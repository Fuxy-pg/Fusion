package com.fuxy.fusion.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,3,5,2,4};
        int[] nums2 = new int[]{6,5,4,3,2,1,7};
        int[] charge = charge(nums1, nums2);
        for (int i = 0; i < charge.length; i++) {
            System.out.println(charge[i]);
        }
    }






}
