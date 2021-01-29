/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementos;

/**
 *
 * @author FERNANDO
 */
public class ModeloTwitter {
    private String tweet_id;
    private String created_at;
    private String tweet_text;
    private String screen_name;
    private String name;
    private String account_creation_date;
    private String urlstwitter_urls_id;

    public ModeloTwitter(String tweet_id, String created_at, String tweet_text, String screen_name, String name, String account_creation_date, String urlstwitter_urls_id) {
        this.tweet_id = tweet_id;
        this.created_at = created_at;
        this.tweet_text = tweet_text;
        this.screen_name = screen_name;
        this.name = name;
        this.account_creation_date = account_creation_date;
        this.urlstwitter_urls_id = urlstwitter_urls_id;
    }

    public String getTweet_id() {
        return tweet_id;
    }

    public void setTweet_id(String tweet_id) {
        this.tweet_id = tweet_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getTweet_text() {
        return tweet_text;
    }

    public void setTweet_text(String tweet_text) {
        this.tweet_text = tweet_text;
    }

    public String getScreen_name() {
        return screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount_creation_date() {
        return account_creation_date;
    }

    public void setAccount_creation_date(String account_creation_date) {
        this.account_creation_date = account_creation_date;
    }

    public String getUrlstwitter_urls_id() {
        return urlstwitter_urls_id;
    }

    public void setUrlstwitter_urls_id(String urlstwitter_urls_id) {
        this.urlstwitter_urls_id = urlstwitter_urls_id;
    }
    
    
}
