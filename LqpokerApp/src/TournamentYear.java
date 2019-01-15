import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TournamentYear {

@SerializedName("Year")
@Expose
private String year;
@SerializedName("Block")
@Expose
private List<Block> block = null;
@SerializedName("Participant")
@Expose
private List<Participant> participant = null;

/**
* No args constructor for use in serialization
* 
*/
public TournamentYear() {
}

/**
* 
* @param participant
* @param block
* @param year
*/
public TournamentYear(String year, List<Block> block, List<Participant> participant) {
super();
this.year = year;
this.block = block;
this.participant = participant;
}

public String getYear() {
return year;
}

public void setYear(String year) {
this.year = year;
}

public List<Block> getBlock() {
return block;
}

public void setBlock(List<Block> block) {
this.block = block;
}

public List<Participant> getParticipant() {
return participant;
}

public void setParticipant(List<Participant> participant) {
this.participant = participant;
}
}