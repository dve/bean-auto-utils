package net.vergien.beanautoutils.demo;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class DemoTest {

  @Test
  public void testUse() {
    Demo testBean = new Demo();
    assertThat(testBean.toString(), is("Hello, World!"));

  }
}
