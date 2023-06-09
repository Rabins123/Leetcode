class Solution {
public List<Integer> spiralOrder(int[][] matrix) {
ArrayList<Integer>list=  new  ArrayList<Integer>();
  int r=matrix.length;
  int c= matrix[0].length;
  int startRow=0;
  int endRow=r-1;
  int startCol=0;
  int endCol=c-1;

  while(list.size() < r*c){

    //from the starting row-->right direction
    for(int i=startCol;i<=endCol;i++){
        list.add(matrix[startRow][i]);
    }
    startRow++;

    //from the end column-->bottom direction
    for(int i=startRow;i<=endRow;i++){
        list.add(matrix[i][endCol]);
    }
      if(list.size() == r*c)break;
     endCol--;

     //from the bottom row-->left direction
    for(int i=endCol;i>=startCol;i--){
        list.add(matrix[endRow][i]);
    }
     endRow--;

     //from left column-->up direction
     for(int i=endRow;i>=startRow;i--){
        list.add(matrix[i][startCol]);
    }
     startCol++;
  }
  return list;
    }
}