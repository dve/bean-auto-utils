package net.vergien.beanautoutils.demo;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class TestDemoEquals {
  private Demo demo;
  private Demo other;

  @Before
  public void setUp() {
    demo = new Demo();
    other = new Demo();
  }

  @Test
  public void testEquals_differntClass() {
    assertThat(demo.equals(new ArrayList<String>()), is(false));
  }

  @Test
  public void testEquals_sameInstance() {
    assertThat(demo.equals(demo), is(true));
  }

  @Test
  public void testEquals_null() {
    assertThat(demo.equals(null), is(false));
  }

  @Test
  public void testEquals_newClass() {
    assertThat(demo.equals(other), is(true));
  }

  @Test
  public void testEquals_boolean() {
    other.setBoolenMember(true);
    assertThat(demo.equals(other), is(false));
  }

  @Test
  public void testEquals_int() {
    other.setIntMember(123);
    assertThat(demo.equals(other), is(false));
  }

  @Test
  public void testEquals_long() {
    other.setLongMember(123L);
    assertThat(demo.equals(other), is(false));
  }

  @Test
  public void testEquals_short() {
    other.setShortMember((short) 1);
    assertThat(demo.equals(other), is(false));
  }

  @Test
  public void testEquals_float() {
    other.setFloatMember(1.2f);
    assertThat(demo.equals(other), is(false));
  }

  @Test
  public void testEquals_double() {
    other.setDoubleMember(1.2d);
    assertThat(demo.equals(other), is(false));
  }

  @Test
  public void testEquals_byte() {
    other.setByteMember(new Byte("1"));
    assertThat(demo.equals(other), is(false));
  }

  @Test
  public void testEquals_array() {
    other.setArrayMember(new int[] {1, 2});
    assertThat(demo.equals(other), is(false));
  }

  @Test
  public void testEquals_nonPrimitive_thisNotNull() {
    demo.setNonPrimitiveMember(new ArrayList<>());
    assertThat(demo.equals(other), is(false));
  }

  @Test
  public void testEquals_nonPrimitive_otherNotNull() {
    other.setNonPrimitiveMember(new ArrayList<>());
    assertThat(demo.equals(other), is(false));
  }

  @Test
  public void testEquals_nonPrimitive() {
    ArrayList<String> nonPrimitiveMember = new ArrayList<>();
    nonPrimitiveMember.add("This makes the different");
    other.setNonPrimitiveMember(nonPrimitiveMember);
    assertThat(demo.equals(other), is(false));
  }

  @Test
  public void testEquals_nonPrimitive_equals() {
    ArrayList<String> otherNonPrimitiveMember = new ArrayList<>();
    otherNonPrimitiveMember.add("This is the same");
    other.setNonPrimitiveMember(otherNonPrimitiveMember);

    ArrayList<String> thisNonPrimitiveMember = new ArrayList<>();
    thisNonPrimitiveMember.add("This is the same");
    demo.setNonPrimitiveMember(thisNonPrimitiveMember);
    assertThat(demo.equals(other), is(true));
  }
}
