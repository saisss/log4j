package mavenlog;




import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;




public class MavenLog4j {
	
	
	@Test
	public void logs()
	{
		Logger log=LogManager.getLogger(MavenLog4j.class);
		log.info("welcome to new line");
		log.trace("trace the message");
		log.debug("debug the line");
		log.info("testcase is opened");
		log.warn("it is warn message");
		log.error("it is error message");
		log.fatal("high level error message");
		
	}
	

}

	

