import java.util.*;
/**
 * Entry point to auto-generated tests (generated by maven-hpi-plugin).
 * If this fails to compile, you are probably using Hudson &lt; 1.327. If so, disable
 * this code generation by configuring maven-hpi-plugin to &lt;disabledTestInjection&gt;true&lt;/disabledTestInjection&gt;.
 */
public class InjectedTest extends junit.framework.TestCase {
  public static junit.framework.Test suite() throws Exception {
    System.out.println("Running tests for "+"io.jenkins.plugins:stat-tool:1.0-SNAPSHOT");
    Map<String, Object> parameters = new HashMap<String, Object>();
    parameters.put("basedir","/Users/skygater/Desktop/jenkins-plugin/stat-tool-plugin");
    parameters.put("artifactId","stat-tool");
    parameters.put("packaging","hpi");
    parameters.put("outputDirectory","/Users/skygater/Desktop/jenkins-plugin/stat-tool-plugin/target/classes");
    parameters.put("testOutputDirectory","/Users/skygater/Desktop/jenkins-plugin/stat-tool-plugin/target/test-classes");
    parameters.put("requirePI","true");
    return org.jvnet.hudson.test.PluginAutomaticTestBuilder.build(parameters);
  }
}
