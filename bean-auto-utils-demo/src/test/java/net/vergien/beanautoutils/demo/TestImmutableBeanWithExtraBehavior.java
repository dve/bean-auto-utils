package net.vergien.beanautoutils.demo;

import org.junit.jupiter.api.Test;
import nl.jqno.equalsverifier.EqualsVerifier;

class TestImmutableBeanWithExtraBehavior {


  @Test
  void test() {
    EqualsVerifier.forClass(ImmutableBeanWithExtraBehavior.class).verify();
  }

}
