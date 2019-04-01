package net.vergien.beanautoutils.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import nl.jqno.equalsverifier.EqualsVerifier;

class TestImutableBean {

  @BeforeEach
  void setUp() throws Exception {}

  @Test
  void testEqualsObject() {
    EqualsVerifier.forClass(ImmutableBean.class).verify();
  }

}
