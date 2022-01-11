package JE.Jungsuk.Chapter06;

public class VarArgsEx {
    public static void main(String[] args) {
        // concatenate: 여러 문자열을 하나로 결합하여 반환하는 메서드
        String[] strArr = {"100","200","300"};

        System.out.println(concatenate("","100","200","300"));
        System.out.println(concatenate("-",strArr));
        System.out.println(concatenate(",",new String[] {"1","2","3"}));
        System.out.println("["+concatenate(",",new String[0])+"]");
        System.out.println("["+concatenate(",")+"]");
    }

    static String concatenate(String delim, String...args){
        String result = "";
        
        for (String str : args) {
            result += str + delim;
        } return result;
    }

/*
    private static String concatenate(String delim, String...args) {
        return concatenate("",args);
    }
*/
} // class
