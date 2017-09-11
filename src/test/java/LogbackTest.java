
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {
	
	private static Logger logger=LoggerFactory.getLogger(LogbackTest.class);

	@Test
	public void test() {
		
		logger.info("======================info test");
		logger.debug("=====================debug test");
		
	}

}
