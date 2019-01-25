package com.hr.dagger.component;

import com.hr.dagger.interfaces.Accelarate;
import com.hr.dagger.modules.ProviderModule;
import com.hr.dagger.modules.ProviderModule_AccelerateFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAccelerateComponent implements AccelerateComponent {
  private Provider<Accelarate> accelerateProvider;

  private DaggerAccelerateComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AccelerateComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.accelerateProvider =
        DoubleCheck.provider(ProviderModule_AccelerateFactory.create(builder.providerModule));
  }

  @Override
  public Accelarate accelerate() {
    return accelerateProvider.get();
  }

  public static final class Builder {
    private ProviderModule providerModule;

    private Builder() {}

    public AccelerateComponent build() {
      if (providerModule == null) {
        this.providerModule = new ProviderModule();
      }
      return new DaggerAccelerateComponent(this);
    }

    public Builder providerModule(ProviderModule providerModule) {
      this.providerModule = Preconditions.checkNotNull(providerModule);
      return this;
    }
  }
}
