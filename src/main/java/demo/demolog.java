package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class demolog {
	static Logger logger = LogManager.getLogger(demolog.class.getName());
	public static void sample(int l)
	{
		if(l==1) {
			logger.trace("tracking");
		}
		else if(l==2){
			logger.info("started the test");
		}
		else if(l==3) {
			logger.error("error occured");
		}
		else if(l==4) {
			logger.fatal("fatal error occured");
		}
		else if(l==5){
			logger.info("ending the test");
		}
	}
}
