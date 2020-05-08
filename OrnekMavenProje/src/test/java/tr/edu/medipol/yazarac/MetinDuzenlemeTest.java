package tr.edu.medipol.yazarac;

import org.junit.*;

public class MetinDuzenlemeTest {

	@Test
	public void testHarfleriBuyut() {
		// On kosullar - Given
		MetinDuzenleme m = new MetinDuzenleme();
		String orjinalMetin = "medipol";
		String beklenenSonuc = "MEDIPOL";
		
		// Birimin test edilmesi - When
		String gercekSonuc = m.harfleriBuyut(orjinalMetin);
		
		// Test asamasi - Then
		Assert.assertEquals(beklenenSonuc, gercekSonuc);
	}
}
