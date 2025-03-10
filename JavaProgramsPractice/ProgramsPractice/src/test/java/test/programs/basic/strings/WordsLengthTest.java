package test.programs.basic.strings;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WordsLengthTest {

    WordsLength word = new WordsLength();

    @Test
    void testEvenWordsLength() {
        Assert.assertEquals(word.printWords("I am"), new String[]{"am", null});
    }

}
