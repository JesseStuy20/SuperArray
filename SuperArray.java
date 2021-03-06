public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10] ;
    size = 0 ;
  }

  public SuperArray(int initialCapacity) {
    if (initialCapacity < 0) {
      throw new IllegalArgumentException ("initialCapacity cannot be negative") ;
    }
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
    if ((index < 0) || (index > size)) {
      throw new IndexOutOfBoundsException ("index is out of bounds") ;
    }
    for (int i=size; i>index; i--) {
      data[i] = data[i-1] ;
    }
    data[index] = element ;
    size++ ;
    if (data.length == size) {
      resize() ;
    }
  }

  public String get(int index) {
    if ((index < 0) || (index >= size)) {
      throw new IndexOutOfBoundsException ("index is out of bounds") ;
    }
    return data[index] ;
  }

  public String set(int index, String element) {
    if ((index < 0) || (index >= size)) {
      throw new IndexOutOfBoundsException ("index is out of bounds") ;
    }
    String returnValue = data[index] ;
    data[index] = element ;
    return returnValue ;
  }

  private void resize() {
    String[] tempArr = data ;
    data = new String[tempArr.length*2] ;
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
    if ((index < 0) || (index >= size)) {
      throw new IndexOutOfBoundsException ("index is out of bounds") ;
    }
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

   public int lastIndexOf(String value) {
     int result = -1 ;
     boolean hasString = false ;
     for (int i=size-1; i>=0; i--) {
       String correctString = data[i] ;
       if ((hasString == false) && (correctString.equals(value))) {
         hasString = true ;
         result = i ;
       }
     }
     return result ;
   }

   public boolean equals(SuperArray other){
     return (toString().equals(other.toString())) ;
   }

}
