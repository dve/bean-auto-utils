package net.vergien.beanautoutils.demo;

import java.util.List;
import net.vergien.beanautoutils.annotation.Bean;

@Bean
public class Demo<T> {
  public static final String A_CONSTANT = "This never changes.";
  private int intMember;
  private boolean boolenMember;
  private long longMember;
  private short shortMember;
  private float floatMember;
  private double doubleMember;
  private byte byteMember;
  private int[] arrayMember;
  private List<String> nonPrimitiveMember;
  private T typeVarMember;

  @Override
  public boolean equals(Object obj) {
    return DemoBeanUtil.doEquals(this, obj);
  }

  public T getTypeVarMember() {
    return typeVarMember;
  }

  public byte getByteMember() {
    return byteMember;
  }

  public double getDoubleMember() {
    return doubleMember;
  }

  public float getFloatMember() {
    return floatMember;
  }

  public int[] getArrayMember() {
    return arrayMember;
  }

  public int getIntMember() {
    return intMember;
  }

  public long getLongMember() {
    return longMember;
  }

  public List<String> getNonPrimitiveMember() {
    return nonPrimitiveMember;
  }

  public short getShortMember() {
    return shortMember;
  }

  @Override
  public int hashCode() {
    return DemoBeanUtil.doToHashCode(this);
  }

  public boolean isBoolenMember() {
    return boolenMember;
  }


  public void setBoolenMember(boolean boolenMember) {
    this.boolenMember = boolenMember;
  }

  public void setByteMember(byte byteMember) {
    this.byteMember = byteMember;
  }

  public void setDoubleMember(double doubleMember) {
    this.doubleMember = doubleMember;
  }

  public void setFloatMember(float floatMember) {
    this.floatMember = floatMember;
  }

  public void setArrayMember(int[] intArrayMember) {
    this.arrayMember = intArrayMember;
  }

  public void setIntMember(int intMember) {
    this.intMember = intMember;
  }

  public void setLongMember(long longMember) {
    this.longMember = longMember;
  }

  public void setNonPrimitiveMember(List<String> nonPrimitiveMember) {
    this.nonPrimitiveMember = nonPrimitiveMember;
  }

  public void setShortMember(short shortMember) {
    this.shortMember = shortMember;
  }

  @Override
  public String toString() {
    return DemoBeanUtil.doToString(this);
  }
}
