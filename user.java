public abstract class user{

    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String phonenumber;
    private String password;

    public user(){}

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFirstname(){
        return firstname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPhonenumber(){
        return phonenumber;
    }

    public void setPhoenumber(String phonenumber){
        this.phonenumber = phonenumber;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public abstract void showlist();
}

