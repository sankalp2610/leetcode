public class watercontainer {
    public int maxArea(int[] height) {
        int waterheight=0;
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){//choti wali value multiply
                if((j-i)*(height[j]>height[i]?height[i]:height[j])>waterheight) {
                    waterheight = (j - i) * (height[j]>height[i]?height[i]:height[j]);
                    System.out.println("j" + j + "i" + i);
                }
            }
        }
            //index,min ht
        return waterheight;
    }

    public static void main(String args[]){
        int[] height={1,8,6,2,5,4,8,3,7};
        watercontainer obj1=new watercontainer();
        System.out.println(obj1.maxArea(height));
    }
}
