package sportstats;

public class Match {

	private Club homeClub;
	private Club guestClub;

	public Match( Club homeClub, Club guestClub ) {
		this.homeClub = homeClub;
		this.guestClub = guestClub;
	}

	public Club getHomeClub() { return this.homeClub; }

	public Club getGuestClub() { return this.guestClub; }

}
