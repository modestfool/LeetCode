import java.util.ArrayList;
import java.util.List;

/**
 * @author: basavakanaparthi
 * on 02,Nov,2016 at 8:48 PM.
 */
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums)
    {
        List<String> ranges = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        if (nums == null || nums.length == 0)
            return ranges;
        int prev = nums[0];
        int lowerBound = prev;
        int i = 0;
        sb.append(prev);
        for(i = 1; i <  nums.length; i++)
        {
            if (nums[i] != prev + 1)
            {
                if(prev != lowerBound)
                {
                    // System.out.println("Prev: " + prev + " Lower: " + lowerBound);
                    sb.append("->").append(prev);
                }
                // System.out.println("Prev: " + prev + " i: " + nums[i]);
                // System.out.println("Sb: " + sb.toString());
                ranges.add(sb.toString());
                sb = new StringBuilder();
                sb.append(nums[i]);
                lowerBound = nums[i];
            }
            prev = nums[i];
        }
        if (prev != lowerBound)
        {
            sb.append("->").append(prev);
        }
        ranges.add(sb.toString());
        return ranges;
    }
}
