package ctos.hadariel.dedsec;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class FourthPanel extends Activity {
    public static TransitionType transitionType;

    public enum TransitionType {
        SlideRight,
        SlideLeft
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0000R.layout.fourth_panel);
    }

    public void right(View view) {
        finish();
        startActivity(new Intent(this, FifthPanel.class));
        overridePendingTransition(C0000R.anim.slide_left_in, C0000R.anim.slide_left_out);
    }

    public void left(View view) {
        finish();
        startActivity(new Intent(this, ThirdPanel.class));
        overridePendingTransition(C0000R.anim.slide_right_in, C0000R.anim.slide_right_out);
    }

    public void netcut(View view) {
        PackageInfo pi = null;
        try {
            pi = getPackageManager().getPackageInfo("com.arcai.netcut", 0);
        } catch (NameNotFoundException e) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.arcai.netcut")));
            } catch (ActivityNotFoundException e2) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.arcai.netcut")));
            }
        }
        if (pi != null) {
            startActivity(getPackageManager().getLaunchIntentForPackage("com.arcai.netcut"));
        }
    }

    public void zANTI(View view) {
        PackageInfo pi = null;
        try {
            pi = getPackageManager().getPackageInfo("com.zimperium.zanti", 0);
        } catch (NameNotFoundException e) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://getfile.dokpub.com/yandex/get/https://yadi.sk/d/sacYLyd838EgA3")));
        }
        if (pi != null) {
            startActivity(getPackageManager().getLaunchIntentForPackage("com.zimperium.zanti"));
        }
    }

    public void cSploit(View view) {
        PackageInfo pi = null;
        try {
            pi = getPackageManager().getPackageInfo("org.csploit.android", 0);
        } catch (NameNotFoundException e) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://getfile.dokpub.com/yandex/get/https://yadi.sk/d/A-dzIj2538EgDC")));
        }
        if (pi != null) {
            startActivity(getPackageManager().getLaunchIntentForPackage("org.csploit.android"));
        }
    }
}
