import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import abstractFactory.DemaTest;
import bridgePattern.BridgePatternDemoTest;
import commandPattern.CommandPatternDemoTest;
import decoratorPattern.DecoratorPatternDemoTest;
import factoryMethod.GeneratecostTest;
import statePattern.StatePatternDemoTest;

@RunWith(Suite.class)
@SuiteClasses({DemaTest.class,BridgePatternDemoTest.class,CommandPatternDemoTest.class,DecoratorPatternDemoTest.class,GeneratecostTest.class,StatePatternDemoTest.class})
public class AllTests {

}