package net.vergien.beanautoutils.processor;

public class StringUtil {

  private StringUtil() {
    throw new IllegalAccessError("Utility class");
  }

  public static String firstLetterLower(String input) {
    return Character.toLowerCase(input.charAt(0)) + (input.length() > 1 ? input.substring(1) : "");
  }

  public static String firstLetterUpper(String input) {
    return Character.toUpperCase(input.charAt(0)) + (input.length() > 1 ? input.substring(1) : "");
  }
}
