package net.vergien.beanautoutils.demo;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestAnotherBean {

  @Test
  public void test() {
    AnotherBean a = new AnotherBean();
    AnotherBean b = new AnotherBean();
    assertTrue("AnotherBeanUtil.class should exist", a.equals(b));
  }

}
