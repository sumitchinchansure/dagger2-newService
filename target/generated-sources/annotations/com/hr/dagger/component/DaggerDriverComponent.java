package com.hr.dagger.component;

import com.hr.dagger.modules.ProviderModule;
import com.hr.dagger.service.AccelarateService;
import com.hr.dagger.service.CarService;
import com.hr.dagger.service.CarService_Factory;
import com.hr.dagger.service.CarService_MembersInjector;
import com.hr.dagger.service.DriverService;
import com.hr.dagger.service.DriverService_Factory;
import com.hr.dagger.service.DriverService_MembersInjector;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerDriverComponent implements DriverComponent {
  private DaggerDriverComponent(Builder builder) {}

  public static Builder builder() {
    return new Builder();
  }

  public static DriverComponent create() {
    return new Builder().build();
  }

  private CarService getCarService() {
    return injectCarService(CarService_Factory.newCarService());
  }

  @Override
  public DriverService driver() {
    return injectDriverService(DriverService_Factory.newDriverService());
  }

  private CarService injectCarService(CarService instance) {
    CarService_MembersInjector.injectAccelerate(instance, new AccelarateService());
    return instance;
  }

  private DriverService injectDriverService(DriverService instance) {
    DriverService_MembersInjector.injectCar(instance, getCarService());
    return instance;
  }

  public static final class Builder {
    private Builder() {}

    public DriverComponent build() {
      return new DaggerDriverComponent(this);
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
