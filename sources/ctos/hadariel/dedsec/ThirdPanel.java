package ctos.hadariel.dedsec;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ThirdPanel extends Activity {
    public static TransitionType transitionType;

    public enum TransitionType {
        SlideRight,
        SlideLeft
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0000R.layout.third_panel);
    }

    public void right(View view) {
        finish();
        startActivity(new Intent(this, FourthPanel.class));
        overridePendingTransition(C0000R.anim.slide_left_in, C0000R.anim.slide_left_out);
    }

    public void left(View view) {
        finish();
        startActivity(new Intent(this, SecondPanel.class));
        overridePendingTransition(C0000R.anim.slide_right_in, C0000R.anim.slide_right_out);
    }

    public void whatsapp(View view) {
        PackageInfo pi = null;
        try {
            pi = getPackageManager().getPackageInfo("com.watsapp.snifferDonate", 0);
        } catch (NameNotFoundException e) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://getfile.dokpub.com/yandex/get/https://yadi.sk/d/AZU0edm938EfXf ")));
        }
        if (pi != null) {
            startActivity(getPackageManager().getLaunchIntentForPackage("com.watsapp.snifferDonate"));
        }
    }

    public void droidsniff(View view) {
        PackageInfo pi = null;
        try {
            pi = getPackageManager().getPackageInfo("com.evozi.droidsniff", 0);
        } catch (NameNotFoundException e) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://getfile.dokpub.com/yandex/get/https://yadi.sk/d/MECMUoj338EgL7")));
        }
        if (pi != null) {
            startActivity(getPackageManager().getLaunchIntentForPackage("com.evozi.droidsniff"));
        }
    }

    public void intercepter(View view) {
        PackageInfo pi = null;
        try {
            pi = getPackageManager().getPackageInfo("su.sniff.cepter", 0);
        } catch (NameNotFoundException e) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://getfile.dokpub.com/yandex/get/https://yadi.sk/d/cXCai17438EgW5")));
        }
        if (pi != null) {
            startActivity(getPackageManager().getLaunchIntentForPackage("su.sniff.cepter"));
        }
    }
}
