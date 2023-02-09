package com.example.a20230207SujitThedla;

import android.app.Application;

import com.example.a20230207SujitThedla.di.AppComponent;
import com.example.a20230207SujitThedla.di.AppModule;
import com.example.a20230207SujitThedla.di.DaggerAppComponent;

public class NYCApplication extends Application {

    private static NYCApplication application;

    private AppComponent appComponent;  // Instance for Dagger 2 Component

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;

        // Instantiate instance for Dagger 2 Component
        appComponent = DaggerAppComponent.builder().appModule(new AppModule()).build();
        appComponent.inject(this);
    }

    public static NYCApplication getApplication() {
        return application;
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
