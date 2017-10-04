package net.vergien.beanautoutils.demo;

import java.util.Arrays;
import java.util.List;

public class DemoWithoutAnnotation {
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("DemoWithoutAnnotation [intMember=");
    builder.append(intMember);
    builder.append(", boolenMember=");
    builder.append(boolenMember);
    builder.append(", longMember=");
    builder.append(longMember);
    builder.append(", shortMember=");
    builder.append(shortMember);
    builder.append(", floatMember=");
    builder.append(floatMember);
    builder.append(", doubleMember=");
    builder.append(doubleMember);
    builder.append(", byteMember=");
    builder.append(byteMember);
    builder.append(", nonPrimitiveMmber=");
    builder.append(nonPrimitiveMmber);
    builder.append(", intArrayMember=");
    builder.append(Arrays.toString(intArrayMember));
    builder.append(", nonPrimitiveArrayMember=");
    builder.append(Arrays.toString(nonPrimitiveArrayMember));
    builder.append("]");
    return builder.toString();
  }
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (boolenMember ? 1231 : 1237);
    result = prime * result + byteMember;
    long temp;
    temp = Double.doubleToLongBits(doubleMember);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + Float.floatToIntBits(floatMember);
    result = prime * result + Arrays.hashCode(intArrayMember);
    result = prime * result + intMember;
    result = prime * result + (int) (longMember ^ (longMember >>> 32));
    result = prime * result + Arrays.hashCode(nonPrimitiveArrayMember);
    result = prime * result + ((nonPrimitiveMmber == null) ? 0 : nonPrimitiveMmber.hashCode());
    result = prime * result + shortMember;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    DemoWithoutAnnotation other = (DemoWithoutAnnotation) obj;
    if (boolenMember != other.boolenMember) {
      return false;
    }
    if (byteMember != other.byteMember) {
      return false;
    }
    if (Double.doubleToLongBits(doubleMember) != Double.doubleToLongBits(other.doubleMember)) {
      return false;
    }
    if (Float.floatToIntBits(floatMember) != Float.floatToIntBits(other.floatMember)) {
      return false;
    }
    if (!Arrays.equals(intArrayMember, other.intArrayMember)) {
      return false;
    }
    if (intMember != other.intMember) {
      return false;
    }
    if (longMember != other.longMember) {
      return false;
    }
    if (!Arrays.equals(nonPrimitiveArrayMember, other.nonPrimitiveArrayMember)) {
      return false;
    }
    if (nonPrimitiveMmber == null) {
      if (other.nonPrimitiveMmber != null) {
        return false;
      }
    } else if (!nonPrimitiveMmber.equals(other.nonPrimitiveMmber)) {
      return false;
    }
    if (shortMember != other.shortMember) {
      return false;
    }
    return true;
  }


}
