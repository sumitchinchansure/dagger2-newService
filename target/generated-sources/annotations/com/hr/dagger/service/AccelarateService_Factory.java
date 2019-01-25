package com.hr.dagger.service;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccelarateService_Factory implements Factory<AccelarateService> {
  private static final AccelarateService_Factory INSTANCE = new AccelarateService_Factory();

  @Override
  public AccelarateService get() {
    return new AccelarateService();
  }

  public static Factory<AccelarateService> create() {
    return INSTANCE;
  }
}
