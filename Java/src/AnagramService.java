import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramService {

    public List<AnagramCounter> compute(String dictionaryLocation) throws IOException {
        List<String> words = FileUtils.readLines(new File(dictionaryLocation));

        for (String word : words) {
            // TODO: process word
            System.out.println("TODO process word: " + word);
        }

        // TODO: This is just a placeholder - you should change this
        return new ArrayList<>(Arrays.asList(
                        new AnagramCounter(1, 0),
                        new AnagramCounter(2, 0),
                        new AnagramCounter(3, 0),
                        new AnagramCounter(4, 0),
                        new AnagramCounter(5, 0),
                        new AnagramCounter(6, 0),
                        new AnagramCounter(7, 0),
                        new AnagramCounter(8, 0),
                        new AnagramCounter(9, 0),
                        new AnagramCounter(10, 0)
                ));
    }
}

