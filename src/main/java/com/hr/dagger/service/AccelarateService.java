package com.hr.dagger.service;

import javax.inject.Inject;

import com.hr.dagger.interfaces.Accelarate;

public class AccelarateService implements Accelarate{

	@Inject
	public AccelarateService(){

	}

	public void speedUp() {

		System.out.println("SPEEDDDDD..!!!");
	}

}
