package com.hariofspades.dagger2advanced.module;

import android.content.Context;

import com.hariofspades.dagger2advanced.interfaces.ActivityContext;
import com.hariofspades.dagger2advanced.interfaces.RandomUserAppScope;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityContextModule {

    Context context;
    public ActivityContextModule(Context context) {
        this.context = context;
    }

    @ActivityContext
    @Provides
    @RandomUserAppScope
    public Context provideActivityContext()
    {
       return context;
    }
}
