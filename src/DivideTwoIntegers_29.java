/**
 * @author: basavakanaparthi
 * on 26,Oct,2016 at 5:12 PM.
 */
/*
    Divide two integers without using multiplication, division and mod operator.

If it is overflow, return MAX_INT.


 */
public class DivideTwoIntegers_29
{
    public static int divide(int dividend, int divisor)
    {
        int quotient = 0;
        boolean isNegative = (dividend < 0 ) ^ (divisor < 0);
        long dividendL = Math.abs((long)dividend);
        long divisorL = Math.abs((long)divisor);
        boolean flip = (dividendL < 0 ) ^ (divisorL < 0);
        System.out.println(dividendL);
        System.out.println(divisorL);
        while(dividend != 0)
        {
            if ((dividendL - divisorL <= Integer.MIN_VALUE) || ((dividendL -
                    divisorL >= Integer.MAX_VALUE)))
                return Integer.MAX_VALUE;
            dividendL -= divisorL;
            if ((dividendL < 0 ) ^ (divisorL < 0) != flip)
                break;
            quotient++;
        }
        return (isNegative)?-1*quotient:quotient;
    }

    public static void main(String[] args) {
        System.out.println(divide(Integer.MIN_VALUE,-1));
    }
}
