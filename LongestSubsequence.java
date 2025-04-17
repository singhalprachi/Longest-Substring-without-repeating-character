import java.util.Scanner;

class LongestSubsequence{
    public static int lengthOfLongestSubstring(String s){
        int n = s.length();
        if(n==0){
            return 0;
        }
        int maxLength= 0;
        int [] charIndex= new int[256];
        int left=0, right=0;
        while(right<n){
            char currentChar = s.charAt(right);
            if(charIndex[currentChar]>0){
                left = Math.max(charIndex[currentChar],left);

            }
            charIndex[currentChar]=right +1;
            maxLength = Math.max(maxLength , right- left+1);
            right++;

        }
        return maxLength;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=  sc.nextLine();
        sc.close();
        int length = lengthOfLongestSubstring(s);
        System.out.println("Longest subsequence is " +length);

    }





}