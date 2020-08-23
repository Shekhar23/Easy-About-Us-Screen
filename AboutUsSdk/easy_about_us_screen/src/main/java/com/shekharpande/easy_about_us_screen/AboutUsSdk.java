package com.shekharpande.easy_about_us_screen;

import android.content.Context;
import android.content.Intent;

/**
 * Created by shekhar narayan pande
 **/
public class AboutUsSdk {
    Context context;
    public AboutUsSdk() {
        displayView();
    }

    private void displayView() {
        Intent intent = new Intent(context,AboutActivityActivity.class);
        context.startActivity(intent);
    }
}
