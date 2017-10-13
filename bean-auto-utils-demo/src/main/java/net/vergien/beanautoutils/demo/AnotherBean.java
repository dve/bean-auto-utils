package net.vergien.beanautoutils.demo;

import net.vergien.beanautoutils.annotation.Bean;

@Bean
public class AnotherBean {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int hashCode() {
    return AnotherBeanBeanUtil.doToHashCode(this);
  }

  @Override
  public boolean equals(Object obj) {
    return AnotherBeanBeanUtil.doEquals(this, obj);
  }

  @Override
  public String toString() {
    return AnotherBeanBeanUtil.doToString(this);
  }
}
