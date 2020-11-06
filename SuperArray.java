public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10] ;
    size = 0 ;
  }

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

  public void add(int index, String element) {
    for(int i=size+1; i>index; i--) {
      data[i] = data[i-1] ;
    }
    data[index] = element ;
    size++ ;
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

  public String remove(int index) {
    String result = data[index] ;
    for (int i=index; i<size; i++) {
      data[i] = data[i+1] ;
    }
    size-- ;
    return result ;
  }

  public int indexOf(String s) {
    int result = -1 ;
    boolean hasString = false ;
    for (int i=0; i<size; i++) {
      String correctString = data[i] ;
      if ((hasString == false) && (correctString.equals(s))) {
        hasString = true ;
        result = i ;
      }
    }
    return result ;
  }

   public String[] toArray() {
     String[] returnArray = new String[size] ;
     for (int i=0; i < size; i++) {
       returnArray[i] = data[i] ;
     }
     return returnArray ;
   }

  

}
