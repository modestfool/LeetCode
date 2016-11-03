/**
 * @author: basavakanaparthi
 * on 26,Oct,2016 at 5:03 PM.
 */
/*
 Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2


 */
public class TwoSum_II_167 {
    public int[] twoSum(int[] numbers, int target)
    {
        int[] ans = {-1,-1};
        int ind1 = 0;
        int ind2 = numbers.length-1;
        while(ind1 < ind2)
        {
            long sum = numbers[ind1]+ numbers[ind2];
            if (sum == target)
            {
                ans[0] = ind1+1;
                ans[1] = ind2+1;
                break;
            }
            else if (sum < target)
                ind1++;
            else
                ind2--;
        }
        return ans;
    }
}
