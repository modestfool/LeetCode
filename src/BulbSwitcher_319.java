/**
 * @author: basavakanaparthi
 * on 25,Oct,2016 at 6:38 PM.
 */
public class BulbSwitcher_319 {
        public static int bulbSwitch(int n)
        {
            if(n <= 0)
                return 0;
            int count = 1;
            for(int i = 2; i <= n; i++)
            {
                if (numOfDivisors(i) % 2 == 1)
                {
                    System.out.println(i);
                    count++;
                }
            }
            return count;
        }

        public static int numOfDivisors(int n)
        {
            int i = 2;
            int div = 0;
            for (; i*i <= n; i++)
            {
                if(n % i == 0)
                    div++;
            }
            return div;
        }

    public static void main(String[] args) {
        System.out.println(bulbSwitch(6));
    }
    }
