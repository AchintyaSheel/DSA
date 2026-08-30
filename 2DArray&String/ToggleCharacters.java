import java.util.Scanner;
public class ToggleCharacters{
    public String toggleCase(String s) {

        // StringBuilder is used to build the final answer character by character.
        // We use StringBuilder instead of String concatenation because Strings
        // are immutable in Java. StringBuilder is more efficient for repeated
        // modifications.
        //
        // Example:
        // Input:  "Hello"
        // Initially: sb = ""
        StringBuilder sb = new StringBuilder();

        // Loop through every character of the input string.
        //
        // s.length() gives the total number of characters in the string.
        // i starts from 0 because String indexing in Java starts from 0.
        //
        // Example:
        // s = "Hello"
        // Index:  0 1 2 3 4
        // Char:   H e l l o
        for (int i = 0; i < s.length(); i++) {

            // Get the character present at index i.
            //
            // Example:
            // If i = 0, ch = 'H'
            // If i = 1, ch = 'e'
            char ch = s.charAt(i);

            // Check whether the character is a lowercase English letter.
            //
            // 'a' has ASCII value 97
            // 'z' has ASCII value 122
            //
            // So this condition checks:
            // Is ch between 'a' and 'z'?
            if (ch >= 'a' && ch <= 'z') {

                // Convert the lowercase character into uppercase.
                //
                // We calculate how far ch is from 'a'.
                //
                // Example:
                // ch = 'c'
                //
                // 'c' - 'a' = 2
                //
                // 'A' + 2 = 'C'
                //
                // Therefore, 'c' becomes 'C'.
                //
                // The same logic works for every lowercase letter:
                //
                // 'a' -> 'A'
                // 'b' -> 'B'
                // 'c' -> 'C'
                // ...
                // 'z' -> 'Z'
                char upperCase = (char) ('A' + (ch - 'a'));

                // Add the converted uppercase character to StringBuilder.
                sb.append(upperCase);
            }

            // If the character is not lowercase, check whether
            // it is an uppercase English letter.
            //
            // 'A' has ASCII value 65
            // 'Z' has ASCII value 90
            //
            // Therefore, this condition checks:
            // Is ch between 'A' and 'Z'?
            else if (ch >= 'A' && ch <= 'Z') {

                // Convert the uppercase character into lowercase.
                //
                // Example:
                // ch = 'C'
                //
                // 'C' - 'A' = 2
                //
                // 'a' + 2 = 'c'
                //
                // Therefore, 'C' becomes 'c'.
                //
                // Similarly:
                // 'A' -> 'a'
                // 'B' -> 'b'
                // ...
                // 'Z' -> 'z'
                char lowerCase = (char) ('a' + (ch - 'A'));

                // Add the converted lowercase character to StringBuilder.
                sb.append(lowerCase);
            }

            // If the character is neither uppercase nor lowercase,
            // we don't change it.
            //
            // This includes:
            // - Numbers: 0, 1, 2, ...
            // - Spaces
            // - Special characters: !, @, #, $, %, etc.
            //
            // Example:
            // '1' remains '1'
            // ' ' remains ' '
            // '!' remains '!'
            else {
                sb.append(ch);
            }
        }

        // After processing all characters, convert StringBuilder
        // into a String and return it.
        //
        // Example:
        // Input:  "Hello 123!"
        // Output: "hELLO 123!"
        return sb.toString();
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        ToggleCharacters obj = new ToggleCharacters();
        String result = obj.toggleCase(s);

        System.out.println("Toggled string: " + result);

        sc.close();

    }

}