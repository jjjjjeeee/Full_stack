class Value {
    int value;
  
    Value(int value) {
      this.value = value;
    }
  }
  
  class JavaLang {
    public static void main(String[] args) {
      Value v1 = new Value(10);
      Value v2 = new Value(10);
  
      if(v1.equals(v2)) {
        System.out.println("eqauls == true");
      } else {
        System.out.println("eqauls == false"); // 서로 다른 주소 참조
      }
  
      v2 = v1; // 서로 같은 주소 참조
  
      if(v1.equals(v2)) {
        System.out.println("eqauls == true"); // 서로 같은 주소 참조
      } else {
        System.out.println("eqauls == false");
      }
    }
  }

  class Person {
    long id;
  
    Person(long id) {
      this.id = id;
    }
  
    // 오버라이딩
    public boolean equals(Object obj) {
      if(obj != null && obj instanceof Person) {
        return id == ((Person)obj).id;
      } else {
        return false;
      }
    }
  }
  
  class EqualsEx2 {
    public static void main(String[] args) {
      Person p1 = new Person(8602192222111L);
      Person p2 = new Person(8602192222111L);
  
      if(p1 == p2) {
        System.out.println("eqauls == true");
      } else {
        System.out.println("eqauls == false"); // 서로다른 주소 참조
      }
  
      if(p1.equals(p2)) {
        System.out.println("eqauls == true"); // 서로 같은 값
      } else {
        System.out.println("eqauls == false");
      }
    }
  }

  class HashCodeEx1 {
    public static void main(String[] args) {
      String str1 = new String("abc");
      String str2 = new String("abc");
  
      System.out.println(str1.equals(str2)); // true
  
      System.out.println(str1.hashCode()); // 96354
      System.out.println(str2.hashCode()); // 96354
  
      System.out.println(System.identityHashCode(str1)); // 27134973
      System.out.println(System.identityHashCode(str2)); // 1284693
    }
  }