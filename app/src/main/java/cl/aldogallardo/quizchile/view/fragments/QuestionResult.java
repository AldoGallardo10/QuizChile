package cl.aldogallardo.quizchile.view.fragments;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import cl.aldogallardo.quizchile.R;
import cl.aldogallardo.quizchile.data.Result;


public class QuestionResult extends Fragment {

    public QuestionResult() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView valuePorcentage, valueText;
        ImageView valueImage;

        valuePorcentage = (TextView) view.findViewById(R.id.resultTv);
        valueText = (TextView) view.findViewById(R.id.textResponseTv);
        valueImage = (ImageView) view.findViewById(R.id.resultIv);

        Result result = (Result)getActivity().getIntent().getSerializableExtra("result");


        valuePorcentage.setText(result.porcentage().toString());
        valueText.setText(result.responsePorcentage().toString());
        valueImage.setImageResource(result.responseImage());

    }





}
