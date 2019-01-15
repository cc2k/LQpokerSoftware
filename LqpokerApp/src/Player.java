import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Player {

@SerializedName("ID")
@Expose
private Integer iD;
@SerializedName("Name")
@Expose
private String name;
@SerializedName("Surname")
@Expose
private String surname;
@SerializedName("Username")
@Expose
private String username;
@SerializedName("Password")
@Expose
private String password;
@SerializedName("Editor")
@Expose
private Boolean editor;
@SerializedName("Middle name")
@Expose
private String middleName;



/**
* No args constructor for use in serialization
* 
*/
public Player() {
}

/**
* 
* @param editor
* @param password
* @param surname
* @param middle name
* @param name
* @param username
* @param iD
*/
public Player(Integer iD, String name, String middleName, String surname, String username, String password, Boolean editor) {
super();
this.iD = iD;
this.name = name;
this.middleName = middleName;
this.surname = surname;
this.username = username;
this.password = password;
this.editor = editor;
}

public Integer getID() {
return iD;
}

public void setID(Integer iD) {
this.iD = iD;
}

public String getname() {
return name;
}

public void setname(String name) {
this.name = name;
}

public String getmiddleName() {
	return middleName;
}

public void setmiddleName(String middleName) {
	this.middleName =middleName;
}

public String getsurname() {
return surname;
}

public void setsurname(String surname) {
this.surname = surname;
}

public String getusername() {
return username;
}

public void setusername(String username) {
this.username = username;
}

public String getpassword() {
return password;
}

public void setpassword(String password) {
this.password = password;
}

public Boolean getEditor() {
return editor;
}

public void setEditor(Boolean editor) {
this.editor = editor;
}


}