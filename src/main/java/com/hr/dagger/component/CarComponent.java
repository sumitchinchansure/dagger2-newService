package com.hr.dagger.component;

import javax.inject.Singleton;

import com.hr.dagger.modules.InsanceProviderModule;
import com.hr.dagger.service.CarService;

import dagger.Component;

@Singleton
@Component(modules = { InsanceProviderModule.class })
public interface CarComponent {

	CarService car();

}
