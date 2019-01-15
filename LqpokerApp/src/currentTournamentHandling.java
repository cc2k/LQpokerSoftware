public class currentTournamentHandling {

	
	
	
public String getPlayerListStringWithRanking(String playersName, int playerRank, String typeTournament, int totalPlayersInTournament) {

		
		
		String tempString = playersName + "     points: "
				+ getPointsCurrentTournament(typeTournament, playerRank, totalPlayersInTournament);

		return tempString;
	}

public int getPointsCurrentTournament(String typeTournament, int rankTournament, int totalPlayersInTournament) {
	int valueTopassOn = 0;
//	if (totalPlayersInTournament <= 0) {
//		
//	}

	switch (typeTournament) {
	case "Normal": {

		if (!isBetween(rankTournament, 1, 7)) {
			valueTopassOn = (1 + totalPlayersInTournament) - rankTournament;
		} else if (isBetween(rankTournament, 6, 7)) {
			valueTopassOn = (1 + totalPlayersInTournament) - rankTournament + 2;
		} else if (isBetween(rankTournament, 4, 5)) {
			valueTopassOn = (1 + totalPlayersInTournament) - rankTournament + 3;
		} else if (isBetween(rankTournament, 2, 3)) {
			valueTopassOn = (1 + totalPlayersInTournament) - rankTournament + 4;
		}else if (rankTournament == 1) {
			valueTopassOn = (1 + totalPlayersInTournament) - rankTournament + 5;
		} else {
			valueTopassOn = (1 + totalPlayersInTournament) - rankTournament;
		}

		return valueTopassOn;
	}
	case "Team": {
		
		if (rankTournament == 3) {
			valueTopassOn = (1 + totalPlayersInTournament) - rankTournament + 1;
		}else if (rankTournament== 2) {
			valueTopassOn = (1 + totalPlayersInTournament) - rankTournament + 2;
		}else if (rankTournament == 1) {
			valueTopassOn = (1 + totalPlayersInTournament) - rankTournament + 3;
		}else {
			valueTopassOn = (1 + totalPlayersInTournament) - rankTournament;
		}

		return valueTopassOn;
	}
	default:
		break;
	}

	return valueTopassOn;
}

private boolean isBetween(int x, int lower, int upper) {
	return lower <= x && x <= upper;
}

public void updateListCurrentTournamentPoints(java.awt.List listCurrentTournament, int playerRank, String typeTournament, int totalPlayersInTournament) {
	int selectedIndex = listCurrentTournament.getSelectedIndex();
	String oldValue = listCurrentTournament.getSelectedItem();
	int playerNewEditRank = playerRank;

	if (selectedIndex >= 0) {
		listCurrentTournament.replaceItem((selectedIndex + 1 + ". "), selectedIndex);
		listCurrentTournament.replaceItem(playerNewEditRank + ". " + 
		getPlayerListStringWithRanking( oldValue.replace(selectedIndex + 1 + ". ", "")
						.replace("     points: " + getPointsCurrentTournament
								(typeTournament, selectedIndex + 1, totalPlayersInTournament), ""),
				playerNewEditRank, typeTournament, totalPlayersInTournament), playerNewEditRank - 1 );

	}

}

public java.awt.List updateTypeNormaalToTeamListCurrentTournamentPoints(int teamSize, java.awt.List listCurrentTournament, String typeTournament, int totalPlayersInTournament) {
	java.awt.List tempList = listCurrentTournament;
	
	String[] listNewUpdate = new String[tempList.getItemCount()];
	int rank =0;
	String tempString="";
	
	for(int i =0; tempList.getItemCount()-1>=i;i++) {
		
	//if(listCurrentTournament.getItem(i)=="") {
		//add the player to the place in the list
		tempString = tempList.getItem(i);
				tempString = tempString.toString().replace(i+1+". ", "");
		
				
				int prevScore=0;
				prevScore = getPointsCurrentTournament("Normal", i+1,totalPlayersInTournament);
				tempString =tempString.replace("     points: " + prevScore,""); 
				//getPointsCurrentTournament(   listCurrentTournament.getItem(i).toString().toString(), 
				//getPointsCurrentTournament(   "Normaal", i+1)     )        , "");/// if normal tournament
		
		System.out.print("tempString: "+tempString+"\n");
		//System.out.print("new "+tempString);
		
		
		rank = (i/teamSize)+1;
		
		
		
		tempString = rank +". "+tempString;
		System.out.print("rank + tempString: "+tempString+"\n");
		tempString = tempString+getPointsCurrentTournament("Team", rank, totalPlayersInTournament);
		System.out.print("rank+tempstring+punten: "+tempString+"\n");
		listNewUpdate[i] = tempString;
		
		
		//listNewUpdate[i]=listCurrentTournament.getItem(i);
	
		
		//team places 123=nr1   456=nr2  789 =nr3 101112=nr 4  etc
		
								
	}
	return tempList;
}
}
