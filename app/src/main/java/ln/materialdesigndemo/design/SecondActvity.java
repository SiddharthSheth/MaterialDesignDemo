package ln.materialdesigndemo.design;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import ln.materialdesigndemo.R;

public class SecondActvity extends AppCompatActivity {

    private TextView txtCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_actvity);

        txtCount = (TextView) findViewById(R.id.txt_count);

        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("count1", 1);

        txtCount.setText(String.valueOf(intValue));

    }
}
