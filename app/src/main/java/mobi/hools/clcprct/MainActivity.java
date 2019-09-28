package mobi.hools.clcprct;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnButtonClick (View v){

        EditText el1 = (EditText)findViewById(R.id.Num1);
        EditText el2 = (EditText)findViewById(R.id.Num2);
        TextView resText = (TextView)findViewById(R.id.Rs);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int resSum = num1 - num1 / 100 * num2;
        resText.setText(Integer.toString(resSum));

    }
}
