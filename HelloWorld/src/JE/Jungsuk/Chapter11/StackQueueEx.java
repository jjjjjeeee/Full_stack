package JE.Jungsuk.Chapter11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList(); // queue인터페이스의 구현체인 linkedlist 사용

        st.push("0"); // stack에 0저장
        st.push("1"); // stack에 1저장
        st.push("2"); // stack에 2저장

        q.offer("0"); // queue에 0저장
        q.offer("1"); // queue에 1저장
        q.offer("2"); // queue에 2저장

        System.out.println("= Stack =");
        while(!st.empty()){
            System.out.println(st.pop()); // stack 맨 위에 저장된 객체를 꺼냄
        }
        
        System.out.println("= Queue =");
        while(!q.isEmpty()){
            System.out.println(q.poll()); // queue 객체를 꺼내서 반환
        }
    }
}
