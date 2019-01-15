import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Type {

@SerializedName("Type")
@Expose
private String type;

/**
* No args constructor for use in serialization
* 
*/
public Type() {
}

/**
* 
* @param type
*/
public Type(String type) {
super();
this.type = type;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}



}