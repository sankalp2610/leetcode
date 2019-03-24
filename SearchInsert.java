public class SearchInsert {
    
        public int searchInsert(int[] nums, int target)
        {
            int i;
            for( i = 0; i<=nums.length-1; i++)
            {
                if(nums[i]<= target)
                {
                    if(nums[i] == target)
                    {
                        return i;
                    }
                    //else
                    //   break;
                }
                else
                    return i;

            }
            return i;

        }

}
