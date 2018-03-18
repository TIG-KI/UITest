package com.example.administrator.uitest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

import com.example.administrator.uitest.flowlayout_view.FlowLayout;

public class Main2Activity extends AppCompatActivity {

    private String mNames[] = {
            "welcome","android","TextView",
            "apple","jamy","kobe bryant",
            "jordan","layout"
    };
    private FlowLayout mFlowLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchlayout);
    mFlowLayout=(FlowLayout)findViewById(R.id.flowlayout);
        initDatas();
    }

    private void initDatas() {

        for (int i = 0; i < mNames.length; i++) {
           // ViewGroup.MarginLayoutParams lp = new MarginLayoutParams( LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
            ViewGroup.MarginLayoutParams lp = new MarginLayoutParams( LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

            lp.leftMargin=5;
            lp.rightMargin=5;
            lp.topMargin=5;
            lp.bottomMargin=5;

            Button btn = new Button(this);
            btn.setText(mNames[i]);
            btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.label_shape));
            mFlowLayout.addView(btn, lp);
        }


    }
}
