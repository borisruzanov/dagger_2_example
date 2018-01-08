package com.borisruzanov.daggerinjectionexample;

import android.app.Application;
import android.content.Context;

import com.borisruzanov.daggerinjectionexample.database.DataManager;
import com.borisruzanov.daggerinjectionexample.database.DbHelper;
import com.borisruzanov.daggerinjectionexample.DemoApplication;
import com.borisruzanov.daggerinjectionexample.database.SharedPrefsHelper;
import com.borisruzanov.daggerinjectionexample.annotations.ApplicationContext;
import com.borisruzanov.daggerinjectionexample.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();
    Application getApplication();
    DataManager getDataManager();
    SharedPrefsHelper getPreferenceHelper();
    DbHelper getDbHelper();
}
