import java.util.ArrayList;
class Main{

public static void main (String[] args){

System.out.println("Hello World!");
int [][] matrix={{1,2,3},{0,5},{1,7,8}};
sumOfMatrixRow(matrix);
}


public static void sumOfMatrixRow(int [][] inputMatrix){
ArrayList<Integer> sumArr=new ArrayList<Integer>();
int sum=0;
if (inputMatrix.length!=0){
for (int i=0;i<inputMatrix.length;i++){
sum=0;
  for(int j=0; j<inputMatrix[i].length;j++){
    sum+=inputMatrix[i][j];
}
sumArr.add(sum);
}
}
else {
sumArr.add(0);
}
System.out.println(sumArr);
}
}
