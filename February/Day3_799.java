package February;

public class Day3_799 {

    public static void main(String[] args) {
        int poured = 2;
        int query_row = 1;
        int query_glass = 1;
        double ans  = new Day3_799().champagneTower(poured, query_row, query_glass);
        System.out.println(ans);
    }

    public double champagneTower(int poured, int query_row, int query_glass) {

        // get to know why query+2
        double[][] dp = new double[query_row + 2][query_row + 2];
        dp [0][0] = poured;
        for(int i = 0;i<query_row;i++)
        {
            // condition is j<=i because each row has same number of column as its index
            for(int j = 0;j<=i;j++)
            {
                if(dp[i][j]>1){
                    double overflow  = dp[i][j]-1;
                    dp[i+1][j] += overflow/2;
                    dp[i+1][j+1] += overflow/2;
                    dp[i][j]=1;
                }
            }
        }
        return Math.min(dp[query_row][query_glass],1);
        
    }
}

//  Approach 
// we first create a 2d array of size (query_row+1)*(query_glass+1)
// and fill it with 0
// then we fill the first row with 1






// Pitfalls