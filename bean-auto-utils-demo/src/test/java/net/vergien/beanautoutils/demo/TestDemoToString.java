package net.vergien.beanautoutils.demo;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class TestDemoToString {

  @Test
  public void testToString() {
    assertThat(new Demo().toString(), endsWith(
        "[intMember=0, boolenMember=false, longMember=0, shortMember=0, floatMember=0.0, doubleMember=0.0, byteMember=0, arrayMember=null, nonPrimitiveMember=null]"));
  }

  @Test
  public void testToString_sameInstance() {
    Demo demo = new Demo();
    assertThat(demo.toString(), is(demo.toString()));
  }

  @Test
  public void testToString_differentInstance() {
    assertThat(new Demo().toString(), is(not(new Demo().toString())));
  }
}
