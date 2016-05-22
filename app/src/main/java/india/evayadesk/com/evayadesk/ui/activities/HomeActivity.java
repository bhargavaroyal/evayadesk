package india.evayadesk.com.evayadesk.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import india.evayadesk.com.evayadesk.R;


public class HomeActivity extends BaseActivity implements View.OnClickListener{


    private Button mprice,mContact,mValue,mBlog,mSign,mLogin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setActionbarTitle(getString(R.string.home), true, R.id.home_tb);

        mprice = (Button)findViewById(R.id.price_bt);
        mprice.setOnClickListener(this);

        mContact = (Button)findViewById(R.id.contact_bt);
        mContact.setOnClickListener(this);

        mValue = (Button)findViewById(R.id.value_bt);
        mValue.setOnClickListener(this);

        mBlog = (Button)findViewById(R.id.blog_bt);
        mBlog.setOnClickListener(this);

        mSign = (Button)findViewById(R.id.sign_up_bt);
        mSign.setOnClickListener(this);

        mLogin = (Button)findViewById(R.id.login_bt);
        mLogin.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.price_bt:
                Intent priceIntent = new Intent(this, PriceActivity.class);
                startActivity(priceIntent);
                break;
            case R.id.contact_bt:
                Intent contactIntent = new Intent(this, ContactActivity.class);
                startActivity(contactIntent);
                break;
            case R.id.value_bt:
                Intent valueIntent = new Intent(this, ValueActivity.class);
                startActivity(valueIntent);
                break;
            case R.id.blog_bt:
                Intent blogIntent = new Intent(this, BlogActivity.class);
                startActivity(blogIntent);
                break;
            case R.id.sign_up_bt:
                Intent signIntent = new Intent(this, SignupActivity.class);
                startActivity(signIntent);
                break;
            case R.id.login_bt:
                Intent loginIntent = new Intent(this, LoginActivity.class);
                startActivity(loginIntent);
                break;


        }

    }
}
