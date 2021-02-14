package com.example.dagger.dagger;
import com.example.dagger.MainActivity;
import com.example.dagger.car.Car;
import com.example.dagger.car.Driver;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    ActivityComponent.Factory getActivityComponentFactory();
    @Component.Factory
    interface Factory {
        AppComponent create(DriverModule driverModule);
    }
}