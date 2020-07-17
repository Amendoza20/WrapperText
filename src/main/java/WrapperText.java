import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WrapperText {
    public static void main(String[] args){
        try {
            String inputText = args[0];

            List<String> words = splitString(inputText);

            if (words.isEmpty()) {
                throw new NullPointerException();
            }

            int lineLength = 0;
            StringBuilder builder = new StringBuilder();
            for (String word : words) {
                if (lineLength + word.length() + 1 <= 13 && lineLength != 0) {
                    builder.append(" ").append(word);
                    lineLength += word.length() + 1;
                } else if (lineLength >= 13 || lineLength + word.length() + 1 > 13) {
                    builder.append("\n").append(word);
                    lineLength = word.length();
                } else {
                    builder.append(word);
                    lineLength += word.length();
                }
            }
            System.out.println(builder.toString());
        } catch (NullPointerException e) {
            System.out.println("Input invalid");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No input provided");
        }

    }
    public static List<String> splitString (String input){
        return Arrays.stream(input.split(" "))
                        .filter(word -> word.length() <= 13)
                        .collect(Collectors.toList());

    }
}
