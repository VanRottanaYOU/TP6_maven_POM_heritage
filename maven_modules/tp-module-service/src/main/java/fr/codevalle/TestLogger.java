package fr.codevalle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogger {

	private static final Logger LOG = LoggerFactory.getLogger(TestLogger.class);

	public void afficherLog(String args) {
		// LOG.info("Bonjour Slf4J !");
		// LOG.info("Implémentation Logback");
		LOG.info(args);
		// System.out.println(args[0]);
	}

}
