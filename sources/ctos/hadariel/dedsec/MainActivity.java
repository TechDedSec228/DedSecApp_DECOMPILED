package ctos.hadariel.dedsec;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    public static TransitionType transitionType;

    public enum TransitionType {
        SlideRight,
        SlideLeft
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0000R.layout.activity_main);
    }

    public void wps(View view) {
        PackageInfo pi = null;
        try {
            pi = getPackageManager().getPackageInfo("com.tester.wpswpatester", 0);
        } catch (NameNotFoundException e) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.tester.wpswpatester")));
            } catch (ActivityNotFoundException e2) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.tester.wpswpatester")));
            }
        }
        if (pi != null) {
            startActivity(getPackageManager().getLaunchIntentForPackage("com.tester.wpswpatester"));
        }
    }

    public void brute(View view) {
        PackageInfo pi = null;
        try {
            pi = getPackageManager().getPackageInfo("cz.auradesign.wibrplus", 0);
        } catch (NameNotFoundException e) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://getfile.dokpub.com/yandex/get/https://yadi.sk/d/7aj0kchO38Efsh")));
        }
        if (pi != null) {
            startActivity(getPackageManager().getLaunchIntentForPackage("cz.auradesign.wibrplus"));
        }
    }

    public void ChangeMyMac(View view) {
        PackageInfo pi = null;
        try {
            pi = getPackageManager().getPackageInfo("net.xnano.android.changemymac", 0);
        } catch (NameNotFoundException e) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=net.xnano.android.changemymac")));
            } catch (ActivityNotFoundException e2) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=net.xnano.android.changemymac")));
            }
        }
        if (pi != null) {
            startActivity(getPackageManager().getLaunchIntentForPackage("net.xnano.android.changemymac"));
        }
    }

    public void right(View view) {
        finish();
        startActivity(new Intent(this, SecondPanel.class));
        overridePendingTransition(C0000R.anim.slide_left_in, C0000R.anim.slide_left_out);
    }

    public void left(View view) {
        finish();
        startActivity(new Intent(this, ZeroPanel.class));
        overridePendingTransition(C0000R.anim.slide_right_in, C0000R.anim.slide_right_out);
    }

    public void wifi_settings(View view) {
        startActivity(new Intent("android.settings.WIFI_SETTINGS"));
    }
}
