public class OOP3 {
    public static void main(String[] args) {

        // Parent p = new Parent();

        // System.out.println(p instanceof Object);
        // System.out.println(p instanceof Parent);
        // System.out.println(p instanceof Child);
        // System.out.println();

        // Parent c = new Child();
        // System.out.println(c instanceof Object);
        // System.out.println(c instanceof Parent);
        // System.out.println(c instanceof Child);

        // Parent pa01 = null;
        // Child ch = new Child();
        // Parent pa02 = new Parent();
        // Brother br = null;

        // pa01 = ch;
        // br = (Brother)pa02;  // 형변환
        // // br = (Brother)ch; // 상속관계가 아니면 에러발생
        // br = (Brother)(Parent)ch;

        // Employee[] tekcom = new Employee[4];
        // Employee[] newcom = new Employee[4];

        // tekcom[0] = new Employee("왕가네", 38);
        // tekcom[1] = new Employee("김팀장", 35);
        // tekcom[2] = new Employee("아무래", 28);
        // tekcom[3] = new Employee("최고참", 46);

        // for(int i=0; i<newcom.length; i++){
        //     newcom[i] = new Employee();
        //     newcom[i].setAge(tekcom[i].getAge());
        //     newcom[i].setName(tekcom[i].getName());
        // }

        // newcom[0].setName("홍로인");
        // newcom[1].setName("고리나");

        // System.out.println("===== 처음 객체 배열 =====");
        // for(int i=0; i<tekcom.length; i++){
        //     System.out.println(tekcom[i].getName());
        // }

        // System.out.println("===== 복사한 객체 배열 =====");
        // for(int i=0; i<tekcom.length; i++){
        //     System.out.println(newcom[i].getName());
        // }

        // for (int i=0; i<tekcom.length; i++){  // for문을 활용하여 한 번에 초기화
        //     tekcom[i] = new Employee();
        // }
        // for (int i=0; i<tekcom.length; i++){
        //     System.out.println(tekcom[i]);
        // }
    }
}

// class Parent{}

// class Child extends Parent{}

// class Brother extends Parent{}


// class Employee{
//     private String name;
//     private int age;

//     public Employee(){} // 생성자

//     public Employee(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     // 마우스 우클릭 -> source action -> getters and setters
//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }
    
// }


// 추상클래스
// abstract class Player {
//     boolean pause;
//     int currentPos;

//     Player(){
//         pause = false;
//         currentPos = 0;

//     }
//     abstract void play(int pos);
//     abstract void stop();

//     void Play(){
//         if(pause) {
//             pause = false;
//             play(currentPos);
//         } else{
//             pause = true;
//             stop();
//         }
//     }
// }

// class MP3Player extends Player{
//     void play(int currentPos){

//     }
//     void stop(){

//     }

//     int currentAlbum;
    
//     void nextAlbum(){

//     }

//     void preAlbum(){

//     }
// }

abstract class Animal{
    String name;
    void view(){};
    abstract void disp();
}

class Lion extends Animal{
    
    @Override
    void disp(){
        System.out.println("사자");
    }
}

class Tiger extends Animal{
    
    @Override
    void disp(){
        System.out.println("호랑이");
    }
}

// class Review{
//     public static void main(String[] args) {
        
//         Lion li = new Lion();
//         li.disp();

//         Tiger ti = new Tiger();
//         ti.disp();

//         Animal ani = new Lion();
//         ani.disp();

//         ani = new Tiger();
//         ani.disp();
//     }
// }

// interface catWorld{
//     public void call();  // 메소드 원형만 만들어주면 됨, 구현체는 없음
// }

// class InterFaceTest implements catWorld{

//     @Override
//     public void call() {
//         System.out.println("야옹야옹!");
//     }
//     public static void main(String[] args) {
//         InterFaceTest it = new InterFaceTest();
//         it.call();
//     }
// }


interface animals{
	public void eat(String bab);
	public void work(String move);
	public void sleep(String zzz);
}

class Cat implements animals{ //고양이
	public void eat(String bab) {
		System.out.println("고양이는 "+bab+"을 먹어요.");
	}
	public void sleep(String zzz) {
		System.out.println("고양이는 "+zzz+"자요.");
	}
	public void work(String move) {
		System.out.println("고양이는 "+move+"걸어요.");
	}
}

class Monkey implements animals{ //원숭이
	public void eat(String bab) {
		System.out.println("원숭이는 "+bab+"을 먹어요.");
	}
	public void sleep(String zzz) {
		System.out.println("원숭이는 "+zzz+"자요.");
	}
	public void work(String move) {
		System.out.println("원숭이는 "+move+"걸어요.");
	}
}

class Chicken implements animals{ //닭
	public void eat(String bab) {
		System.out.println("닭은 "+bab+"을 먹어요.");
	}
	public void sleep(String zzz) {
		System.out.println("닭은 "+zzz+"자요.");
	}
	public void work(String move) {
		System.out.println("닭은 "+move+"걸어요.");
	}
}


class InterFaceTest{
    
    public static void main(String[] args) {
        Cat cat = new Cat();
        Monkey mo = new Monkey();
        Chicken ch = new Chicken();
        
        cat.eat("생선");
        mo.eat("과일");
        ch.eat("사료");
        
        cat.work("네발로");
        mo.work("네발 또는 두발로");
        ch.work("두발로");
        
        cat.sleep("엎드려서");
        mo.sleep("누워서");
        ch.sleep("서서");
    }
}

