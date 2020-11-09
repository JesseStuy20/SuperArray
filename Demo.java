public class Demo{

  public static void removeDuplicates(SuperArray s){
	  for (int i=0; i<s.size(); i++) {
		  if (i != s.indexOf(s.get(i))) {
			  s.remove(i);
			  i--;
		  }
	  }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray result = new SuperArray() ;
    for (int i=0; i<a.size(); i++) {
      if (b.indexOf(a.get(i)) >= 0) {
        result.add(a.get(i)) ;
      }
    }
    removeDuplicates(result) ;
    return result ;
  }

  public static SuperArray zip(SuperArray a, SuperArray b) {
    int length = 0 ;
    SuperArray result = new SuperArray() ;
    if (a.size() >= b.size()) length = a.size() ;
    else length = b.size() ;
    for (int i=0; i<length; i++) {
      if (i<a.size()) result.add(a.get(i)) ;
      if (i<b.size()) result.add(b.get(i)) ;
    }
    return result ;
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray() ;
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words) ;
    removeDuplicates(words) ;
    System.out.println(words) ;
    SuperArray dupe = words ;
    System.out.println(zip(words,dupe)) ;

  }
}
