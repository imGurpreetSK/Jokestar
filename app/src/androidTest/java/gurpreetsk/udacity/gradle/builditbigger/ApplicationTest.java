package gurpreetsk.udacity.gradle.builditbigger;

import android.test.ActivityInstrumentationTestCase2;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public ApplicationTest() {
        super(MainActivity.class);
    }

    public void testVerifyAsyncTask(){
        MainActivity mainActivity = new MainActivity();
        assertNotNull(mainActivity.getJoke());
    }

}