package ch.nerdclock.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	public static Logger log=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	log.info("log something that will be useful.");
    	log.info("test");
    	log.debug("debug test");
    }
}
