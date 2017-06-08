import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BUTest.class, EvmTest.class, VoterTest.class })
public class AllTests {

}
