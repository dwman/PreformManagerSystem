package com.dwman.preformmanagesystem.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.dwman.preformmanagesystem.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class ContentActivity extends AppCompatActivity {

    @InjectView(R.id.fragment_container)
    FrameLayout fragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        ButterKnife.inject(this);
    }
}
