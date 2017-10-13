package net.vergien.beanautoutils.processor;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.lang.model.type.TypeKind;

@Generated(value = "net.vergien.beanautoutils.processor.BeanAutoUtilsProcessor")
public class BeanUtilClass {
  public static final String LINE_BREAK = System.getProperty("line.separator");

  private final String className;
  private Map<String, String> fields = new LinkedHashMap<>();
  private final String packageName;
  private final String simpleClassName;
  private final String beanUtilClassName;
  private final String beanUtilSimpleClassName;
  private final String variableName;
  private final List<FieldInfo> fieldInfos;
  private StringBuilder builder;

  private int indentation;


  public BeanUtilClass(String className, List<FieldInfo> fieldInfos) {
    this.className = className;
    this.fieldInfos = Collections.unmodifiableList(fieldInfos);
    int lastDot = className.lastIndexOf('.');
    if (lastDot > 0) {
      this.packageName = className.substring(0, lastDot);
    } else {
      this.packageName = null;
    }


    this.simpleClassName = className.substring(lastDot + 1);
    this.beanUtilClassName = className + "BeanUtil";
    this.beanUtilSimpleClassName = beanUtilClassName.substring(lastDot + 1);
    this.variableName = createVariableName();
  }


  private void appendClassEnd() {
    builder.append("}");
    lineBreak();
    lineBreak();

  }


  private void appendClassHeader() {
    builder.append(
        "@Generated(value = \"net.vergien.beanautoutils.processor.BeanAutoUtilsProcessor\")");
    lineBreak();
    builder.append("public class ");
    builder.append(beanUtilSimpleClassName);
    builder.append(" {");
    lineBreak();
    builder.append("  private ");
    builder.append(beanUtilSimpleClassName);
    builder.append("() {");
    lineBreak();
    builder.append(
        "    throw new java.lang.IllegalAccessError(\"Utility class\");");
    lineBreak();
    builder.append("  }");
    lineBreak();
    lineBreak();
  }

  private void appendDoEquals() {
    builder.append("  public static boolean doEquals(");
    builder.append(simpleClassName);
    builder.append(" lhs, Object obj) {");
    lineBreak();
    builder.append("    if (lhs == obj) {");
    lineBreak();
    builder.append("      return true;");
    lineBreak();
    builder.append("    }");
    builder.append("    if (obj == null) {");
    lineBreak();
    builder.append("      return false;");
    lineBreak();
    builder.append("    }");
    lineBreak();
    builder.append("    if (lhs.getClass() != obj.getClass()) {");
    lineBreak();
    builder.append("      return false;");
    lineBreak();
    builder.append("    }");
    lineBreak();
    builder.append("    ");
    builder.append(simpleClassName);
    builder.append(" other = (");
    builder.append(simpleClassName);
    builder.append(") obj;");
    lineBreak();
    for (FieldInfo fieldInfo : fieldInfos) {
      String getterCall = "lhs." + fieldInfo.getGetterName();
      String otherGetterCall = "other." + fieldInfo.getGetterName();
      switch (fieldInfo.getKind()) {
        case ARRAY:
          builder.append("    if(!java.util.Arrays.equals(");
          builder.append(getterCall);
          builder.append(", ");
          builder.append(otherGetterCall);
          builder.append(")) {");
          lineBreak();
          builder.append("      return false;");
          lineBreak();
          builder.append("    }");
          break;
        case DOUBLE:
          builder.append("    if(Double.doubleToLongBits(");
          builder.append(getterCall);
          builder.append(") != (Double.doubleToLongBits(");
          builder.append(otherGetterCall);
          builder.append("))) {");
          lineBreak();
          builder.append("      return false;");
          lineBreak();
          builder.append("    }");
          break;
        case FLOAT:
          builder.append("    if(Float.floatToIntBits(");
          builder.append(getterCall);
          builder.append(") != (Float.floatToIntBits(");
          builder.append(otherGetterCall);
          builder.append("))) {");
          lineBreak();
          builder.append("      return false;");
          lineBreak();
          builder.append("    }");
          break;
        case DECLARED:
          builder.append("    if (");
          builder.append(getterCall);
          builder.append(" == null) {");
          lineBreak();
          builder.append("      if (");
          builder.append(otherGetterCall);
          builder.append(" != null) {");
          lineBreak();
          builder.append("        return false;");
          lineBreak();
          builder.append("      }");
          lineBreak();
          builder.append("    } else if (!");
          builder.append(getterCall);
          builder.append(".equals(");
          builder.append(otherGetterCall);
          builder.append(")) {");
          lineBreak();
          builder.append("      return false;");
          lineBreak();
          builder.append("    }");
          break;
        case INT:
        case BOOLEAN:
        case CHAR:
        case BYTE:
        case LONG:
        case SHORT:
          builder.append("    if(");
          builder.append(getterCall);
          builder.append(" != ");
          builder.append(otherGetterCall);
          builder.append(") {");
          lineBreak();
          builder.append("      return false;");
          builder.append("    }");
          break;
        default:
          throw new IllegalStateException("Can't create equals() code for field " + fieldInfo);

      }
      lineBreak();
    }
    builder.append("    return true;");
    lineBreak();
    builder.append("  }");
  }

