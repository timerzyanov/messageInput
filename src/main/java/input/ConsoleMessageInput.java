package input;

import java.util.Scanner;

public class ConsoleMessageInput implements MessageInput {

    @Override
    public String getInputMessage() {
        System.out.println("Input: ");
        return new Scanner(System.in).nextLine();
    }
}
