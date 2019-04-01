package net.vergien.beanautoutils.demo;

import net.vergien.beanautoutils.annotation.Bean;

@Bean
public class ImmutableBean {
  private final int id;
  private final String name;

  public ImmutableBean(int id, String name) {
    super();
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return ImmutableBeanBeanUtil.doToString(this);
  }

  @Override
  public final int hashCode() {
    return ImmutableBeanBeanUtil.doToHashCode(this);
  }

  @Override
  public final boolean equals(Object obj) {
    return ImmutableBeanBeanUtil.doEquals(this, obj);
  }
}
