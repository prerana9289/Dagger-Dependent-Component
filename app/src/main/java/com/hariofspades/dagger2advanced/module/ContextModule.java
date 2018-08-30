package com.hariofspades.dagger2advanced.module;

import android.content.Context;

import com.hariofspades.dagger2advanced.interfaces.AppContext;
import com.hariofspades.dagger2advanced.interfaces.RandomUserAppScope;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {

    Context context;

    public ContextModule(Context context){
        this.context = context;
    }

    @Named("app_context")
    @RandomUserAppScope
    @Provides
    public Context context(){return context.getApplicationContext(); }
}
