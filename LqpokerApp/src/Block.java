

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Block {

@SerializedName("Block number")
@Expose
private String blockNumber;
@SerializedName("Tournament")
@Expose
private List<Tournament> tournament = null;

/**
* No args constructor for use in serialization
* 
*/
public Block() {
}

/**
* 
* @param tournament
* @param blockNumber
*/
public Block(String blockNumber, List<Tournament> tournament) {
super();
this.blockNumber = blockNumber;
this.tournament = tournament;
}

public String getBlockNumber() {
return blockNumber;
}

public void setBlockNumber(String blockNumber) {
this.blockNumber = blockNumber;
}

public List<Tournament> getTournament() {
return tournament;
}

public void setTournament(List<Tournament> tournament) {
this.tournament = tournament;
}
}