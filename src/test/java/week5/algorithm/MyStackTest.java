package week5.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    MyStack myStack;
    @BeforeEach
    void setUp(){
        //테스트 수행 전 실행되는 코드
        //ex) db에서 데이터 지우는 코드
        //ex) db에 데이터 넣는 코드
        System.out.println("before each");
        myStack = new MyStack();

    }


    @Test
    void pushTest(){
        myStack.push(1);
        myStack.push(20);
        int[] arr = myStack.getArr();
        Assertions.assertEquals(1,arr[0]);
        Assertions.assertEquals(20,arr[1]);
    }

    @Test
    @DisplayName("push, pop이 잘 되는지")
    void pushAndPop(){
        myStack.push(10);
        myStack.push(20);

        Assertions.assertEquals(20,myStack.pop());
        Assertions.assertEquals(10,myStack.pop());

        myStack.push(30);
        Assertions.assertEquals(30,myStack.pop());

        //스택이  비어있을때
        //Exception test
        Assertions.assertThrows(RuntimeException.class,()->{
            myStack.pop();
        });

    }
    @Test
    void isEmpty(){
        //비었을 떄
        Assertions.assertTrue(myStack.isEmpty());
        //값 넣었을 떄
        myStack.push(10);
        Assertions.assertFalse(myStack.isEmpty());
        //값 뺏을 때
        myStack.pop();
        Assertions.assertTrue(myStack.isEmpty());

    }

    @Test
    void peek(){
        Assertions.assertThrows(EmptyStackException.class,()->{
            myStack.peek();
        });
        myStack.push(10);
        int peeked = myStack.peek();
        Assertions.assertEquals(10,peeked);

    }
}



