package Array;

class ArrayEx1{
    public static void main(String[] args) {
        int [] score = new int[5]; // 배열의 길이가 5인 int
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k+1] = 70;
        score[3] = 80;
        score[4] = 90;

        int tmp  = score[k+2] + score[4]; // int tmp = score[3]+score[4]

        // for문으로 배열의 모든 요소를 출력
        for(int i=0; i<5; i++){
            System.out.printf("score[%d]:%d%n",i,score[i]);
        }
        System.out.printf("tmp:%d%n", tmp);
        System.out.printf("score[%d]:%d%n",7,score[7]); // index의 범위를 벗어난 값이라 에러발생
    }
}