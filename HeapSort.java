public class HeapSort {

  public int [] sort (int [] data) {
    ALHeap yerMum = new ALHeap ();
    System.out.print ("Input array: \t");
    printArr (data);
    for (int i = 0; i < data.length; i++) {
      yerMum.add (data [i]);
    }

    for (int i = 0; i < data.length; i++) {
      data [i] = yerMum.removeMin ();
    }

    return data;
  }

  private void minHeapify (int [] a) {
    for (int i = 1; i < a.length; i++) {
      int addValPos = i;
      while(addValPos > 0) {
        int parentPos = (addValPos-1) / 2;
        if (a [addValPos] < a [parentPos]) {
          swap(addValPos, parentPos, a);
          addValPos = parentPos;
        }

        else {
          break;
        }
      }
    }
  }



  private void maxHeapify (int [] a) {
    for (int i = 1; i < a.length; i++) {
      int addValPos = i;
      while(addValPos > 0) {
        int parentPos = (addValPos - 1) / 2;
        if (a [addValPos] > a [parentPos]) {
          swap(addValPos, parentPos, a);
          addValPos = parentPos;
        }

        else {
          break;
        }
      }
    }
  }

  private int minChildPos (int pos, int last, int [] a) {
    int retVal;
    int lc = 2 * pos + 1;
    int rc = 2 * pos + 2;
    if (pos < 0 || pos >= last || lc > last) {
      retVal = -1;
    }

    else if (rc > last) {
      retVal = lc;
    }

    else if (a[lc] < a[rc]) {
      retVal = lc;
    }

    else {
      retVal = rc;
    }

    return retVal;
  }

  private int maxChildPos (int pos, int last, int [] a) {
    int retVal;
    int lc = 2 * pos + 1;
    int rc = 2 * pos +  2;

    if (pos < 0 || pos >= last || lc > last) {
      retVal = -1;
    }

    else if (rc > last) {
      retVal = lc;
    }

    else if (a [lc] > a [rc]) {
      retVal = lc;
    }

    else {
      retVal = rc;
    }

    return retVal;
  }

  private int minOf (int a, int b) {
  return (a < b) ? a : b;
  }

  public static void swap (int x, int y, int [] o) {
    int tmp = o [x];
    o [x] = o [y];
    o [y] = tmp;
  }

  public static void printArr(int[] a) {
    for (int o : a) {
      System.out.print(o + " ");
    }

    System.out.println();
  }

  public static void shuffle (int [] d) {
    int tmp;
    int swapPos;
    for(int i = 0; i < d.length; i++) {
      tmp = d[i];
      swapPos = i+ (int)((d.length - i) * Math.random());
      swap (i, swapPos, d);
    }
  }

  public static int [] buildArray (int size, int hi) {
    int[] retArr = new int[size];
    for(int i = 0; i < retArr.length; i++) {
      retArr[i] = (int)(hi * Math.random());
    }

    return retArr;
  }




  //main method for testing
  public static void main(String[] args) {
  int[] a = buildArray(10, 10);
  printArr(a);
  HeapSort h = new HeapSort();
  a = h.sort (a);
  printArr (a);
  }
}
