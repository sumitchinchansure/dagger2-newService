package com.hr.dagger.service;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BreakService_Factory implements Factory<BreakService> {
  private static final BreakService_Factory INSTANCE = new BreakService_Factory();

  @Override
  public BreakService get() {
    return new BreakService();
  }

  public static Factory<BreakService> create() {
    return INSTANCE;
  }
}
