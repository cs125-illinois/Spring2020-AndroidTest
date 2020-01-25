package edu.illinois.cs.cs125.spring2020.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * The main (and only) activity in this example app. Displays a greeting.
 */
public final class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // The below (unused) variable's name does not conform to checkstyle's convention.
        // If you have installed the checkstyle plugin, it should be underlined in red.
        // Remove or rename it to make the Grade task give checkstyle credit.
        int SomeUnusedVariable;
    }

}
