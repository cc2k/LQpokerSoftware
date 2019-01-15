import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tournament {

@SerializedName("ID")
@Expose
private String iD;
@SerializedName("Tournament number")
@Expose
private Integer tournamentNumber;
@SerializedName("Date")
@Expose
private String date;
@SerializedName("Type")
@Expose
private String type;

/**
* No args constructor for use in serialization
* 
*/
public Tournament() {
}

/**
* 
* @param tournamentNumber
* @param type
* @param date
* @param iD
*/
public Tournament(String iD, Integer tournamentNumber, String date, String type) {
super();
this.iD = iD;
this.tournamentNumber = tournamentNumber;
this.date = date;
this.type = type;
}

public String getID() {
return iD;
}

public void setID(String iD) {
this.iD = iD;
}

public Integer getTournamentNumber() {
return tournamentNumber;
}

public void setTournamentNumber(Integer tournamentNumber) {
this.tournamentNumber = tournamentNumber;
}

public String getDate() {
return date;
}

public void setDate(String date) {
this.date = date;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

}