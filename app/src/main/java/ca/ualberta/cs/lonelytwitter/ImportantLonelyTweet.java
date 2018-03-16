package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet {

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		return tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 10;{
		}

		return true;
	}

	@Override
	public String getTweetBody() {
        return tweetBody.toUpperCase();
    }
}
