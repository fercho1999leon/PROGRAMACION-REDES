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
    private String url;
    private String expanded_url;
    private String display_url;
    private String Registrousuario_idUsuario;

    public ModeloTwitter(String tweet_id, String created_at, String tweet_text, String screen_name, String name, String account_creation_date, String url, String expanded_url, String display_url, String Registrousuario_idUsuario) {
        this.tweet_id = tweet_id;
        this.created_at = created_at;
        this.tweet_text = tweet_text;
        this.screen_name = screen_name;
        this.name = name;
        this.account_creation_date = account_creation_date;
        this.url = url;
        this.expanded_url = expanded_url;
        this.display_url = display_url;
        this.Registrousuario_idUsuario = Registrousuario_idUsuario;
    }

    public String getRegistrousuario_idUsuario() {
        return Registrousuario_idUsuario;
    }

    public void setRegistrousuario_idUsuario(String Registrousuario_idUsuario) {
        this.Registrousuario_idUsuario = Registrousuario_idUsuario;
    }

    

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getExpanded_url() {
        return expanded_url;
    }

    public void setExpanded_url(String expanded_url) {
        this.expanded_url = expanded_url;
    }

    public String getDisplay_url() {
        return display_url;
    }

    public void setDisplay_url(String display_url) {
        this.display_url = display_url;
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
}
