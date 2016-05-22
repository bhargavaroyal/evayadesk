package india.evayadesk.com.evayadesk.ui.activities;

import android.os.Bundle;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import india.evayadesk.com.evayadesk.R;


/**
 * Created by bhargavagugamsetty on 17/05/16.
 */
public class SignupActivity extends BaseActivity{
    private String mCompName;
    private String mPlan;
    private String mAdminName;
    private String mEmail;
    private String mPhoneNo;
    private String mPass;
    private String mPhrase;
    private EditText mCompanyNameEt;
    private EditText mPlanEt;
    private EditText mAdminNameEt;
    private EditText memailEt;
    private EditText mphoneNoEt;
    private EditText mPassEt;
    private EditText mPhraseEt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        setActionbarTitle(getString(R.string.sign_up), true, R.id.sign_up_tb);


        mCompanyNameEt = (EditText) findViewById(R.id.company_name_et);
        mPlanEt =  (EditText) findViewById(R.id.plan_et);
        mAdminNameEt = (EditText) findViewById(R.id.admin_et);
        memailEt = (EditText) findViewById(R.id.email_et);
        mphoneNoEt = (EditText) findViewById(R.id.phone_et);
        mPassEt = (EditText) findViewById(R.id.password_et);
        mPhraseEt = (EditText) findViewById(R.id.pass_phrase_et);

        mCompName = mCompanyNameEt.getText().toString();
        mPlan = mPlanEt.getText().toString();
        mAdminName = mAdminNameEt.getText().toString();
        mEmail = memailEt.getText().toString();
        mPhoneNo = mphoneNoEt.getText().toString();
        mPass = mPassEt.getText().toString();
        mPhrase = mPhraseEt.getText().toString();
        // validation
        isValidCompany(mCompName);

        isValidPlan(mPlan);

        isValidAdmin(mAdminName);

        isValidEmail(mEmail);

        isValidPhoneNo(mPhoneNo);

    }

    private void isValidPhoneNo(String phoneNo) {


    }

    private boolean isValidEmail(String email) {
        String EMAIL_PATTERN =  "^[A-Za-z0-9._%+\\-]+@[A-Za-z0-9.\\-]+\\.[A-Za-z]{2,4}$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.find()) {
            return false;
        }else {
            return true;
        }

    }

    private void isValidAdmin(String adminName) {

    }

    private void isValidPlan(String plan) {

    }

    private boolean isValidCompany(String compName) {


        if (compName.length() < 100 && compName.length() >= 3) {
            // mCompany.setError("company name should be less than 100 characters");
            return false;

        } else {
            return true;
        }

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
