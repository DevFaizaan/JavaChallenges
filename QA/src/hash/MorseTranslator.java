package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MorseTranslator {

	
	private final Map<String, String> MORSE_MAP;

    public MorseTranslator(){
        this.MORSE_MAP = new HashMap<>();

        this.MORSE_MAP.put(".-", "a");
        // ...
        // ...
        // ...
        this.MORSE_MAP.put("--..", "z");

        this.MORSE_MAP.put("/", " ");
    }

    public String translate(String input) {
        return Arrays.stream(input.split(" "))
            .map(n -> this.MORSE_MAP.get(n))
            .collect(Collectors.joining(""));
    }
}
