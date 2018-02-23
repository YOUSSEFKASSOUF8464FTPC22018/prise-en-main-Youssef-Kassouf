public class Client{
    private string _id;
    private string _prenom;
    private string _nom;
    private string _telephone;
    private string _rue;
    private string _ville;
    private string _etat;
    private string _code;
    private string _pays;
    private string _mail;

    public Client(DataBuilder db){
        _id = db._id;
        _prenom = db._prenom;
        _nom = db._nom;
        _telephone = db._telephone;
        _rue = db._rue;
        _ville = db._ville;
        _etat = db._etat;
        _code = db._code;
        _pays = db._pays;
        _mail = db._mail;
    }

    public string getId(){
        return _id;
    }
    public string getPrenom(){
        return _prenom;
    }
    public string getNom(){
        return _nom;
    }
    public string getTelephone(){
        return _telephone;
    }
    public string getRue(){
        return _rue;
    }
    public string getVille(){
        return _ville;
    }
    public string getEtat(){
        return _etat;
    }
    public string getCode(){
        return _code;
    }
    public string getPays(){
        return _pays;
    }
    public string getMail(){
        return _mail;
    }
}