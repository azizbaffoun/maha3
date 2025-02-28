package tn.esprit.powerHr.models;

public class Entreprise {
    private int id;
    private String nom;
    private String secteur;
    private String matriculeFiscale;
    private String email;

    // Constructor
    public Entreprise() {}

    public Entreprise(String nom, String secteur, String matriculeFiscale, String email) {
        this.nom = nom;
        this.secteur = secteur;
        this.matriculeFiscale = matriculeFiscale;
        this.email = email;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getSecteur() { return secteur; }
    public void setSecteur(String secteur) { this.secteur = secteur; }
    public String getMatriculeFiscale() { return matriculeFiscale; }
    public void setMatriculeFiscale(String matriculeFiscale) { this.matriculeFiscale = matriculeFiscale; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "Entreprise{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", secteur='" + secteur + '\'' +
                ", matriculeFiscale='" + matriculeFiscale + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
} 