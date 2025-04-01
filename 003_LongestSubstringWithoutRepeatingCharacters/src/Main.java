import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String : ");
        String input = scanner.nextLine();

        System.out.print("Longest substring length : " + lengthOfLongestSubstring(input));

    }

    public static int lengthOfLongestSubstring(String s) {

        int left = 0;
        int maxLength = 0;

        Set<Character> characterSet = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {

            while (characterSet.contains(s.charAt(right))) {
                characterSet.remove(s.charAt(left));
                left++;
            }

            characterSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;

    }

}