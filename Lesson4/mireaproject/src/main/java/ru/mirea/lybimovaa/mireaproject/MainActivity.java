package ru.mirea.lybimovaa.mireaproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clearCacheButton = findViewById(R.id.clearCacheButton);
        clearCacheButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OneTimeWorkRequest workRequest = new OneTimeWorkRequest.Builder(CacheCleanupWorker.class).build();

                WorkManager.getInstance(MainActivity.this).enqueue(workRequest);
            }
        });
    }
}