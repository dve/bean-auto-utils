package net.vergien.beanautoutils.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestAnotherBean {

  @Test
  public void test() {
    AnotherBean a = new AnotherBean();
    AnotherBean b = new AnotherBean();
    assertTrue(a.equals(b), "AnotherBeanUtil.class should exist");
  }

}
