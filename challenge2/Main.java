import java.util.Arrays;
class Main{

public static void main (String[] args){

System.out.println("Hello World!");


int [] array={2,4,6,-8};
int n= 5;

System.out.println(Arrays.toString(insertShiftArray(array,n)));
}

public static int[] insertShiftArray (int [] array, int n){

int index=(array.length+1)/2;
int [] modifiedArr=new int [array.length+1];
for(int i=0; i<=array.length;i++){
if(i==index){
modifiedArr[i]=n;
}else if(i<index){

modifiedArr[i]=array[i];
}else{

modifiedArr[i]=array[i-1];
}
}
return modifiedArr;
}
}
