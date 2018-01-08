package com.borisruzanov.daggerinjectionexample;

import android.app.Activity;
import android.content.Context;

import com.borisruzanov.daggerinjectionexample.annotations.ActivityContext;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity){
        mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext(){
        return  mActivity;
    }

    @Provides
    Activity provideActivity(){
        return mActivity;
    }
}
