public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray(int initialCapacity) {
    data = new String[initialCapacity] ;
    size = 0 ;
  }

  public int size() {
    return this.size ;
  }

  public boolean add(String element) {
    data[size] = element ;
    size++ ;
    if (size == data.length) resize() ;
    return true ;
  }

  public String get(int index) {
    return data[index] ;
  }

  public String set(int index, String element) {
    String returnValue = data[index] ;
    data[index] = element ;
    return returnValue ;
  }

  private void resize() {
    String[] tempArr = data ;
    data = new String[size*2] ;
    for(int i=0; i<tempArr.length; i++) {
      data[i] = tempArr[i] ;
    }
  }

  public boolean isEmpty() {
    if (size == 0) return true ;
    else return false ;
  }

  public void clear() {
    data = new String[data.length] ;
    size = 0 ;
  }

  public String toString() {
    String result = "[" ;
    for(int i=0; i<size-1; i++) {
      result = result + data[i] + ", " ;
    }
    result = result + data[size-1] + "]" ;
    return result ;
  }

  public boolean contains(String s) {
    boolean result = false ;
    for(int i=0; i<size; i++) {
      if (s.equals(data[i])) result = true ;
    }
    return result ;
  }

}
