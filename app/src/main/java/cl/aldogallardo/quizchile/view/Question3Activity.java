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

public class Question3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        setTitle(R.string.threeQuestion);

        final Button answerbtn3 = (Button) findViewById(R.id.answerBtn3);
        final RadioGroup answerRb3 = (RadioGroup) findViewById(R.id.answerRb3);
        final Result result = (Result) getIntent().getSerializableExtra("result");

        answerbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkedRadioButtonId = answerRb3.getCheckedRadioButtonId();
                setTitle(R.string.threeQuestion);

                RadioButton radiobutton = (RadioButton) answerRb3.findViewById(checkedRadioButtonId);

                if (checkedRadioButtonId == -1) {
                    Toast.makeText(Question3Activity.this, "Seleccione una opcion", Toast.LENGTH_SHORT).show();
                } else {

                    if (radiobutton.getText().equals("En los Andes")) {

                        result.correctAnswer();

                    }

                    Intent intent = new Intent(Question3Activity.this, Question4Activity.class);
                    intent.putExtra("result", result);
                    Log.d("RESULT", String.valueOf(result.getPuntaje()));
                    startActivity(intent);

                }
            }
        });
    }
}
