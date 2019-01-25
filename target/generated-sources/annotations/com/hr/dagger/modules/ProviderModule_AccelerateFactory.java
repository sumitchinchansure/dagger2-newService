package com.hr.dagger.modules;

import com.hr.dagger.interfaces.Accelarate;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProviderModule_AccelerateFactory implements Factory<Accelarate> {
  private final ProviderModule module;

  public ProviderModule_AccelerateFactory(ProviderModule module) {
    this.module = module;
  }

  @Override
  public Accelarate get() {
    return Preconditions.checkNotNull(
        module.accelerate(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Accelarate> create(ProviderModule module) {
    return new ProviderModule_AccelerateFactory(module);
  }
}
