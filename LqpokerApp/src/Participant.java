import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Participant {

@SerializedName("Player_ID")
@Expose
private String playerID;
@SerializedName("Tournament_ID")
@Expose
private String tournamentID;
@SerializedName("Points")
@Expose
private String points;
@SerializedName("Rebuys")
@Expose
private String rebuys;
@SerializedName("Addon")
@Expose
private String addon;
@SerializedName("Bounties")
@Expose
private String bounties;

/**
* No args constructor for use in serialization
* 
*/
public Participant() {
}

/**
* 
* @param bounties
* @param tournamentID
* @param rebuys
* @param playerID
* @param addon
* @param points
*/
public Participant(String playerID, String tournamentID, String points, String rebuys, String addon, String bounties) {
super();
this.playerID = playerID;
this.tournamentID = tournamentID;
this.points = points;
this.rebuys = rebuys;
this.addon = addon;
this.bounties = bounties;
}

public String getPlayerID() {
return playerID;
}

public void setPlayerID(String playerID) {
this.playerID = playerID;
}

public String getTournamentID() {
return tournamentID;
}

public void setTournamentID(String tournamentID) {
this.tournamentID = tournamentID;
}

public String getPoints() {
return points;
}

public void setPoints(String points) {
this.points = points;
}

public String getRebuys() {
return rebuys;
}

public void setRebuys(String rebuys) {
this.rebuys = rebuys;
}

public String getAddon() {
return addon;
}

public void setAddon(String addon) {
this.addon = addon;
}

public String getBounties() {
return bounties;
}

public void setBounties(String bounties) {
this.bounties = bounties;
}
}