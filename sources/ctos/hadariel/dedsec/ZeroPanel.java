package ctos.hadariel.dedsec;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ZeroPanel extends Activity {
    public static TransitionType transitionType;

    public enum TransitionType {
        SlideRight,
        SlideLeft,
        Zoom
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0000R.layout.zero_panel);
    }

    public void right(View view) {
        finish();
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(C0000R.anim.slide_left_in, C0000R.anim.slide_left_out);
    }

    public void Domofon(View view) {
        PackageInfo pi = null;
        try {
            pi = getPackageManager().getPackageInfo("com.wKodyiotdomofonov", 0);
        } catch (NameNotFoundException e) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.wKodyiotdomofonov")));
            } catch (ActivityNotFoundException e2) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.wKodyiotdomofonov")));
            }
        }
        if (pi != null) {
            startActivity(getPackageManager().getLaunchIntentForPackage("com.wKodyiotdomofonov"));
        }
    }

    public void Terminal(View view) {
        PackageManager pm = getPackageManager();
        PackageInfo pi = null;
        try {
            PackageInfo pi2 = pm.getPackageInfo("com.android.terminal", 0);
            pi = pm.getPackageInfo("jackpal.androidterm", 0);
        } catch (NameNotFoundException e) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=jackpal.androidterm")));
            } catch (ActivityNotFoundException e2) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=jackpal.androidterm")));
            }
        }
        if (pi != null) {
            Intent Terminal = getPackageManager().getLaunchIntentForPackage("jackpal.androidterm");
            Intent Terminal2 = getPackageManager().getLaunchIntentForPackage("com.android.terminal");
            try {
                PackageInfo pi3 = pm.getPackageInfo("jackpal.androidterm", 0);
                startActivity(Terminal);
            } catch (NameNotFoundException e3) {
                startActivity(Terminal2);
            }
        }
    }

    public void BusyBox(View view) {
        PackageManager pm = getPackageManager();
        PackageInfo pi = null;
        try {
            PackageInfo pi2 = pm.getPackageInfo("stericson.busybox.donate", 0);
            pi = pm.getPackageInfo("stericson.busybox", 0);
        } catch (NameNotFoundException e) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=stericson.busybox")));
            } catch (ActivityNotFoundException e2) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=stericson.busybox")));
            }
        }
        if (pi != null) {
            Intent BusyBox = getPackageManager().getLaunchIntentForPackage("stericson.busybox");
            Intent BusyBoxPro = getPackageManager().getLaunchIntentForPackage("stericson.busybox.donate");
            try {
                PackageInfo pi3 = pm.getPackageInfo("stericson.busybox", 0);
                startActivity(BusyBox);
            } catch (NameNotFoundException e3) {
                startActivity(BusyBoxPro);
            }
        }
    }

    public void DroidSQL(View view) {
        PackageInfo pi = null;
        try {
            pi = getPackageManager().getPackageInfo("net.edgard.droidsqli", 0);
        } catch (NameNotFoundException e) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://edgard.net/droidsqli-1.1.apk")));
        }
        if (pi != null) {
            startActivity(getPackageManager().getLaunchIntentForPackage("net.edgard.droidsqli"));
        }
    }

    public void iVMS(View view) {
        PackageInfo pi = null;
        try {
            pi = getPackageManager().getPackageInfo("com.mcu.iVMS", 0);
        } catch (NameNotFoundException e) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.mcu.iVMS")));
            } catch (ActivityNotFoundException e2) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.mcu.iVMS")));
            }
        }
        if (pi != null) {
            startActivity(getPackageManager().getLaunchIntentForPackage("com.mcu.iVMS"));
        }
    }

    public void SSH(View view) {
        PackageInfo pi = null;
        try {
            pi = getPackageManager().getPackageInfo("com.sonelli.juicessh", 0);
        } catch (NameNotFoundException e) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.sonelli.juicessh")));
            } catch (ActivityNotFoundException e2) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.sonelli.juicessh")));
            }
        }
        if (pi != null) {
            startActivity(getPackageManager().getLaunchIntentForPackage("com.sonelli.juicessh"));
        }
    }

    /* renamed from: QR */
    public void mo40QR(View view) {
        PackageInfo pi = null;
        try {
            pi = getPackageManager().getPackageInfo("tw.mobileapp.qrcode.banner", 0);
        } catch (NameNotFoundException e) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=tw.mobileapp.qrcode.banner")));
            } catch (ActivityNotFoundException e2) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=tw.mobileapp.qrcode.banner")));
            }
        }
        if (pi != null) {
            startActivity(getPackageManager().getLaunchIntentForPackage("tw.mobileapp.qrcode.banner"));
        }
    }

    public void TinyCam(View view) {
        PackageManager pm = getPackageManager();
        PackageInfo pi = null;
        try {
            PackageInfo pi2 = pm.getPackageInfo("com.alexvas.dvr.pro", 0);
            pi = pm.getPackageInfo("com.alexvas.dvr", 0);
        } catch (NameNotFoundException e) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.alexvas.dvr")));
            } catch (ActivityNotFoundException e2) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.alexvas.dvr")));
            }
        }
        if (pi != null) {
            Intent TinyCam = getPackageManager().getLaunchIntentForPackage("com.alexvas.dvr");
            Intent TinyCamPro = getPackageManager().getLaunchIntentForPackage("com.alexvas.dvr.pro");
            try {
                PackageInfo pi3 = pm.getPackageInfo("com.alexvas.dvr", 0);
                startActivity(TinyCam);
            } catch (NameNotFoundException e3) {
                startActivity(TinyCamPro);
            }
        }
    }

    public void WifiAnalyzer(View view) {
        PackageInfo pi = null;
        try {
            pi = getPackageManager().getPackageInfo("com.farproc.wifi.analyzer", 0);
        } catch (NameNotFoundException e) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.farproc.wifi.analyzer")));
            } catch (ActivityNotFoundException e2) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.farproc.wifi.analyzer")));
            }
        }
        if (pi != null) {
            startActivity(getPackageManager().getLaunchIntentForPackage("com.farproc.wifi.analyzer"));
        }
    }

    public void DarkTime(View view) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://dark-time.com/")));
    }

    public void About(View view) {
        finish();
        startActivity(new Intent(this, About.class));
        overridePendingTransition(C0000R.anim.zoom_in, C0000R.anim.zoom_out);
    }
}
