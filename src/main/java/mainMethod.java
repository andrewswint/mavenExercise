import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class mainMethod {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter something...");
        String userInput = sc.nextLine();
        System.out.println("Is a number: " + StringUtils.isNumeric(userInput));
        System.out.println("Flipped Case: "+ StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));
    }

}
