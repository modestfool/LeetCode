import java.util.Scanner;

/**
 * @author: basavakanaparthi
 * on 24,Oct,2016 at 2:03 AM.
 */
/*
   Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...

    Note:
    n is positive and will fit within the range of a 32-bit signed integer (n < 231).

    Example 1:

    Input:
    3

    Output:
    3
    Example 2:

    Input:
    11

    Output:
    0

    Explanation:
    The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0,
    which is part of the number 10.
 */
public class NthDigit
{
    public static int findNthDigit(int n)
    {

        if (n < 10)
            return n;
        int start = 1;
        int len = 1;
        long count = 9;
        while(n > len*count)
        {
            n -= len*count;
            start *= 10;
            count *= 10;
            len++;
        }
        start += (n - 1) / len;
        System.out.println(start + " " + n + " " + len);
        String s = Integer.toString(start);
        return Character.getNumericValue(s.charAt((n - 1) % len));

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true)
        {
            System.out.println(findNthDigit(in.nextInt()));
        }
    }
}
