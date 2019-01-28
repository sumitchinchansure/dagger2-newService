package com.hr.dagger.modules;

import javax.inject.Singleton;

import com.hr.dagger.interfaces.Break;
import com.hr.dagger.service.BreakService;

import dagger.Module;
import dagger.Provides;

@Module
public class InsanceProviderModule {

	@Provides
	@Singleton
	public Break breakk() {
		return new BreakService();
	}

}
