/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("No input provided");
            return;
        }
        int T = sc.nextInt();  // number of test cases
        while (T > 0)
        {
            if (!sc.hasNextInt()) {
                System.out.println("Insufficient input");
                break;
            }
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
            {
                if (!sc.hasNextInt()) {
                    System.out.println("Insufficient input");
                    break;
                }
                arr[i] = sc.nextInt();
            }
            Map<Long, Integer> map = new HashMap<>();
            long sum = 0;
            for (int i = 0; i < n; i++)
            {
                sum += arr[i];
                long val = sum % n;
                if (val == 0)
                {
                    System.out.println(i + 1);
                    for (int k = 0; k <= i; k++)
                    {
                        System.out.print((k + 1) + " ");
                    }
                    System.out.println();
                    break;
                }
                else {
                    if (map.containsKey(val))
                    {
                        int j = map.get(val);
                        System.out.println(i - j);
                        for (int k = j + 1; k <= i; k++)
                        {
                            System.out.print((k+1) + " ");
                        }
                        System.out.println();
                        break;
                    }
                    else {
                        map.put(val, i);
                    }
                }
            }
            T--;
        }
        sc.close();
    }
}
