public class medianof2sortedarray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength=(nums1.length+nums2.length);
        boolean odd=totalLength%2==0?false:true;
        int median=totalLength/2;
        int sum=0;
        double res=0;
        if(median<nums1.length)
        {
            sum+=nums1[median];
            if(!odd && median+1<nums1.length)
            {
                sum+=nums1[++median];
            }else if(!odd && median+1>nums1.length)
            {
                sum+=nums2[0];
            }
        }else
        {
            sum+=nums2[median];
            if(!odd)
            {
                sum+=nums2[median+1];
            }
        }
        res=(sum/2);
        return res;

    }
}
