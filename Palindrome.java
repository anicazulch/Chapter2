public class Palindrome
{
    // instance variables - replace the example below with your own
    public String word;
    private boolean isPalindrome;
    /**
     * Constructor for objects of class Palindrome
     */
    public Palindrome(String wd)
    {
        // initialise instance variables
        this.word = wd;
    }
    public boolean testPalindrome() {
        //Determine if word is palindrome
        String tempWord = "";
        for(int i = 0; i < word.length(); i++) {
            System.out.println(word.substring(i, i+1));
            tempWord += word.substring (word.length() - 1, i );
        }
        System.out.println("The word is: " + tempWord);
        //Set isPalindrome
        
        return isPalindrome;
    }
}
