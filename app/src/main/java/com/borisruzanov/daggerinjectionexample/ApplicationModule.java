package com.borisruzanov.daggerinjectionexample;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.borisruzanov.daggerinjectionexample.annotations.ApplicationContext;
import com.borisruzanov.daggerinjectionexample.annotations.DatabaseInfo;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application app){
        mApplication = app;
    }

    @Provides
    @ApplicationContext
    Context provideContext(){
        return mApplication;
    }

    @Provides
    Application provideApplication(){
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDataBaseName(){
        return "demo-dagger.db";
    }

    @Provides
    @DatabaseInfo
    Integer provideDataBaseVersion(){
        return 2;
    }

    @Provides
    SharedPreferences provideSharedPreferences(){
        return mApplication.getSharedPreferences("demo-prefs", Context.MODE_PRIVATE);
    }
}
