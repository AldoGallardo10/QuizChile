package cl.aldogallardo.quizchile.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import cl.aldogallardo.quizchile.R;
import cl.aldogallardo.quizchile.data.Result;



public class Question2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        setTitle(R.string.twoQuestion);

        final Button answerbtn2 = (Button) findViewById(R.id.answerBtn2);
        final RadioGroup answerRb2= (RadioGroup) findViewById(R.id.answerRb2);
        final Result result = (Result) getIntent().getSerializableExtra("result");

        answerbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkedRadioButtonId = answerRb2.getCheckedRadioButtonId();
                RadioButton radiobutton = (RadioButton) answerRb2.findViewById(checkedRadioButtonId);

                if (checkedRadioButtonId == -1) {
                    Toast.makeText(Question2Activity.this, "Seleccione una opcion", Toast.LENGTH_SHORT).show();
                } else {

                    if (radiobutton.getText().equals("Huemul y cóndor")) {

                        result.correctAnswer();

                    }

                    Intent intent = new Intent(Question2Activity.this, Question3Activity.class);
                    intent.putExtra("result", result);
                    Log.d("RESULT", String.valueOf(result.getPuntaje()));
                    startActivity(intent);

                }
            }
        });
    }
}
