package edu.tamu.ece.ecen489_miniproject1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SuccessPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_page);
        Intent intent = getIntent();
        String product = intent.getStringExtra("product");
        TextView text = (TextView) findViewById(R.id.successText);
        text.setText("Congratulations on your purchase of " + product +"!");
    }


}
