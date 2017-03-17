package ca.ualberta.cs.lonelytweet;

import android.util.Log;

/**
 * Created by MauriceG on 2017/3/16.
 */

public class ImportantLonelyTweet extends LonelyTweet {
    public ImportantLonelyTweet(String text) {
        super(text);
    }

    @Override
    public String getTweetBody() {
        String msg = tweetBody.toUpperCase();
        Log.i("LonelyTweet", msg);
        return msg;
    }

    @Override
    public boolean isValid() {
        if (tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 10) {
            return false;
        }

        return true;
    }
}
