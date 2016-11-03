import java.util.LinkedList;
import java.util.List;

/**
 * @author: basavakanaparthi
 * on 28,Oct,2016 at 8:20 PM.
 */
/*
    A peak element is an element that is greater than its neighbors.

Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that num[-1] = num[n] = -∞.

For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.

click to show spoilers.
 */
public class FindPeakElement
{
    public int findPeakElement(int[] nums)
    {
        List<Integer> a = new LinkedList<>();
        if (nums == null || nums.length == 0)
            return -1;
        if (nums.length == 1)
            return 0;
        int peakInd = 0;
        for (int i = 0; i < nums.length-2; i++)
        {
            if ((nums[i] < nums[i+1]) && nums[i+1] > nums[i+2])
                return i+1;
        }
        if(nums[nums.length - 1] > nums[nums.length-2])
            return nums.length - 1;
        return peakInd;
    }
}
