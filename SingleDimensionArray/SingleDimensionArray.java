package SingleDimensionArray;

import java.util.Arrays;

public class SingleDimensionArray {
  int arr[] = null;

  // Constructor
  public SingleDimensionArray(int sizeOfArray) {
    arr = new int[sizeOfArray];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.MIN_VALUE;
    }
  }

  // insert value in the Array
  public void insert(int location, int valueToInsert) {
    try {
      if (arr[location] == Integer.MIN_VALUE) {
        arr[location] = valueToInsert;
        System.out.println("Successfully inserted");
      } else {
        System.out.println("This cell is already occupied by another value.");
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid index to access array:" + e);
    }
  }

  // Traverse an Array
  public void traverseArray(int index) {
    System.out.println(arr[index]);
  }
  
  // Delete Array for specific value as well as the whole array
  public void delete(int location, boolean whole) {
    try {
      if (whole) {
        for(int i = 0; i < arr.length; i++) {
          arr[i] = Integer.MIN_VALUE;
        }
        System.out.println("Array values have been reset/deleted successfully:");
      } else {
        arr[location] = Integer.MIN_VALUE;
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Index out of bound exception while deleting an element from array" + e);
    }
  }
  
  // Search for an element in an array
  public void search(int element) {
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] == element) {
        System.out.println("element '" + element + "' exists at index " + i);
        return;
      }
    }
    System.out.println("element '" + element + "' does not exist in the array");
  }

  public static void main(String[] args) {
    SingleDimensionArray singleDimensionArray = new SingleDimensionArray(5);
    singleDimensionArray.insert(0, 1);
    singleDimensionArray.insert(1, 2);
    singleDimensionArray.insert(2, 3);
    singleDimensionArray.insert(3, 4);
    singleDimensionArray.insert(4, 5);
    System.out.println(Arrays.toString(singleDimensionArray.arr));

    singleDimensionArray.traverseArray(0);
    singleDimensionArray.traverseArray(1);

    // singleDimensionArray.delete(1, false);
    // System.out.println(Arrays.toString(singleDimensionArray.arr));

    // singleDimensionArray.delete(1, true);
    // System.out.println(Arrays.toString(singleDimensionArray.arr));

    singleDimensionArray.search(3);
    singleDimensionArray.search(5);
    singleDimensionArray.search(6);
  }
}
