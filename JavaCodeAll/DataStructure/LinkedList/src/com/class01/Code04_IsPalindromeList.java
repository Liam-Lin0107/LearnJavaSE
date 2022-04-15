package com.class01;

import java.util.Stack;

// 判斷是否是回文結構 e.g. 1, 2, 3, 2, 1
public class Code04_IsPalindromeList {
    public static class Node{
        public int value; // 值
        public Node next; // 下一個位置

        public Node(int data){
            this.value = data;
        }
    }

    // need n extra space
    public static boolean isPalindromeList1(Node head){
        Stack<Node> stack = new Stack<>();
        Node cur = head;
        while (cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        while (head != null){
            if(head.value != stack.pop().value){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
