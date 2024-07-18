import java.util*.;


class Palindrome {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String newWord = "";
        System.out.println("Please enter keyword");
        String keyword = scan.nextLine().toLowercase();
        int kwLength = keyword.length();

        boolean isPali = false;

        for(int i = kwLength - 1; i > 0; i--){
            newWord += newWord.indexOf(i);

        }

        if (newWord.equalsTo(keyword) || keyword.equalsTo(newWord)){
            isPali = true;
        }

        if(isPali == true)
        {
            System.out.println("This word is a Palindrome");

        }
        else
        {
            System.out.println("This word is not a palindrome");
        }
    }
}
