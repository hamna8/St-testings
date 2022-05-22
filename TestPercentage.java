import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPercentage {

   @Test
   public void testPercent(){

	var percent1 = new Percentage();
	Assert.assertEquals(percent1.percent(0.75),75);
   }
}