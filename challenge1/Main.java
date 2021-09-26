public class Main{

public static void main (String[] args){


int[] normalArray={1, 2, 3, 4, 5, 6};
int [] reversedArr=reverseArray(normalArray);
for (int i=0;i<normalArray.length;i++){
System.out.println(reversedArr[i]);
}


}

public static int [] reverseArray(int[] array){

int[] newArr=new int [array.length];
for (int i=0;i<array.length;i++){
newArr[i]=array[array.length-1-i];

}
return newArr;
}


}

