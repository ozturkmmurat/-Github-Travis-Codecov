package tr.edu.medipol.yazarac;

import java.math.BigDecimal;

public class Carpma implements Hesap {

	@Override
	public String sonucuBul(String sayi1, String sayi2) {
		return new BigDecimal(sayi1)
				.multiply(new BigDecimal(sayi2))
				.toString();
	}

}
