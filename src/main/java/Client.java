public class Client extends Bean {
    private String name;
    private String surname;

    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public Client(int id,String name,String surname){
        super(id,name);
        this.surname = surname;

    }
    @Override
    public String toString(){
        return getId() + " " + getName() + " " + surname + " ";

    }
}
