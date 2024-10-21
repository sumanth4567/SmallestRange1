
public class SmallestRange {
    public int smallestRangeI(int[] nums, int k) {
        int maxv=nums[0];
        int minv=nums[0];
        for(int i=0;i<nums.length;i++){
            minv=Math.min(minv,nums[i]);
            maxv=Math.max(maxv,nums[i]);
        }
        return (maxv-k) - (minv+k) < 0 ? 0 : (maxv-k) - (minv+k);
    }
    public static void main(String[] args) {
        SmallestRange sr =new SmallestRange();
        int[] nums={5,3,1,2,4,6};
        int k = 5;
        int result= sr.smallestRangeI(nums, k);
        System.out.println(result);
    }
}
