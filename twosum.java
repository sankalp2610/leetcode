public class twosum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){

                if(nums[i]+nums[j]==target){
                    int[] arr= {i,j};
                    return arr;
                }

            }
        }
        return new int[]{-1};

    }
    public static void main(String args[]){
        int[] nums={2, 7, 11, 15};
        int target=9;
        twosum obj1= new twosum();
        System.out.println(obj1.twoSum(nums,target));
    }
}
