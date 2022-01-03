class ParentBook {
    String name; // 필드
    int price;

    public void Print() { // 메소드
        System.out.println("책의 이름과 가격 : " + name + " " + price);
    }

    public static void main(String[] args){
        ChildBook childbook = new ChildBook("나의 라임오렌지 나무", 10000);
    }

class ChildBook extends ParentBook {
    ChildBook(String name, int price) { // 생성자
     this.name = name; // ChildBook이 ParetBook의 필드를 상속받아서 가능한 선언
     this.price = price; // "
 }
}