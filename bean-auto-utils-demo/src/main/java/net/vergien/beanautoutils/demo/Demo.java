package net.vergien.beanautoutils.demo;

import java.util.List;
import net.vergien.beanautoutils.annotation.Bean;

@Bean
public class Demo {
  private int intMember;
  private boolean boolenMember;
  private long longMember;
  private short shortMember;
  private float floatMember;
  private double doubleMember;
  private byte byteMember;
  private List<String> nonPrimitiveMmber;
  private int[] intArrayMember;
  private String[] nonPrimitiveArrayMember;

  @Override
  public int hashCode() {
    return DemoBeanUtil.doToHashCode(this);
  }

  @Override
  public String toString() {
    return DemoBeanUtil.doToString(this);
  }

  @Override
  public boolean equals(Object obj) {
    return DemoBeanUtil.doEquals(this, obj);
  }

  public int getIntMember() {
    return intMember;
  }

  public void setIntMember(int intMember) {
    this.intMember = intMember;
  }

  public boolean isBoolenMember() {
    return boolenMember;
  }

  public void setBoolenMember(boolean boolenMember) {
    this.boolenMember = boolenMember;
  }

  public long getLongMember() {
    return longMember;
  }

  public void setLongMember(long longMember) {
    this.longMember = longMember;
  }

  public short getShortMember() {
    return shortMember;
  }

  public void setShortMember(short shortMember) {
    this.shortMember = shortMember;
  }

  public float getFloatMember() {
    return floatMember;
  }

  public void setFloatMember(float floatMember) {
    this.floatMember = floatMember;
  }

  public double getDoubleMember() {
    return doubleMember;
  }

  public void setDoubleMember(double doubleMember) {
    this.doubleMember = doubleMember;
  }

  public byte getByteMember() {
    return byteMember;
  }

  public void setByteMember(byte byteMember) {
    this.byteMember = byteMember;
  }

  public List<String> getNonPrimitiveMmber() {
    return nonPrimitiveMmber;
  }

  public void setNonPrimitiveMmber(List<String> nonPrimitiveMmber) {
    this.nonPrimitiveMmber = nonPrimitiveMmber;
  }

  public int[] getIntArrayMember() {
    return intArrayMember;
  }

  public void setIntArrayMember(int[] intArrayMember) {
    this.intArrayMember = intArrayMember;
  }

  public String[] getNonPrimitiveArrayMember() {
    return nonPrimitiveArrayMember;
  }

  public void setNonPrimitiveArrayMember(String[] nonPrimitiveArrayMember) {
    this.nonPrimitiveArrayMember = nonPrimitiveArrayMember;
  }
}
