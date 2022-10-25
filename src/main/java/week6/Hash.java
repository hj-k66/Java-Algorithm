package week6;

public class Hash {

    public int hash(String key){
        //key의 각 문자 ascii 코드값을 합침
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        //자료의 갯수로 나눈 나머지
        return asciiSum % 90;
    }

    public static void main(String[] args) {
        Hash h = new Hash();
        h.hash("heejung");
    }
}

