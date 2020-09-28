package translator;

import java.util.HashMap;
import java.util.Map;

public class Translator {
	
	Map<String, String> morseCode = new HashMap<>();
	
	public void fillMorse()
	{
		morseCode.put(".-", "a");
		morseCode.put("-...", "b");
		morseCode.put("-.-.", "c");
		morseCode.put("-..", "d");
		morseCode.put(".", "e");
		morseCode.put("..-.", "f");
		morseCode.put("--.", "g");
		morseCode.put("....", "h");
		morseCode.put("..", "i");
		morseCode.put(".---", "j");
		morseCode.put("-.-", "k");
		morseCode.put(".-..", "l");
		morseCode.put("--", "m");
		morseCode.put("-.", "n");
		morseCode.put("---", "o");
		morseCode.put(".--.", "p");
		morseCode.put("--.-", "q");
		morseCode.put(".-.", "r");
		morseCode.put("...", "s");
		morseCode.put("-", "t");
		morseCode.put("..-", "u");
		morseCode.put("...-", "v");
		morseCode.put(".--", "w");
		morseCode.put("-..-", "x");
		morseCode.put("-.--", "y");
		morseCode.put("--..", "z");
		morseCode.put(".----", "1");
		morseCode.put("..---", "2");
		morseCode.put("...--", "3");
		morseCode.put("....-", "4");
		morseCode.put(".....", "5");
		morseCode.put("-....", "6");
		morseCode.put("--...", "7");
		morseCode.put("---..", "8");
		morseCode.put("----.", "9");
		morseCode.put("-----", "0");
		morseCode.put("/", " ");
		
	}
	
	public String translateMorse(String code)
	{
		String translation = "";
		int i = 0;
		String splitCode[] = code.split(" ");
		while(i<splitCode.length)
		{
			translation += morseCode.get(splitCode[i]);
			i++;
		}
		return translation;
	}
}
