package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/12/17.
 */

/**
 * @author Tyler Heise
 * @version 1.5
 * @see ImportantTweet
 * @see Tweet
 * @since 1.0
 */
public class NormalTweet extends Tweet {

    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * overrides isImportant() in super class
     * @return FALSE
     */
    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }

}
