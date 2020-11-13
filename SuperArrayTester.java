import java.util.* ;
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
    System.out.println("Example usage test cases") ;
    SuperArray words = new SuperArray(10) ;
    words.add("kani") ;
    words.add("uni") ;
    words.add("ebi") ;
    for(int i = 0; i < words.size(); i++){
      System.out.println(words.get(i)) ;
    }
    System.out.println("empty/clear test cases") ;
    SuperArray empty = new SuperArray(10) ;
    System.out.println(empty.size()) ;
    System.out.println(empty.isEmpty()) ;
    a1.clear() ;
    System.out.println(a1.size()) ;
    System.out.println(words.toString()) ;
    System.out.println(words.contains("kani")) ;
    words.add(0,"maki") ;
    System.out.println(words.toString()) ;
    System.out.println(words.remove(3)) ;
    System.out.println(words.toString()) ;
    words.add("kani") ;
    System.out.println(words.toString()) ;
    System.out.println(words.indexOf("kani")) ;
    System.out.println(Arrays.toString(words.toArray())) ;
    System.out.println(words.lastIndexOf("kani")) ;
    SuperArray dupe = words ;
    System.out.println(dupe.toString()) ;
    System.out.println(words.equals(dupe)) ;
    try {
      SuperArray error = new SuperArray(-1) ;
    }
    catch (IllegalArgumentException e) {
      System.out.println("initialCapacity cannot be negative") ;
    }
    SuperArray error = new SuperArray(5) ;
    error.add("one") ;
    error.add("two") ;
    error.add("three") ;
    error.add("five") ;
    try {
      System.out.println(error.get(4)) ;
    }
    catch (IndexOutOfBoundsException e) {
      System.out.println("index is out of bounds") ;
    }
    try {
      System.out.println(error.set(4,"four")) ;
    }
    catch (IndexOutOfBoundsException e) {
      System.out.println("index is out of bounds") ;
    }
    System.out.println(error.set(3,"four")) ;
    try {
      error.add(-1,"zero") ;
    }
    catch (IndexOutOfBoundsException e) {
      System.out.println("index is out of bounds") ;
    }
    error.add(0,"zero") ;
    System.out.println(error.toString()) ;
    try {
      error.remove(5) ;
    }
    catch (IndexOutOfBoundsException e) {
      System.out.println("index is out of bounds") ;
    }

  }

}
