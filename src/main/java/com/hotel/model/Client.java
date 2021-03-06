package main.java.com.hotel.model;
// Generated 30 avr. 2017 02:56:43 by Hibernate Tools 5.2.0.CR1

import javafx.beans.property.*;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * @author Hicham Bali
 */

@Entity
@Table(name = "client", catalog = "hotel")
public class Client implements java.io.Serializable {


    private IntegerProperty idClient;
    private StringProperty nom;
    private StringProperty prenom;
    private ObjectProperty<Date> dateNaissance;
    private StringProperty tel;
    private StringProperty numeroPieceIdentite;

    public Client() {
        this.idClient = new SimpleIntegerProperty();
        this.nom = new SimpleStringProperty();
        this.prenom = new SimpleStringProperty();
        this.dateNaissance = new SimpleObjectProperty<>();
        this.tel = new SimpleStringProperty();
        numeroPieceIdentite = new SimpleStringProperty();
    }

    public Client(int idClient) {
        this.idClient = new SimpleIntegerProperty(idClient);
        this.nom = new SimpleStringProperty();
        this.prenom = new SimpleStringProperty();
        this.dateNaissance = new SimpleObjectProperty<>();
        this.tel = new SimpleStringProperty();
        numeroPieceIdentite = new SimpleStringProperty();
    }

    public Client(int idClient, String nom, String prenom, Date dateNaissance, String tel) {
        this.idClient = new SimpleIntegerProperty(idClient);
        this.nom = new SimpleStringProperty(nom);
        this.prenom = new SimpleStringProperty(prenom);
        this.dateNaissance = new SimpleObjectProperty<>(dateNaissance);
        this.tel = new SimpleStringProperty(tel);
        numeroPieceIdentite = new SimpleStringProperty();

    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "idClient", unique = true, nullable = false)
    public int getIdClient() {
        return this.idClient.get();
    }

    public void setIdClient(int idClient) {
        this.idClient.set(idClient);
    }

    @Column(name = "nom", length = 20)
    public String getNom() {
        return this.nom.get();
    }

    public void setNom(String nom) {
        this.nom.set(nom);
    }

    @Column(name = "prenom", length = 20)
    public String getPrenom() {
        return this.prenom.get();
    }

    public void setPrenom(String prenom) {
        this.prenom.set(prenom);
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "dateNaissance", length = 10)
    public Date getDateNaissance() {
        return this.dateNaissance.get();
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance.set(dateNaissance);
    }

    @Column(name = "tel", length = 10)
    public String getTel() {
        return this.tel.get();
    }

    public void setTel(String tel) {
        this.tel.set(tel);
    }

    @Column(name = "numeroPieceIdentite", length = 25)
    public String getNumeroPieceIdentite() {
        return numeroPieceIdentite.get();
    }

    public void setNumeroPieceIdentite(String numeroPieceIdentite) {
        this.numeroPieceIdentite.set(numeroPieceIdentite);
    }

    public StringProperty numeroPieceIdentiteProperty() {
        return numeroPieceIdentite;
    }

    public IntegerProperty idClientProperty() {
        return idClient;
    }

    public StringProperty nomProperty() {
        return nom;
    }

    public StringProperty prenomProperty() {
        return prenom;
    }

    public ObjectProperty<Date> dateNaissanceProperty() {
        return dateNaissance;
    }

    public StringProperty telProperty() {
        return tel;
    }


    @Override
    public String toString() {
        return getNom() + " " + getPrenom();
    }
}
