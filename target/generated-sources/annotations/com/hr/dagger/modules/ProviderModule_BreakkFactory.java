package com.hr.dagger.modules;

import com.hr.dagger.interfaces.Break;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProviderModule_BreakkFactory implements Factory<Break> {
  private final ProviderModule module;

  public ProviderModule_BreakkFactory(ProviderModule module) {
    this.module = module;
  }

  @Override
  public Break get() {
    return Preconditions.checkNotNull(
        module.breakk(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Break> create(ProviderModule module) {
    return new ProviderModule_BreakkFactory(module);
  }
}
