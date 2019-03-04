public class medianoftwoarrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        System.out.println(n1);
        int n2=nums2.length;
        System.out.println(n2);
        int[] temp=new int[n1+n2];
        System.out.println(temp.length);
        int i=0,j=0,k=0;
        double ans;
        int middle= ((n1+n2)/2)+1;
        while(i<n1 && j<n2 && k<temp.length){
            if(nums1[i]<nums2[j]){
                temp[k]=nums1[i];
                System.out.println("i"+i);
                System.out.println("j"+j);
                System.out.println("k"+k);
                System.out.println("arr[k]"+temp[k]);
                k++;i++;
            }
            else if(nums1[i]>nums2[j]){
                temp[k]=nums2[j];
                System.out.println("i"+i);
                System.out.println("j"+j);
                System.out.println("k"+k);
                System.out.println("arr[k]"+temp[k]);
                k++;j++;
            }
            else if(nums1[i]==nums2[j]){
                temp[k]=nums1[i];
                System.out.println("i"+i);
                System.out.println("j"+j);
                System.out.println("k"+k);
                System.out.println("arr[k]"+temp[k]);
                k++;i++;
                temp[k]=nums2[j];
                System.out.println("i"+i);
                System.out.println("j"+j);
                System.out.println("k"+k);
                System.out.println("arr[k]"+temp[k]);
                k++;j++;
            }

        }
        while (i<n1 && k<temp.length){
            temp[k]=nums1[i];
            System.out.println("i"+i);
            System.out.println("j"+j);
            System.out.println("k"+k);
            System.out.println("arr[k]"+temp[k]);
            k++;i++;
        }
        while (j<n2 && k<temp.length){
            temp[k]=nums2[j];
            System.out.println("i"+i);
            System.out.println("j"+j);
            System.out.println("k"+k);
            System.out.println("arr[k]"+temp[k]);
            k++;j++;
        }

        //merge

        if(temp.length%2!=0){
            ans= temp[(temp.length)/2];
        }
        else
            ans= (temp[(temp.length-1)/2]+temp[((temp.length-1)/2)+1])/2.0;
        return ans;
    }

    public static void main(String args[]){
        medianoftwoarrays obj1= new medianoftwoarrays();
        int [] arr1={1,2};
        int [] arr2={3,4};
        System.out.println(obj1.findMedianSortedArrays(arr1,arr2));

    }
}
