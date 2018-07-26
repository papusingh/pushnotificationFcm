package provider.androidbuffer.com.fcmdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);

        clickBtn();
    }

    private void clickBtn(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  tkn = FirebaseInstanceId.getInstance().getToken();

                Toast.makeText(MainActivity.this,"Current token ["+tkn+"]",Toast.LENGTH_SHORT).show();

                Log.d("token","Token ["+tkn+"]");
            }
        });
    }
}
