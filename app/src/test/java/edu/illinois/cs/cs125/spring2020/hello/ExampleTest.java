package edu.illinois.cs.cs125.spring2020.hello;

import android.app.Activity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import edu.illinois.cs.cs125.gradlegrader.annotations.Graded;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 28)
public class ExampleTest {

    @Test
    @Graded(points = 90)
    public void testTitle() {
        Activity activity = Robolectric.buildActivity(MainActivity.class).create().start().resume().get();
        Assert.assertEquals("Hello Android", activity.getTitle());
    }

}
