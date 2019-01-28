package com.hr.dagger.component;

import com.hr.dagger.interfaces.Break;
import com.hr.dagger.modules.InsanceProviderModule;
import com.hr.dagger.modules.InsanceProviderModule_BreakkFactory;
import com.hr.dagger.service.AccelarateService;
import com.hr.dagger.service.CarService;
import com.hr.dagger.service.CarService_Factory;
import com.hr.dagger.service.CarService_MembersInjector;
import com.hr.dagger.service.DriverService;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerCarComponent implements CarComponent {
  private Provider<Break> breakkProvider;

  private DaggerCarComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static CarComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.breakkProvider =
        DoubleCheck.provider(
            InsanceProviderModule_BreakkFactory.create(builder.insanceProviderModule));
  }

  @Override
  public CarService car() {
    return injectCarService(CarService_Factory.newCarService());
  }

  private CarService injectCarService(CarService instance) {
    CarService_MembersInjector.injectDriver(instance, new DriverService());
    CarService_MembersInjector.injectAccelerate(instance, new AccelarateService());
    CarService_MembersInjector.injectBreakk(instance, breakkProvider.get());
    return instance;
  }

  public static final class Builder {
    private InsanceProviderModule insanceProviderModule;

    private Builder() {}

    public CarComponent build() {
      if (insanceProviderModule == null) {
        this.insanceProviderModule = new InsanceProviderModule();
      }
      return new DaggerCarComponent(this);
    }

    public Builder insanceProviderModule(InsanceProviderModule insanceProviderModule) {
      this.insanceProviderModule = Preconditions.checkNotNull(insanceProviderModule);
      return this;
    }
  }
}
