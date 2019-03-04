public class RottenOranges {
    static int count,k = 0, l = 0, m = 0;
     public static int RottenOranges(int[][] grid) {
            //no fresh orange
         count=0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == 1)
                        k++;
                    if (grid[i][j] == 2)//no rotten orange
                        l++;
                }
            }
            if (k == 0)
                return count;
            if (l == 0)
                return --count;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == 2) {
                        if (i + 1 < grid.length) {
                            if (grid[i + 1][j] == 1) {
                                grid[i + 1][j] = 2;
                                m++;
                            }
                        }
                        if (j + 1 < grid[i].length) {
                            if (grid[i][j + 1] == 1) {
                                grid[i][j + 1] = 2;
                                m++;
                            }
                        }
                        if (j - 1 >= 0) {
                            if (grid[i][j - 1] == 1) {
                                grid[i][j - 1] = 2;
                                m++;
                            }
                        }
                        if (i - 1 >= 0) {
                            if (grid[i - 1][j] == 1) {
                                grid[i - 1][j] = 2;
                                m++;
                            }
                        }
                        if (m > 0) {
                            count++;
                            m=0;
                        }
                    }//check if 1 is there beside 2 if yes run loop again
                }

            }
            k=0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == 1)
                        k++;
                }
            }
            if (k > 0)
                count=-1;
            return count;
        }


        public static void main(String args[]){
            //int grid[][]={{0,2}};
            int grid[][]={{1,1,2,0,2,0}};

            RottenOranges(grid);
            System.out.println(count);

        }

}
