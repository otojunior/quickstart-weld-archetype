package ${package};

import java.util.List;

import javax.enterprise.event.Observes;

import org.jboss.weld.environment.se.bindings.Parameters;
import org.jboss.weld.environment.se.events.ContainerInitialized;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Application Main Class.
 * @author [Author name]
 */
public class App {
	/**
	 * SLF4J Logger.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	
	/**
	 * Entry point method.
	 * @param event Init event.
	 * @param parameters Command line parameters.
	 */
	public void entryPoint(@Observes ContainerInitialized event, @Parameters List<String> parameters) {
		LOG.info("${artifactId} Application. Parameters: " + parameters);
	}
}
