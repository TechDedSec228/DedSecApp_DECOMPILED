package ctos.hadariel.dedsec;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class About extends Activity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0000R.layout.about);
    }

    public void back(View view) {
        finish();
        startActivity(new Intent(this, ZeroPanel.class));
        overridePendingTransition(C0000R.anim.zoom_in, C0000R.anim.zoom_out);
    }
}
