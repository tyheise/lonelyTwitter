

/*Tweet
 *
 * *
 * Version 1.0
 *
 * Spetember 26, 2017
 *
 * Copyright 2017 Team X. CMPUT301. UofA ALL RIGHTS RESERVED. You may use distribute or modify this
 * code under terms and conditions of the Code of Student Behaviours at the UofA. You may find a copy
  * of this license in the project. Otherwise contact: 911
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Represents a tweet.
 *
 * @author Tyler Heise
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */
public abstract class Tweet {

    private String message;
    private Date date;

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     *Constructs a tweet object.
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    /**
     *
     *@returns true or false if important
     */
    public abstract Boolean isImportant();

    /**
     * Sets the message of a tweet.
     *
     * @param message tweet message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     * gets the message of the tweet
     *
     * @return string message
     */
    public String getMessage(){
        return this.message;
    }

    /**
     * gets the date of the tweet
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * sets the date of the tweet
     * @param date date of the tweet
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Makes a string representation of the tweet
     * @return string representation of the tweet
     */
    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
