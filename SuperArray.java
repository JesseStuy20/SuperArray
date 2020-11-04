public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10] ;
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
    data = new String[size+1] ;
    for(int i=0; i<tempArr.length; i++) {
      data[i] = tempArr[i] ;
    }
  }

}
