package india.evayadesk.com.evayadesk.ui.activities;

import android.os.Bundle;

import india.evayadesk.com.evayadesk.R;


/**
 * Created by bhargavagugamsetty on 17/05/16.
 */
public class ContactActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        setActionbarTitle(getString(R.string.contact_us), true, R.id.contact_tb);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
