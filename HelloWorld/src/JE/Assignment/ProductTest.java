package JE.Assignment;

public class ProductTest {
    public static void main(String[] args) {

        Product p1 = new Product(001, "노트북", 1200000, 2021, "삼성");
        Product p2 = new Product(002, "모니터", 300000, 2021, "LG");
        Product p3 = new Product(003, "마우스", 30000, 2020, "로지텍");
       
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}

class Product{

    // 멤버면수 타입지정
    int prdNo;
    String prdName;
    int prdPrice;
    int prdYear;
    String prdMaker;
    
    //Product(){}

    public Product(int prdNo, String prdName, int prdPrice, int prdYear, String prdMaker){
        this.prdNo = prdNo;
        this.prdName = prdName;
        this.prdPrice = prdPrice;
        this.prdYear = prdYear;
        this.prdMaker = prdMaker;
    }
        
    public String toString() {
        return "상품번호"+"\t상품명"+"\t가격"+"\t연도"+"\t제조사\n"+
        this.prdNo+"\t\t"+this.prdName+"\t"+this.prdPrice+"\t"+this.prdYear+"\t"+this.prdMaker;
         
        // return "prdNO =" + this.prdNo+"prdName ="+this.prdName+
        // "prdPrice ="+this.prdPrice+"prdYear ="+this.prdYear+"prdMaker ="+this.prdMaker;
    }
}