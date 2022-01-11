package Day5;

// 과제1~4) 
public class Nation{
    public static void main(String[] args) {
        Nation nation = new Nation();
        String nation_name = "한국";
        System.out.println("나라 이름은 "+nation_name+"입니다.");
    }
}

class test{

    // 나라이름을 private로 지정하고, 면적과 인구수는 public
    private String nation_name; 
    public int area;
    public int population;

    // 행성이름 만들고 static으로 저장
    static String planet = "Mars"; 
}


class Korea extends Nation{

}

class France extends Nation{

}

class Egypt extends Nation{

}