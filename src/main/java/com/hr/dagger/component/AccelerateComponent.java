package com.hr.dagger.component;

import javax.inject.Singleton;

import com.hr.dagger.interfaces.Accelarate;
import com.hr.dagger.modules.ProviderModule;

import dagger.Component;

@Singleton
@Component(modules = { ProviderModule.class })
public interface AccelerateComponent {

	Accelarate accelerate();
}
