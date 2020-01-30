package input;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileMessageInput implements MessageInput {

    @Override
    public String getInputMessage() {
        String message = "";
        try {
            message = new String(Files.readAllBytes(Paths.get(ClassLoader.getSystemResource("inputMessage.txt").toURI())));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return message;
    }
}
