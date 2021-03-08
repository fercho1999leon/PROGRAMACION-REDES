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
public class ModeloInstagram {
    private String id;
    private String shortcode;
    private String display_url;
    private String edge_media_to_comment;
    private String edge_liked_by;
    private String Registrousuario_idUsuario;

    public ModeloInstagram(String id, String shortcode, String display_url, String edge_media_to_comment, String edge_liked_by, String Registrousuario_idUsuario) {
        this.id = id;
        this.shortcode = shortcode;
        this.display_url = display_url;
        this.edge_media_to_comment = edge_media_to_comment;
        this.edge_liked_by = edge_liked_by;
        this.Registrousuario_idUsuario = Registrousuario_idUsuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShortcode() {
        return shortcode;
    }

    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    public String getDisplay_url() {
        return display_url;
    }

    public void setDisplay_url(String display_url) {
        this.display_url = display_url;
    }

    public String getEdge_media_to_comment() {
        return edge_media_to_comment;
    }

    public void setEdge_media_to_comment(String edge_media_to_comment) {
        this.edge_media_to_comment = edge_media_to_comment;
    }

    public String getEdge_liked_by() {
        return edge_liked_by;
    }

    public void setEdge_liked_by(String edge_liked_by) {
        this.edge_liked_by = edge_liked_by;
    }

    public String getRegistrousuario_idUsuario() {
        return Registrousuario_idUsuario;
    }

    public void setRegistrousuario_idUsuario(String Registrousuario_idUsuario) {
        this.Registrousuario_idUsuario = Registrousuario_idUsuario;
    }
    
}
