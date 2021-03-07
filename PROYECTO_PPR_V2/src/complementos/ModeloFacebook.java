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
public class ModeloFacebook {
    private String post_id;
    private String text;
    private String time;
    private String image;
    private String images;
    private String likes;
    private String comments;
    private String shares;
    private String post_url;
    private String link;
    private String Registrousuario_idUsuario;

    public ModeloFacebook(String post_id, String text, String time, String image, String images, String likes, String comments, String shares, String post_url, String link, String Registrousuario_idUsuario) {
        this.post_id = post_id;
        this.text = text;
        this.time = time;
        this.image = image;
        this.images = images;
        this.likes = likes;
        this.comments = comments;
        this.shares = shares;
        this.post_url = post_url;
        this.link = link;
        this.Registrousuario_idUsuario = Registrousuario_idUsuario;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getRegistrousuario_idUsuario() {
        return Registrousuario_idUsuario;
    }

    public void setRegistrousuario_idUsuario(String Registrousuario_idUsuario) {
        this.Registrousuario_idUsuario = Registrousuario_idUsuario;
    }

    public String getPost_id() {
        return post_id;
    }

    public void setPost_id(String post_id) {
        this.post_id = post_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getShares() {
        return shares;
    }

    public void setShares(String shares) {
        this.shares = shares;
    }

    public String getPost_url() {
        return post_url;
    }

    public void setPost_url(String post_url) {
        this.post_url = post_url;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    
    
    
}
