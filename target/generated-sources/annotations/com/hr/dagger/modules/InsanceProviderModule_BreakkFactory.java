package com.hr.dagger.modules;

import com.hr.dagger.interfaces.Break;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class InsanceProviderModule_BreakkFactory implements Factory<Break> {
  private final InsanceProviderModule module;

  public InsanceProviderModule_BreakkFactory(InsanceProviderModule module) {
    this.module = module;
  }

  @Override
  public Break get() {
    return Preconditions.checkNotNull(
        module.breakk(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Break> create(InsanceProviderModule module) {
    return new InsanceProviderModule_BreakkFactory(module);
  }
}
