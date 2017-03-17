package ca.ualberta.cs.lonelytweet;

/**
 * Created by MauriceG on 2017/3/16.
 */

public class NormalLonelyTweet extends LonelyTweet {
    public NormalLonelyTweet(String text) {
        super(text);
    }

    @Override
    public String getTweetBody() {
        return tweetBody;
    }

    @Override
    public boolean isValid() {
        if (tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 20) {
            return false;
        }

        return true;
    }
}
