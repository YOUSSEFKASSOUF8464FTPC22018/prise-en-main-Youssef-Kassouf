public class Client{
    private String _id;
    private String _prenom;
    private String _nom;
    private String _telephone;
    private String _rue;
    private String _ville;
    private String _etat;
    private String _code;
    private String _pays;
    private String _mail;

    public Client(ClientBuilder cb){
        _id = cb._id;
        _prenom = cb._prenom;
        _nom = cb._nom;
        _telephone = cb._telephone;
        _rue = cb._rue;
        _ville = cb._ville;
        _etat = cb._etat;
        _code = cb._code;
        _pays = cb._pays;
        _mail = cb._mail;
    }

    public String getId(){
        return _id;
    }
    public String getPrenom(){
        return _prenom;
    }
    public String getNom(){
        return _nom;
    }
    public String getTelephone(){
        return _telephone;
    }
    public String getRue(){
        return _rue;
    }
    public String getVille(){
        return _ville;
    }
    public String getEtat(){
        return _etat;
    }
    public String getCode(){
        return _code;
    }
    public String getPays(){
        return _pays;
    }
    public String getMail(){
        return _mail;
    }

    public void setPrenom(String prenom){
        _prenom = prenom;
    }
    public void setNom(String nom){
        _nom = nom;
    }
    public void setTelephone(String telephone){
        _telephone = telephone;
    }
    public void setRue(String rue){
        _rue = rue;
    }
    public void setVille(String ville){
        _ville = ville;
    }
    public void setEtat(String etat){
        _etat = etat;
    }
    public void setCode(String code){
        _code = code;
    }
    public void setPays(String pays){
        _pays = pays;
    }
    public void setMail(String mail){
        _mail = mail;
    }

    public static class ClientBuilder {
        String _id;
        String _prenom;
        String _nom;
        String _telephone;
        String _rue;
        String _ville;
        String _etat;
        String _code;
        String _pays;
        String _mail;

        public ClientBuilder(String id, String prenom, String nom){
            _id = id;
            _prenom = prenom;
            _nom = nom;
        }

        public ClientBuilder telephone (String telephone){
            _telephone = telephone;
            return this;
        }
        public ClientBuilder rue (String rue){
            _rue = rue;
            return this;
        }
        public ClientBuilder ville (String ville){
            _ville = ville;
            return this;
        }
        public ClientBuilder etat (String etat){
            _etat = etat;
            return this;
        }
        public ClientBuilder code (String code){
            _code = code;
            return this;
        }
        public ClientBuilder pays (String pays){
            _pays = pays;
            return this;
        }
        public ClientBuilder mail (String mail){
            _mail = mail;
            return this;
        }

        public Client build(){
            return new Client(this);
        }
    }
}