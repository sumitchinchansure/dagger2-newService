package com.hr.dagger.component;

import com.hr.dagger.modules.ProviderModule;
import com.hr.dagger.service.AccelarateService;
import com.hr.dagger.service.CarService;
import com.hr.dagger.service.CarService_Factory;
import com.hr.dagger.service.CarService_MembersInjector;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerCarComponent implements CarComponent {
  private DaggerCarComponent(Builder builder) {}

  public static Builder builder() {
    return new Builder();
  }

  public static CarComponent create() {
    return new Builder().build();
  }

  @Override
  public CarService car() {
    return injectCarService(CarService_Factory.newCarService());
  }

  private CarService injectCarService(CarService instance) {
    CarService_MembersInjector.injectAccelerate(instance, new AccelarateService());
    return instance;
  }

  public static final class Builder {
    private Builder() {}

    public CarComponent build() {
      return new DaggerCarComponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder providerModule(ProviderModule providerModule) {
      Preconditions.checkNotNull(providerModule);
      return this;
    }
  }
}
