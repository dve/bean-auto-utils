package net.vergien.beanautoutils.demo;

import net.vergien.beanautoutils.annotation.Bean;

@Bean
public class ImmutableBeanWithExtraBehavior extends ImmutableBean {

  public ImmutableBeanWithExtraBehavior(int id, String name) {
    super(id, name);
  }

  public String beautiful() {
    return this.getId() + " - " + this.getName();
  }
}
