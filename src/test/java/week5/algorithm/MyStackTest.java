package week5.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    @BeforeEach
    void setUp(){
        //테스트 수행 전 실행되는 코드
        //ex) db에서 데이터 지우는 코드
        //ex) db에 데이터 넣는 코드
        System.out.println("before each");
    }


    @Test
    void pushTest(){
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(20);
        int[] arr = myStack.getArr();
        Assertions.assertEquals(1,arr[0]);
        Assertions.assertEquals(20,arr[1]);
    }

    @Test
    @DisplayName("push, pop이 잘 되는지")
    void pushAndPop(){
        MyStack myStack = new MyStack();
        myStack.push(10);
        myStack.push(20);

        Assertions.assertEquals(20,myStack.pop());
        Assertions.assertEquals(10,myStack.pop());

        myStack.push(30);
        Assertions.assertEquals(30,myStack.pop());

    }
}



