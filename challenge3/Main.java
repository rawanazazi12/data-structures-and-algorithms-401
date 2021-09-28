class Main {

public static void main (String[] args){
  Main ob = new Main();
        int inputArr[] = { 2, 3, 4, 10, 40 };
        int n = inputArr.length;
        int searchKey = 0;
        int result = ob.binarySearch(inputArr, searchKey);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                               + "index " + result);



}
public static int binarySearch(int [] inputArr , int searchKey){
int min = 0, max = inputArr.length - 1;
        while (min <= max) {
            int mid = min + (max - min) / 2;
  
            // Check if searchKey is present at mid
            if (inputArr[mid] == searchKey)
                return mid;
  
            // If searchKey greater, ignore left half
            if (inputArr[mid] < searchKey)
                min = mid + 1;
  
            // If searchKey is smaller, ignore right half
            else
                max = mid - 1;
        }
  
        // if we reach here, then element was
        // not present
        return -1;

}


}
