package cl.awakelab.ejercicio5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListeners();
    }

    private void initListeners() {

        Button showToast = findViewById(R.id.buttonShowToast);
        Button count = findViewById(R.id.buttonCounter);
        TextView viewCount = findViewById(R.id.textViewCount);

        showToast.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "The count sums: " + viewCount.getText(), Toast.LENGTH_SHORT).show();
            }

        });

        count.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Integer numero = Integer.parseInt(viewCount.getText().toString());
                numero ++;
                viewCount.setText(numero.toString());
            }

        });

    }

}