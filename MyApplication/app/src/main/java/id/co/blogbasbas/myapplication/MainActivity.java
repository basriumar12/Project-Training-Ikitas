package id.co.blogbasbas.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //variabel
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private int mCount = 0;
    private TextView textView;
    private Button btnToast , btnCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.txt);
        Log.d("MainActivity", "Hello World");



    }
    //button count
    public void count(View view) {
        //jumlah text akan bertambah ketika di klik
        mCount++;
        if (textView != null)
            textView.setText(Integer.toString(mCount));
    }


        //toast
    public void toast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG);
        toast.show();
    }
}
