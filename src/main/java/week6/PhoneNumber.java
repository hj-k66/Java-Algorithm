package week6;

import java.util.HashSet;
import java.util.Set;

public class PhoneNumber {
    public boolean solution(String[] phone_book) {
        Set<String> hashset = new HashSet<>();
        //전화번호부 set 생성
        for(var phone : phone_book) hashset.add(phone);

        //phonebook에서 phone 문자열(0,0~1,0~2, ...)씩 hashset에 있는지 검사
        for(var phone : phone_book){
            String jubdoo = "";
            for(int i = 0; i < phone.length();i++){
                jubdoo += phone.charAt(i);
                if(hashset.contains(jubdoo) && !jubdoo.equals(phone)){
                    return false;
                }
            }
        }
        return true;
    }
}
