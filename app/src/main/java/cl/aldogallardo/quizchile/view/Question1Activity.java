package cl.aldogallardo.quizchile.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import cl.aldogallardo.quizchile.R;
import cl.aldogallardo.quizchile.data.Result;

public class Question1Activity extends AppCompatActivity {

    Result result = new Result();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        setTitle(R.string.oneQuestion);

        final Button answerbtn1 = (Button) findViewById(R.id.answerBtn1);
        final RadioGroup answerRb1 = (RadioGroup) findViewById(R.id.answerRb1);

        answerbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int checkedRadioButtonId = answerRb1.getCheckedRadioButtonId();
                RadioButton radiobutton = (RadioButton) answerRb1.findViewById(checkedRadioButtonId);

                if (checkedRadioButtonId == -1) {
                    Toast.makeText(Question1Activity.this, "Seleccione una opcion", Toast.LENGTH_SHORT).show();
                } else {

                    if (radiobutton.getText().equals("La Cueca.")) {

                        result.correctAnswer();

                    }

                    Intent intent = new Intent(Question1Activity.this, Question2Activity.class);
                    intent.putExtra("result", result);
                    Log.d("RESULT", String.valueOf(result.getPuntaje()));
                    startActivity(intent);
                }
            }
        });
    }
}
