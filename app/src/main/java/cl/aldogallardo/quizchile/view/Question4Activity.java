package cl.aldogallardo.quizchile.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cl.aldogallardo.quizchile.R;
import cl.aldogallardo.quizchile.data.Result;

public class Question4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        setTitle(R.string.fourQuiestion);

        final EditText answerEt = (EditText) findViewById(R.id.answerEt);
        Button resultBtn = (Button) findViewById(R.id.resultBtn);
        final Result result = (Result) getIntent().getSerializableExtra("result");

        resultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerEt.getText().length()<4){
                    Toast.makeText(Question4Activity.this, "Debe responder la pregunta", Toast.LENGTH_SHORT).show();
                }else{

                    if (answerEt.getText().toString().equals("1962")){
                        result.correctAnswer();
                    }


                    Intent intent = new Intent(Question4Activity.this, ResultActivity.class);
                    intent.putExtra("result", result);
                    Log.d("RESULT", String.valueOf(result.getPuntaje()));
                    startActivity(intent);
                }
            }
        });

    }
}
