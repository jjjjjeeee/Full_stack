// import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // 배열 예제
        // int[] score = new int[5];
        // int k = 1;

        // score[0] = 50;
        // score[1] = 60;
        // score[k+1] = 70;
        // score[3] = 80;
        // score[4] = 90;

        // // for 문으로 배열의 모든 요소를 출력한다
        // for(int i=0; i<5; i++){
        // System.out.printf("score[%d]:%d%n", i, score[i]);
        // }

        // // array length
        // System.out.printf("length : %d%n", score.length);

        // // ArrayIndexOutOfBoundsException
        // System.out.printf("score[%d]:%d%n", 7, score[7]);

        // // 배열 초기화
        // int[] s= new int[]{50,60,70,80,90};

        // for (int i=0; i<5; i++){
        // System.out.printf("s[%d]:%d%n", i, s[i]);
        // }

        // char[] chArr = new char[]{'A','B','C','D','E'};
        // String[] strArr = new String[]{"A","B","C","D","E"};
        // String str = "";
        // int total = 0;
        // for(char i:chArr){
        // str += i + "\n";
        // }
        // System.out.println(str);

        // boolean[] boolArr = new boolean[] {true, false, true, true, false};
        // for (int i = 0; i < boolArr.length; i++) {
        // System.out.printf("boolArr[%d] : %s%n", i, boolArr[i]);
        // }

        // 문제) score 배열에 50, 60, 70, 80, 90 을 입력하고 처음 값과 마지막 값을 더한 다음 출력하시오.
        // int[] score = new int[] { 50, 60, 70, 80, 90 };
        // System.out.println(score[0] + score[score.length-1]);

        // 문제) 배열에 100, 88, 100, 100, 90 을 입력하고 총합과 평균을 출력하시오
        // int[] score = new int[] { 100, 88, 100, 100, 90 };
        // int sum = 0;
        // for (int i = 0; i < score.length; i++) {
        // sum += score[i];
        // }
        // double avg = (double) sum / score.length;
        // System.out.printf("총합 : %d%n평균 : %.1f", sum, avg);

        // 최대값과 최소값
        // int[] score = {79,88,91,33,100,55,95};

        // int max = score[0];
        // int min = score[0];

        // for(int i=1; i<score.length; i++){
        // if(score[i] > max){
        // max = score[i];
        // } else if(score[i] < min){
        // min = score[i];
        // }
        // }
        // System.out.println("max: "+max);
        // System.out.println("min: "+min);

        // 문제) 변수 a, 변수 b 의 값을 서로 교환하고 출력하시오.
        // int a=10, b=20, temp=0;
        // temp = a;
        // a = b;
        // b = temp;

        // System.out.println("a="+a+" b="+b);
        // System.out.printf("a=%d b=%d",a,b);

        // 문제) 배열에 75, 100, 85, 60, 95 를 입력하고, 높은 점수순으로 rank를 표시하시오.
        // int[] score = new int[] { 75, 100, 85, 60, 95 };
        // int[] rank = new int[score.length];

        // for (int i = 0; i < score.length; i++) {
        // rank[i] = 1;
        // for (int j = 0; j < score.length; j++) {
        // if (score[i] < score[j]) {
        // rank[i] += 1;
        // }
        // }
        // }
        // System.out.println("score rank");
        // for (int i = 0; i < score.length; i++) {
        // System.out.printf("%d\t%d%n", score[i], rank[i]);
        // }

        // 섞기(shuffle)
        // int[] numArr = new int[10];
        // for (int i = 0; i < numArr.length; i++) {
        // numArr[i] = i;
        // System.out.println(numArr[i]);
        // }

        // for (int i = 0; i < 100; i++) {
        // int n = (int) (Math.random() * 10);
        // int tmp = numArr[0];
        // numArr[0] = numArr[n];
        // numArr[n] = tmp;
        // }

        // for (int i = 0; i < numArr.length; i++)
        // System.out.print(numArr[i]);

        // 임의의 값으로 배열 채우기
        // int[] arr = new int[5];
        // for(int i=0; i<arr.length; i++){
        // arr[i] = (int)(Math.random()*5);
        // }
        // for(int i=0; i<arr.length; i++){
        // System.out.println(arr[i]);
        // }

        // 선택 정렬(selection sort)
        // int[] arr = {7,5,9,0,3,1,6,2,4,8};
        // int minIndex = 0; // 가장 적은 원소의 인덱스

        // for(int i=0; i<arr.length; i++){
        // for(int j=i+1; j<arr.length; j++){
        // if(arr[minIndex] > arr[j])
        // minIndex=j;
        // }
        // //스와프
        // int tmp = arr[i];
        // arr[i] = arr[minIndex];
        // arr[minIndex] = tmp;
        // }
        // System.out.println(Arrays.toString(arr));

        // 삽입 정렬(insertion sort)
        // int[] arr = {7,5,9,0,3,1,6,2,4,8};

        // for(int i=1; i<arr.length; i++){
        // for(int j=i; j>=1; j--){

        // if(arr[j] < arr[j-1]){
        // int tmp = arr[j];
        // arr[j] = arr[j-1];
        // arr[j-1] = tmp;
        // } else break; //자기보다 작은 데이터를 만나면 그 위치에서 멈춤
        // }
        // }
        // System.out.println(Arrays.toString(arr));

        // 퀵 정렬(quicksort)
    //     int[] array = { 5, 7, 9, 0, 3, 1, 6, 2, 4, 8 };

    //     quickSort(array, 0, array.length - 1);

    //     for (int i : array) {
    //         System.out.printf("%d", i);
    //     }
    // }

    // public static void quickSort(int[] array, int start, int end) {
    //     if(start>=end) // 원소가 1개인 경우 종료
    //     return;
    
    //     int pivot = start; // 피벗은 첫 번째 원소
    //     int left = start+1;
    //     int right = end;

    //     while (left <= right) {

    //         // 피벗보다 큰 데이터를 찾을 때까지 반복
    //         while (left <= end && array[left] <= array[pivot])
    //             left -= 1;

    //             //피벗보다 작은 데이터를 찾을 때까지 반복
    //             while(right > start && array[right] >= array[pivot])
    //             right-=1;

    //             if(left > right){ // 엇갈렸다면 작은 데이터와 피벗을 교체
    //                 int tmp = array[right];
    //                 array[right] = array[pivot];
    //                 array[pivot] = tmp;
                
    //             }else{ //엇갈리지 않았다면 적은 데이터와 큰 데이터를 교체
    //                 int tmp = array[right];
    //                 array[right] = array[left];
    //                 array[left] = tmp;
    //     }
    //                 //분할  이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
    //                 quickSort(array, start, right -1);
    //                 quickSort(array, right +1, end);        
    // }

    String[] name = new String[3];
    name[0] = "kim";
    name[1] = "park";
    name[2] = "yi";

    // for(String str:name){
    //     System.out.println(str);
    // }

    // for (String s : name) {
    //     System.out.println((char) (s.charAt(0) - 32));
    // }

    // for(String str : name){
    //     System.out.println(str.toUpperCase().charAt(0));
    // }

    // String text = "one,two,three";
    // String[] textArr = text.split(",");
    // for(String string : textArr){
    //     System.out.println(string);
    // }


    // 향상된 for문을 사용해 String 배열  name의 값을 출력하시오.
    // String str = "ABCDE";
    // char ch = str.charAt(3);
    // System.out.println(ch);
    int[] score = {1,2,3,4,5};

    int max = score[0];
    int min = score[0];

    for(int i=1; i<score.length; i++){
        if(score[i] > max){
            max = score[i];
        } else if (score[i]<min){
            min = score[i];
        }
    }
    System.out.println("최대값:"+max);
    System.out.println("최소값:"+min);


}
}