public class BestTimeToBuySellStock {
    public int maxProfit(int[] prices)
        {
            int max = 0;
            int diff = 0;
            for(int i = 0; i<=prices.length-1; i++)
            {
                for(int j = i+1; j<=prices.length-1; j++)
                {
                    if(prices[i]<prices[j])
                    {
                        diff = prices[j]-prices[i];
                        if(diff > max)
                        {
                            max = diff;
                        }

                    }
                    else
                    {
                        continue;
                    }
                }
            }
            return max;

        }
    }

