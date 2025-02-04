package com.jonnypaes.Windows90s.activities;

import androidx.annotation.NonNull;

import candybar.lib.activities.CandyBarMainActivity;
import candybar.lib.activities.configurations.ActivityConfiguration;
import com.jonnypaes.Windows90s.licenses.License;

public class MainActivity extends CandyBarMainActivity {

    @NonNull
    @Override
    public ActivityConfiguration onInit() {
        return new ActivityConfiguration()
                .setLicenseCheckerEnabled(License.isLicenseCheckerEnabled())
                .setLicenseKey(License.getLicenseKey())
                .setRandomString(License.getRandomString())
                .setDonationProductsId(License.getDonationProductsId())
                .setPremiumRequestProducts(License.getPremiumRequestProductsId(), License.getPremiumRequestProductsCount());
    }
}
