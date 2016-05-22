package india.evayadesk.com.evayadesk.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import india.evayadesk.com.evayadesk.R;


/**
 * Created by bhargavagugamsetty on 17/05/16.
 */
public class LoginActivity extends BaseActivity implements View.OnClickListener {

    private Button mLogin;
    private TextView mSignUp;
    private CheckBox mterms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setActionbarTitle(getString(R.string.login), true, R.id.login_tb);

        mLogin = (Button) findViewById(R.id.login_bt);
        mLogin.setOnClickListener(this);

        mSignUp = (TextView) findViewById(R.id.sign_up_tv);
        mSignUp.setOnClickListener(this);

//        mterms = (CheckBox) findViewById(R.id.accept_cb);
//        mterms.setOnClickListener(this);


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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login_bt:
                Intent mLoginIntent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(mLoginIntent);
            case R.id.sign_up_tv:
                Intent mSignUpIntent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(mSignUpIntent);

        }



    }
}
