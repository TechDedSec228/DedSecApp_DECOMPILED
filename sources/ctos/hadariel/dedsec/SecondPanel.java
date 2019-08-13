package ctos.hadariel.dedsec;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class SecondPanel extends Activity {
    public static TransitionType transitionType;

    public enum TransitionType {
        SlideRight,
        SlideLeft
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0000R.layout.second_panel);
    }

    public void right(View view) {
        finish();
        startActivity(new Intent(this, ThirdPanel.class));
        overridePendingTransition(C0000R.anim.slide_left_in, C0000R.anim.slide_left_out);
    }

    public void left(View view) {
        finish();
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(C0000R.anim.slide_right_in, C0000R.anim.slide_right_out);
    }

    public void fing(View view) {
        PackageInfo pi = null;
        try {
            pi = getPackageManager().getPackageInfo("com.overlook.android.fing", 0);
        } catch (NameNotFoundException e) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.overlook.android.fing")));
            } catch (ActivityNotFoundException e2) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.overlook.android.fing")));
            }
        }
        if (pi != null) {
            startActivity(getPackageManager().getLaunchIntentForPackage("com.overlook.android.fing"));
        }
    }

    public void wifigateway(View view) {
        PackageInfo pi = null;
        try {
            pi = getPackageManager().getPackageInfo("com.dedsec.wifi.gateway", 0);
        } catch (NameNotFoundException e) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://getfile.dokpub.com/yandex/get/https://yadi.sk/d/aV1aHJZ938Eg5e")));
        }
        if (pi != null) {
            startActivity(getPackageManager().getLaunchIntentForPackage("com.dedsec.wifi.gateway"));
        }
    }

    public void routerbrute(View view) {
        PackageInfo pi = null;
        try {
            pi = getPackageManager().getPackageInfo("evz.android.rbf_ads", 0);
        } catch (NameNotFoundException e) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://getfile.dokpub.com/yandex/get/https://yadi.sk/d/TNMMRp3c38EgSD")));
        }
        if (pi != null) {
            startActivity(getPackageManager().getLaunchIntentForPackage("evz.android.rbf_ads"));
        }
    }
}
