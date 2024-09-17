package ru.mirea.lybimovaa.yandexmaps;

import android.app.Application;

import com.yandex.mapkit.MapKitFactory;

public class App extends Application {
    private final String API_KEY = "97ea5bb2-02d9-4c34-a7a7-258e0b634248";

    @Override
    public void onCreate() {
        super.onCreate();
        MapKitFactory.setApiKey(API_KEY);
    }
}