  private void appendDoToString() {
    builder.append("  public static String doToString(");
    builder.append(simpleClassName);
    builder.append(" ");
    builder.append(variableName);
    builder.append(") {");
    lineBreak();
    builder.append("    StringBuilder builder = new StringBuilder();");
    lineBreak();
    builder.append("    builder.append(\"");
    builder.append(simpleClassName);
    builder.append("@\");");
    lineBreak();
    builder.append("    builder.append(");
    builder.append("System.identityHashCode(");
    builder.append(variableName);
    builder.append("));");
    lineBreak();
    builder.append("    builder.append(\"[\");");
    lineBreak();
    Iterator<FieldInfo> it = fieldInfos.iterator();
    while (it.hasNext()) {
      FieldInfo fieldInfo = it.next();
      builder.append("    builder.append(\"");
      builder.append(fieldInfo.getName());
      builder.append("=\");");
      lineBreak();
      if (fieldInfo.getKind() == TypeKind.ARRAY) {
        builder.append("    builder.append(java.util.Arrays.toString(");
        builder.append(variableName + "." + fieldInfo.getGetterName());
        builder.append("));");
      } else {
        builder.append("    builder.append(");
        builder.append(variableName + "." + fieldInfo.getGetterName());
        builder.append(");");
      }
      lineBreak();
      if (it.hasNext()) {
        lineBreak();
        builder.append("    builder.append(\", \");");
      }
      lineBreak();
    }
    builder.append("    builder.append(\"]\");");
    lineBreak();
    builder.append("    return builder.toString();");
    builder.append("  }");
    lineBreak();
  }

  private void appendDoHashCode() {
    builder.append("  public static int doToHashCode(");
    builder.append(simpleClassName);
    builder.append(" ");
    builder.append(variableName);
    builder.append(") {");
    lineBreak();
    builder.append("    final int prime = 31;");
    lineBreak();
    builder.append("    int result = 1;");
    lineBreak();
    if (containsDouble()) {
      builder.append("    long temp;");
      lineBreak();
    }
    for (FieldInfo fieldInfo : fieldInfos) {
      String getterCall = variableName + "." + fieldInfo.getGetterName();
      if (fieldInfo.isArray()) {
        builder.append("    result = prime * result + java.util.Arrays.hashCode(");
        builder.append(getterCall);
        builder.append(");");
      } else if (!fieldInfo.isPrimitive()) {
        builder.append("    result = prime * result + ((");
        builder.append(getterCall);
        builder.append(" == null) ? 0 : ");
        builder.append(getterCall);
        builder.append(".hashCode());");
      } else {
        switch (fieldInfo.getKind()) {
          case BOOLEAN:
            builder.append("    result = prime * result + (");
            builder.append(getterCall);
            builder.append(" ? 1231 : 1237);");
            break;
          case INT:
          case BYTE:
          case SHORT:
          case CHAR:
            builder.append("    result = prime * result + ");
            builder.append(getterCall);
            builder.append(";");
            break;
          case LONG:
            builder.append("    result = prime * result + (int) (");
            builder.append(getterCall);
            builder.append(" ^ (");
            builder.append(getterCall);
            builder.append(" >>> 32));");
            break;
          case FLOAT:
            builder.append("    result = prime * result + Float.floatToIntBits(");
            builder.append(getterCall);
            builder.append(");");
            break;
          case DOUBLE:
            builder.append("    temp = Double.doubleToLongBits(");
            builder.append(getterCall);
            builder.append(");");
            lineBreak();
            builder.append("    result = prime * result + (int) (temp ^ (temp >>> 32));");
            break;
          default:
            throw new IllegalStateException("Can't create hashCode() line for field " + fieldInfo);
        }
      }
      lineBreak();
    }
    builder.append("    return result;");
    lineBreak();
    builder.append("  }");
    lineBreak();
  }

  private boolean containsDouble() {
    return fieldInfos.stream().filter(f -> f.getKind() == TypeKind.DOUBLE).findFirst().isPresent();
  }


  private void appendImport(Class<?> classToImport) {
    builder.append("import ");
    builder.append(classToImport.getName());
    builder.append(";");
    lineBreak();
    lineBreak();

  }


  private void appendPackage() {
    if (packageName != null && !packageName.isEmpty()) {
      builder.append("package ");
      builder.append(packageName);
      builder.append(";");
      lineBreak();
      lineBreak();
    }
  }


  private String createVariableName() {
    return Character.toLowerCase(simpleClassName.charAt(0))
        + (simpleClassName.length() > 1 ? simpleClassName.substring(1) : "");
  }


  public String getBeanUtilClassName() {
    return beanUtilClassName;
  }

  public synchronized String getCode() {
    indentation = 0;
    builder = new StringBuilder();
    appendPackage();
    appendImport(Generated.class);
    appendClassHeader();
    indentation = indentation + 2;
    appendDoToString();
    lineBreak();
    appendDoHashCode();
    lineBreak();
    appendDoEquals();
    lineBreak();
    appendClassEnd();
    return builder.toString();
  }


  private void lineBreak() {
    builder.append(LINE_BREAK);
  }
}
