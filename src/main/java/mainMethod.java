import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class mainMethod {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter something...");
        String userInput = sc.nextLine();
//        System.out.println("Is a number: " + StringUtils.isNumeric(userInput));
//        System.out.println("Flipped Case: "+ StringUtils.swapCase(userInput));
//        System.out.println("Reversed: " + StringUtils.reverse(userInput));
//        System.out.println("is the input empty: " + StringUtils.isEmpty(userInput));
////        space is blank but not empty
//        System.out.println("is isBlank different?: " + StringUtils.isBlank(userInput));

        System.out.println("replace: " + StringUtils.replace(userInput, "-", ";"));
        System.out.println("rotate: " + StringUtils.reverse(userInput));

    }

}
