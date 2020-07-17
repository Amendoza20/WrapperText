
import org.junit.jupiter.api.Test;

import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class WrapperTextTest {

    @Test
    public void splitStringShould(){
        String inputText = "This is a string which contains words";
        List<String> words = WrapperText.splitString(inputText);
        assertNotNull(words);
        assertEquals(7,words.size());

    }


}