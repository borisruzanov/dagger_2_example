package com.borisruzanov.daggerinjectionexample;

import com.borisruzanov.daggerinjectionexample.annotations.PerActivity;

import dagger.Component;

@PerActivity
@Component (dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
