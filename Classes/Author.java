public class Author {
    String firstName;
    String lastName;

    public Author(String firsName, String lastName){
        this.firstName = firsName;
        this.lastName = lastName; 
    }

    public void setFirsName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFirstName(){
        return this.firstName; 
    }

    public String getLastName(){
        return this.lastName; 
    }

    public String toString(){
        return this.firstName + " " + this.lastName; 
    }
}
