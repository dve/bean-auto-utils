package net.vergien.beanautoutils.demo;

import net.vergien.beanautoutils.annotation.Bean;

@Bean
public class ClassExtendingBase extends Base {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
