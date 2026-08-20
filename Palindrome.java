public class Palindrome {
     public boolean isPalindrome(int x) {
             if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;

        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return x == reversed || x == reversed / 10;
    }
    public static void main(String[] args){
        int num=121;
        Palindrome solver=new Palindrome();
        boolean result=solver.isPalindrome(num);
        System.out.print(num + " isPalindrome: " + result);
    }

}
