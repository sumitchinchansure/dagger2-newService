package com.hr.dagger.component;

import javax.inject.Singleton;

import com.hr.dagger.modules.ProviderModule;
import com.hr.dagger.service.CarService;

import dagger.Component;

@Singleton
@Component(modules = { ProviderModule.class })
public interface CarComponent {

	CarService car();

}
