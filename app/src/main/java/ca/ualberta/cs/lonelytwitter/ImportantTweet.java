package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/12/17.
 */

/**
 * @author Tyler Heise
 * @version 1.5
 * @see Tweet
 * @see NormalTweet
 * @since 1.0
 */
public class ImportantTweet extends Tweet implements Tweetable {

    public ImportantTweet(String message){
        super(message);
    }

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }


    /**
     * overrides isImportant() in super class
     * @return True
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
