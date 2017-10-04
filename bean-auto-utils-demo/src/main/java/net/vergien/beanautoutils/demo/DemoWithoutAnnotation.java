package net.vergien.beanautoutils.demo;

import java.util.Arrays;
import java.util.List;

public class DemoWithoutAnnotation {
  private int primitive;
  private short shortMember;
  private byte byteMember;

  private char charMember;

  private boolean boolenPrimitive;

  private long longMember;

  private double doubleMember;
  private double doubleMember2;
  private float floatMember;

  private List<String> nonPrimitive;
  private int[] primitiveArray;
  private String[] nonPrimitiveArray;

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("DemoWithoutAnnotation [primitive=");
    builder.append(primitive);
    builder.append(", shortMember=");
    builder.append(shortMember);
    builder.append(", byteMember=");
    builder.append(byteMember);
    builder.append(", charMember=");
    builder.append(charMember);
    builder.append(", boolenPrimitive=");
    builder.append(boolenPrimitive);
    builder.append(", longMember=");
    builder.append(longMember);
    builder.append(", doubleMember=");
    builder.append(doubleMember);
    builder.append(", doubleMember2=");
    builder.append(doubleMember2);
    builder.append(", floatMember=");
    builder.append(floatMember);
    builder.append(", nonPrimitive=");
    builder.append(nonPrimitive);
    builder.append(", primitiveArray=");
    builder.append(Arrays.toString(primitiveArray));
    builder.append(", nonPrimitiveArray=");
    builder.append(Arrays.toString(nonPrimitiveArray));
    builder.append("]");
    return builder.toString();
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
    if (boolenPrimitive != other.boolenPrimitive) {
      return false;
    }
    if (byteMember != other.byteMember) {
      return false;
    }
    if (charMember != other.charMember) {
      return false;
    }
    if (Double.doubleToLongBits(doubleMember) != Double.doubleToLongBits(other.doubleMember)) {
      return false;
    }
    if (Double.doubleToLongBits(doubleMember2) != Double.doubleToLongBits(other.doubleMember2)) {
      return false;
    }
    if (Float.floatToIntBits(floatMember) != Float.floatToIntBits(other.floatMember)) {
      return false;
    }
    if (longMember != other.longMember) {
      return false;
    }
    if (nonPrimitive == null) {
      if (other.nonPrimitive != null) {
        return false;
      }
    } else if (!nonPrimitive.equals(other.nonPrimitive)) {
      return false;
    }
    if (!Arrays.equals(nonPrimitiveArray, other.nonPrimitiveArray)) {
      return false;
    }
    if (primitive != other.primitive) {
      return false;
    }
    if (!Arrays.equals(primitiveArray, other.primitiveArray)) {
      return false;
    }
    if (shortMember != other.shortMember) {
      return false;
    }
    return true;
  }

  public byte getByteMember() {
    return byteMember;
  }

  public char getCharMember() {
    return charMember;
  }

  public double getDoubleMember() {
    return doubleMember;
  }

  public double getDoubleMember2() {
    return doubleMember2;
  }

  public float getFloatMember() {
    return floatMember;
  }

  public long getLongMember() {
    return longMember;
  }

  public List<String> getNonPrimitive() {
    return nonPrimitive;
  }

  public String[] getNonPrimitiveArray() {
    return nonPrimitiveArray;
  }

  public int getPrimitive() {
    return primitive;
  }

  public int[] getPrimitiveArray() {
    return primitiveArray;
  }

  public short getShortMember() {
    return shortMember;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (boolenPrimitive ? 1231 : 1237);
    result = prime * result + byteMember;
    result = prime * result + charMember;
    long temp;
    temp = Double.doubleToLongBits(doubleMember);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(doubleMember2);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + Float.floatToIntBits(floatMember);
    result = prime * result + (int) (longMember ^ (longMember >>> 32));
    result = prime * result + ((nonPrimitive == null) ? 0 : nonPrimitive.hashCode());
    result = prime * result + Arrays.hashCode(nonPrimitiveArray);
    result = prime * result + primitive;
    result = prime * result + Arrays.hashCode(primitiveArray);
    result = prime * result + shortMember;
    return result;
  }

  public boolean isBoolenPrimitive() {
    return boolenPrimitive;
  }

  public void setBoolenPrimitive(boolean boolenPrimitive) {
    this.boolenPrimitive = boolenPrimitive;
  }

  public void setByteMember(byte byteMember) {
    this.byteMember = byteMember;
  }

  public void setCharMember(char charMember) {
    this.charMember = charMember;
  }

  public void setDoubleMember(double doubleMember) {
    this.doubleMember = doubleMember;
  }

  public void setDoubleMember2(double doubleMember2) {
    this.doubleMember2 = doubleMember2;
  }

  public void setFloatMember(float floatMember) {
    this.floatMember = floatMember;
  }

  public void setLongMember(long longMember) {
    this.longMember = longMember;
  }

  public void setNonPrimitive(List<String> nonPrimitive) {
    this.nonPrimitive = nonPrimitive;
  }

  public void setNonPrimitiveArray(String[] nonPrimitiveArray) {
    this.nonPrimitiveArray = nonPrimitiveArray;
  }

  public void setPrimitive(int primitive) {
    this.primitive = primitive;
  }

  public void setPrimitiveArray(int[] primitiveArray) {
    this.primitiveArray = primitiveArray;
  }

  public void setShortMember(short shortMember) {
    this.shortMember = shortMember;
  }
}
