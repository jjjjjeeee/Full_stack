import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.*;

import JE.Print;

public class CollectionExam {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1,4));
        print(list1, list2);

        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        System.out.println("list1.containsAll (list2):"+list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add("A");
        print(list1, list2);

        list2.add(3,"A");
        print(list1, list2);

        list2.set(3,"AA");
        print(list1, list2);

        // list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제
        System.out.println("list1.retainAll (list2):"+list1.retainAll(list2));
        print(list1, list2);

        // list2에서 list1에 포함된 객체들을 삭제
        for (int i=list2.size()-1; i>=0; i--){
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);

        // iterator();
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("one");
        list3.add("two");
        list3.add("three");
        list3.add("four");
        list3.add("five");

        Iterator iterator = list3.iterator();

        while(iterator.hasNext()){ // hasnext: 읽어 올 요소가 남아있는지 확인
            System.out.println(iterator.next());
        }
    } //main의 끝

    static void print (ArrayList list1, ArrayList list2) {
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println();

    }

    public Iterator iterator() {
        return null;
    }
}

class ComparatorEx {
    public static void main(String[] args) {
        String[] strArr = {"cat","dog","lion","tiger"};

        Arrays.sort(strArr); // String의 comparable구현에 의한 정렬
        System.out.println("strArr="+Arrays.toString(strArr));
        
        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분안함
        System.out.println("strArr="+Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending()); // 역순 정렬
        System.out.println("strArr="+Arrays.toString(strArr));
    }
}

class Descending implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Comparable && o2 instanceof Comparable){
            Comparable c1 = (Comparable)o1;
            Comparable c2 = (Comparable)o2;
        return c1.compareTo(c2) * -1; // -1을 곱해서 기본 정렬방식의 역으로 변경
        // 또는 c2.compareTo(c1)와 같이 순서를 바꿔도 됨
        } return -1;
    }
}

class HashSetEx1{
    public static void main(String[] args) {
        Object[] objArr = {"1", new Interger(1),"2","2","3","3","4","4","4"};
        Set set = new HashSet();

        for(int i=0; i<objArr.length; i++){
            set.add(objArr[i]); // hashset에 objarr의 요소들을 저장
        }

        // HashSet에 저장된 요소들을 출력
        System.out.println(set);
    }
}

class HashSetEx3 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("adc");
        set.add("adc");
        set.add(new Person1("David",10));
        set.add(new Person1("David",10));

        System.out.println(set);
    }
}

class Person1{
    String name;
    int age;

    Person1(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name +":"+age;
    }
}

class HashMapEx1{
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myID", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "5555");

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id:");
            String id = sc.nextLine().trim();

            System.out.print("password:");
            String password = sc.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다."+"다시 입력해주세요.");
                continue;
            }

            if(!(map.get(id)).equals(password)){
                System.out.println("비밀번호가 일치하지 않습니다. 재입력요망");
            } else{
                System.out.println("일치ㅇㅇ");
                break;
            }
        }
    }
}

class HashMapEx2{
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바", new Integer(100));
        map.put("이자바", new Integer(100));
        map.put("강자바", new Integer(80));
        map.put("안자바", new Integer(90));

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("이름:"+e.getKey()+", 점수:"+e.getValue());
        }
        set = map.keySet();
        System.out.println("참가자 명단 :" + set);

        CollectionExam values = (CollectionExam) map.values();
        it = values.iterator();

        int total = 0;

        while(it.hasNext()){
            Integer i = (Integer)it.next();
            total += i.intValue();
        }

        System.out.println("총점: "+total);
        System.out.println("평균: "+(float)total/set.size());
        System.out.println("최고점수: "+Collections.max(values));
        System.out.println("최저점수: "+Collections.min(values));
    }
}