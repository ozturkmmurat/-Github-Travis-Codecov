package tr.edu.medipol.yazarac;

import java.util.Locale;

public class MetinDuzenleme {

	public static void main(String[] args) {
		String sonuc = new MetinDuzenleme()
				.harfleriBuyut("medipol");
		System.out.println(sonuc);
	}
	
	public String harfleriBuyut(String orjinalMetin) {
		return orjinalMetin.toUpperCase(Locale.ENGLISH);
	}

}
