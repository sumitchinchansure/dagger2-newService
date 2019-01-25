package com.hr.dagger;

import com.hr.dagger.component.AccelerateComponent;
import com.hr.dagger.component.CarComponent;
import com.hr.dagger.component.DaggerAccelerateComponent;
import com.hr.dagger.component.DaggerCarComponent;
import com.hr.dagger.component.DaggerDriverComponent;
import com.hr.dagger.component.DriverComponent;

/**
 * Main App file
 *
 */
public class App
{
    public static void main( String[] args )
    {
      AccelerateComponent  AccComponent = DaggerAccelerateComponent.create();
      CarComponent carComponent = DaggerCarComponent.create();
      DriverComponent driverCompo = DaggerDriverComponent.create();

      AccComponent.accelerate().speedUp();
      carComponent.car().runCar();
      driverCompo.driver().driveCar();
    }
}
