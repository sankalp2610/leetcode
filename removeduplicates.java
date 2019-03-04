public class removeduplicates {
    public int removeDuplicates(int[] nums) {
        int i=0,count=0,j=1;
        while (i<=nums.length && j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                nums[count]=nums[j];
                count++;
                i++;
                j++;
            }
        }


        return count;
    }

    public static void main(String args[]){
        removeduplicates obj1= new removeduplicates();
        int[] nums={1,1,2};
        System.out.println(obj1.removeDuplicates(nums));
    }

}
