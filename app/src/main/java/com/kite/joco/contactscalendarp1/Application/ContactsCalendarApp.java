package com.kite.joco.contactscalendarp1.Application;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by Joco on 2015.05.17..
 */

public class ContactsCalendarApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        FlowManager.destroy();
    }
}
