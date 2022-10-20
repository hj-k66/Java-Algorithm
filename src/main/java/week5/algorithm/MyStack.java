package week5.algorithm;

public class MyStack {
    private int[] arr = new int[10000];
    private int pointer = 0;
    public MyStack(int size) {
        this.arr = new int[size];
    }

    //디폴트 생성자
    public MyStack() {
    }

    public void push(int value){
        this.arr[this.pointer] = value;
        this.pointer++;
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("스택이 비었습니다.");
        }
        this.pointer--;
        int popValue = this.arr[this.pointer];
        return popValue;
    }

    public int[] getArr(){
        return arr;
    }

    public boolean isEmpty() {
        return this.pointer==0;
    }
}
