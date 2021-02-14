package com.example.dagger.dagger;


import com.example.dagger.car.DieselEngine;
import com.example.dagger.car.Engine;
import com.example.dagger.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;
    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }
    @Provides
    int provideHorsePower() {
        return horsePower;
    }
    @Provides
    Engine provideEngine(DieselEngine engine) {
        return engine;
    }
}