package ctos.hadariel.dedsec;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class FifthPanel extends Activity {
    public static TransitionType transitionType;

    public enum TransitionType {
        SlideRight,
        SlideLeft
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0000R.layout.fifth_panel);
    }

    public void tor(View view) {
        PackageInfo pi = null;
        try {
            pi = getPackageManager().getPackageInfo("org.torproject.android", 0);
        } catch (NameNotFoundException e) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=org.torproject.android")));
            } catch (ActivityNotFoundException e2) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=org.torproject.android")));
            }
        }
        if (pi != null) {
            startActivity(getPackageManager().getLaunchIntentForPackage("org.torproject.android"));
        }
    }

    public void websms(View view) {
        PackageInfo pi = null;
        try {
            pi = getPackageManager().getPackageInfo("com.websms.ua", 0);
        } catch (NameNotFoundException e) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.websms.ua")));
            } catch (ActivityNotFoundException e2) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.websms.ua")));
            }
        }
        if (pi != null) {
            startActivity(getPackageManager().getLaunchIntentForPackage("com.websms.ua"));
        }
    }

    public void gsmspy(View view) {
        PackageInfo pi = null;
        try {
            pi = getPackageManager().getPackageInfo("kz.galan.antispy", 0);
        } catch (NameNotFoundException e) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=kz.galan.antispy")));
            } catch (ActivityNotFoundException e2) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=kz.galan.antispy")));
            }
        }
        if (pi != null) {
            startActivity(getPackageManager().getLaunchIntentForPackage("kz.galan.antispy"));
        }
    }

    public void left(View view) {
        finish();
        startActivity(new Intent(this, FourthPanel.class));
        overridePendingTransition(C0000R.anim.slide_right_in, C0000R.anim.slide_right_out);
    }

    public void anonmail(View view) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://anonymousemail.me/")));
    }

    public void exit(View view) {
        moveTaskToBack(true);
        finish();
        System.exit(0);
    }
}
