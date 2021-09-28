class Main {

public static void main (String[] args){
  Main main = new Main();
        int inputArr[] = { 4, 8, 15, 16, 23, 42 };
        int n = inputArr.length;
        int searchKey = 15;
        int result = main.binarySearch(inputArr, searchKey);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);



}
public static int binarySearch(int [] inputArr , int searchKey){
int min = 0, max = inputArr.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (inputArr[mid] == searchKey)
                return mid;
            if (inputArr[mid] < searchKey)
                min = mid + 1;
 
            else
                max = mid - 1;
        }
  
        return -1;

}

}
