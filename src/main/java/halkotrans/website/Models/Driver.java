package halkotrans.website.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.net.URL;

@Entity
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String position;
    private URL url_truckersmp;
    private URL url_steam;
    private URL url_trucksbook;
    private URL url_photo;

    public Driver(String userName, String position, URL url_truckersmp, URL url_steam, URL url_trucksbook, URL url_photo) {
        this.userName = userName;
        this.position = position;
        this.url_truckersmp = url_truckersmp;
        this.url_steam = url_steam;
        this.url_trucksbook = url_trucksbook;
        this.url_photo = url_photo;
    }

    public Driver() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public URL getUrl_truckersmp() {
        return url_truckersmp;
    }

    public void setUrl_truckersmp(URL url_truckersmp) {
        this.url_truckersmp = url_truckersmp;
    }

    public URL getUrl_steam() {
        return url_steam;
    }

    public void setUrl_steam(URL url_steam) {
        this.url_steam = url_steam;
    }

    public URL getUrl_trucksbook() {
        return url_trucksbook;
    }

    public void setUrl_trucksbook(URL url_trucksbook) {
        this.url_trucksbook = url_trucksbook;
    }

    public URL getUrl_photo() {
        return url_photo;
    }

    public void setUrl_photo(URL url_photo) {
        this.url_photo = url_photo;
    }
}
