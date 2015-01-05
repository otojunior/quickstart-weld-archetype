package ${package};

import java.util.List;

import org.jboss.weld.environment.se.events.ContainerInitialized;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main App test class.
 * @author [Author name]
 */
public class AppTest {
	/**
	 * SLF4J Logger.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(AppTest.class);
	
	/**
	 * Class to be tested.
	 */
	private App app;

	/**
	 * {@inheritDoc}
	 */
	@Before
	public void setUp() throws Exception {
		LOG.trace("Test setup");
		app = new App();
	}

	/**
	 * {@inheritDoc}
	 */
	@After
	public void tearDown() throws Exception {
		LOG.trace("Test teardown");
		app = null;
	}

	/**
	 * aMethod method test.
	 */
	@Test
	public void testEntryPoint() {
		ContainerInitialized event = null;
		List<String> parameters = null;
		
		app.entryPoint(event, parameters);
	}
}
