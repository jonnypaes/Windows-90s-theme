package com.jonnypaes.Windows90s.activities;

import androidx.annotation.NonNull;

import candybar.lib.activities.CandyBarSplashActivity;
import candybar.lib.activities.configurations.SplashScreenConfiguration;
import com.jonnypaes.Windows90s.R;

public class SplashActivity extends CandyBarSplashActivity {

    @NonNull
    @Override
    public SplashScreenConfiguration onInit() {
        return new SplashScreenConfiguration(MainActivity.class)
                .setBottomText(getString(R.string.splash_screen_title));
    }
}
