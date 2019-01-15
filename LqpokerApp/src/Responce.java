import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

class Responce {
    @SerializedName("Player")
    private JsonArray player;
    @SerializedName("Type")
    private JsonArray type;
    @SerializedName("Participant")
    private JsonArray participant;
	@SerializedName("Block")
    private JsonArray block;
    @SerializedName("Tournament year")
    private JsonObject tournamentYear;
    

	public JsonArray getType() {
		return type;
	}

	public void setType(JsonArray type) {
		this.type = type;
	}

	public JsonArray getPlayer() {
		return player;
	}

	public void setPlayer(JsonArray player) {
		this.player = player;
	}
	 public JsonArray getBlock() {
		return block;
	}

	public void setBlock(JsonArray block) {
		this.block = block;
	}

	public JsonObject getTournamentYear() {
		return tournamentYear;
	}

	public void setTournamentYear(JsonObject tournamentYear) {
		this.tournamentYear = tournamentYear;
	}
	
	public JsonArray getParticipant() {
		return participant;
	}

	public void setParticipant(JsonArray participant) {
		this.participant = participant;
	}

	@Override
	    public String toString() {
	      return "Responce{" +
	          "participants=" + player +
	          '}';
	    }
}