package com.hr.dagger.component;

import javax.inject.Singleton;

import com.hr.dagger.modules.ProviderModule;
import com.hr.dagger.service.DriverService;

import dagger.Component;

@Singleton
@Component(modules = { ProviderModule.class })
public interface DriverComponent {

	DriverService driver();

}
