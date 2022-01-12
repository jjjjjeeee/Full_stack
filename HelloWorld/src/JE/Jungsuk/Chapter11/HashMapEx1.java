package JE.Jungsuk.Chapter11;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId","1234");
        map.put("asdf","1111");
        map.put("asdf","1234");

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("id와 pw를 입력하세요.");
            System.out.println("id:");
            String id = sc.nextLine().trim();

            System.out.println("pw:");
            String pw = sc.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)){
                System.out.println("입력하신 id는 존재하지 않습니다. \n다시 입력해주세요.");
                continue;
            }
            if(!(map.get(id)).equals(pw)){
                System.out.println("비밀번호가 일치하지 않습니다. \n다시 입력해주세요.");
            } else{
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }
    }
}
