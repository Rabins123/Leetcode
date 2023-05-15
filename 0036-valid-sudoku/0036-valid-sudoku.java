class Solution {
    public boolean isValidSudoku(char[][] board) {
         for(int i=0;i<9;i++)
        {
            HashSet hc=new HashSet();
            for(int j=0;j<9;j++)
            {
                char chcol=board[i][j];
                if(chcol!='.'&&hc.contains(chcol))
                return false;
                hc.add(chcol);   
                
            }
            HashSet hr=new HashSet();
            for(int j=0;j<9;j++)
            {
                char chrow=board[j][i];
                if(chrow!='.'&&hr.contains(chrow))
                return false;
                hr.add(chrow);   
            }
        }
        for(int i=0;i<9;i+=3)
        {
            for(int j=0;j<9;j+=3)
            {
                HashSet dia=new HashSet();
                for(int k=0;k<9;k++)
                {
                    int r=i+k%3;
                    int c=j+k/3;
                    int di=board[r][c];
                    if(di!='.'&&dia.contains(di))
                        return false;
                    dia.add(di);
                }
            }
        }
        return true;
    }
}