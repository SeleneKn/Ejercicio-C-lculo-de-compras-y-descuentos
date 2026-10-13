import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraPreciosTest {
   PurchaseCalculator PurchaseCalculators = new PurchaseCalculator();

   @Test
   @DisplayName("Test method for multiplication()")
   void TestMultiplication(){
       assertEquals(0, PurchaseCalculators.calculateSubtotal(0,0));
       assertEquals(1, PurchaseCalculators.calculateSubtotal(1,1));
       assertEquals(4, PurchaseCalculators.calculateSubtotal(2,2));
       assertEquals(-15, PurchaseCalculators.calculateSubtotal(3,-5));
   }  // TestMultiplication
} // CalculadoraPreciosTest
