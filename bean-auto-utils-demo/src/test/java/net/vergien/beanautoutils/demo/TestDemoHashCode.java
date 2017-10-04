package net.vergien.beanautoutils.demo;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import java.util.ArrayList;
import org.junit.Test;

public class TestDemoHashCode {

  @Test
  public void testHashCode() {
    Demo demo = new Demo();
    assertThat(demo.hashCode(), is(demo.hashCode()));
  }

  @Test
  public void testHashCode_boolean() {
    Demo lhs = new Demo();
    Demo rhs = new Demo();
    rhs.setBoolenMember(true);
    assertThat(lhs.hashCode(), is(not((rhs.hashCode()))));
  }

  @Test
  public void testHashCode_nonPrimitive() {
    Demo lhs = new Demo();
    Demo rhs = new Demo();
    rhs.setNonPrimitiveMmber(new ArrayList<>());
    assertThat(lhs.hashCode(), is(not((rhs.hashCode()))));
  }
}


