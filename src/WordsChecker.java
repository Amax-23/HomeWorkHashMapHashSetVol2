
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    //выбрал HashSet, так как скорость поиска по ней О(1)
    public boolean hasWord(String word) {
        Set<String> set = new HashSet<>(Arrays.asList(text.split("\\P{IsAlphabetic}+")));
        return set.contains(word);
    }
}
