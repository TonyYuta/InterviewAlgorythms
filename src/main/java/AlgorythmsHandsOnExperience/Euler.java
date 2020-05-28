package AlgorythmsHandsOnExperience;

public class Euler {


    public static void main(String[] args) {
        Euler euler = new Euler();
       System.out.println( euler.LargestPalindromeProductProblem4(2));
    }

    /**
     * Largest palindrome product
     *
     * Problem 4
     * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
     *
     * Find the largest palindrome made from the product of two 3-digit numbers.
     */
    private int LargestPalindromeProductProblem4(int digits) {
        StringBuffer rev;
        int result = 0;
        int palindrome = 0;
        for (int i = 10; i < 100; i++ ) {
            rev = new StringBuffer(String.valueOf(i)).reverse();
            if(String.valueOf(i).equals(rev.toString()))
                palindrome = Integer.parseInt(String.valueOf(i) + rev.toString());
            if(palindrome > result)
                result = palindrome;
        }
        return result;
    }




}
