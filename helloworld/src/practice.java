public class practice {
    public static void main(String[] args) {
      int sum = 0;
      int i = 0;

      while(true){
          if(sum>1200){
              i++;
              sum += i;
          }
        System.out.println("i="+i);
        System.out.println("sum="+sum);
        break;
      }
    }
}
