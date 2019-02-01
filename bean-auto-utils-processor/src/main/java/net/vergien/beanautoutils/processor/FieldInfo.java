package net.vergien.beanautoutils.processor;

import javax.lang.model.type.TypeKind;

public class FieldInfo {
  private final String name;
  private final String getterName;
  private final TypeKind kind;

  public boolean isArray() {
    return kind == TypeKind.ARRAY;
  }

  public FieldInfo(String name, TypeKind kind, String getterName) {
    super();
    this.name = name;
    this.kind = kind;
    this.getterName = getterName;
  }

  public String getName() {
    return name;
  }

  public boolean isPrimitive() {
    return kind.isPrimitive();
  }

  public String getGetterName() {
    return getterName;
  }

  public TypeKind getKind() {
    return kind;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((getterName == null) ? 0 : getterName.hashCode());
    result = prime * result + ((kind == null) ? 0 : kind.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
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
    FieldInfo other = (FieldInfo) obj;
    if (getterName == null) {
      if (other.getterName != null) {
        return false;
      }
    } else if (!getterName.equals(other.getterName)) {
      return false;
    }
    if (kind != other.kind) {
      return false;
    }
    if (name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!name.equals(other.name)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("FieldInfo [name=");
    builder.append(name);
    builder.append(", getterName=");
    builder.append(getterName);
    builder.append(", kind=");
    builder.append(kind);
    builder.append("]");
    return builder.toString();
  }



}
