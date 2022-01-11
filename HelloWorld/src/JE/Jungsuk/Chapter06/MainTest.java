package JE.Jungsuk.Chapter06;

public class MainTest {
    public static void main(String[] args) {
        main(null);  // 재귀호출(자기자신을 호출)
        // 계속 자신을 호출하기 때문에 무한호출 -> 메모리 한계를 넘어서서 에러발생(stackoverflowerror)
    }
}
