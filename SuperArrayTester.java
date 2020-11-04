public class SuperArrayTester {
  public static void main(String[] args) {
    SuperArray a1 = new SuperArray() ;
    System.out.println(a1.size()) ;
    System.out.println(a1.add("a")) ;
    System.out.println(a1.add("b")) ;
    System.out.println(a1.add("c")) ;
    System.out.println(a1.size()) ;
    System.out.println(a1.get(0)) ;
    System.out.println(a1.get(2)) ;
    System.out.println(a1.set(0, "x")) ;
    System.out.println(a1.set(2, "z")) ;
    System.out.println(a1.get(0)) ;
    System.out.println(a1.get(2)) ;
  }

}
