package tr.edu.medipol.yazarac;

import static org.junit.Assert.*;
import org.junit.*;

public class ToplamaTest {

	@Test
	public void testPozitifSayiToplama() {
		// Given - Kosullar/On sartlar
		Hesap toplama = new Toplama();
		String sayi1 = "100";
		String sayi2 = "10000";
		
		// When - Yapilan islem
		String sonuc = toplama.sonucuBul(sayi1, sayi2);
		
		// Then - Kontrol
		assertEquals("10100", sonuc);
	}
	
	@Test
	public void testNegatifSayiToplama() {
		// Given - Kosullar/On sartlar
		Hesap toplama = new Toplama();
		String sayi1 = "-100";
		String sayi2 = "-10000";
		
		// When - Yapilan islem
		String sonuc = toplama.sonucuBul(sayi1, sayi2);
		
		// Then - Kontrol
		assertEquals("-10100", sonuc);
	}
	
	@Test
	public void testSifirIleToplama() {
		// Given - Kosullar/On sartlar
		Hesap toplama = new Toplama();
		String sayi1 = "1000";
		String sayi2 = "0";
		
		// When - Yapilan islem
		String sonuc = toplama.sonucuBul(sayi1, sayi2);
		
		// Then - Kontrol
		assertEquals("1000", sonuc);
	}
	
	@Test
	public void testBuyukSayiToplama() {
		// Given - Kosullar/On sartlar
		Hesap toplama = new Toplama();
		String sayi1 = "1909000000000000000000";
		String sayi2 = "8090000000000000000000";
		
		// When - Yapilan islem
		String sonuc = toplama.sonucuBul(sayi1, sayi2);
		
		// Then - Kontrol
		assertEquals("9999000000000000000000", sonuc);
	}
	
}
