package translator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Translator codeBreaker = new Translator();
		String code = ".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-";
		String translation;
		codeBreaker.fillMorse();
		translation = codeBreaker.translateMorse(code);
		System.out.println(translation);
	}

}
