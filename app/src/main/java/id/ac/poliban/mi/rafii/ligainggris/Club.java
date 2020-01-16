package id.ac.poliban.mi.rafii.ligainggris;

public class Club {
    private String clubs;
    private String clubName;
    private String clubDesc;

    public Club(String clubs, String clubName, String clubDesc) {
        this.clubs = clubs;
        this.clubName = clubName;
        this.clubDesc = clubDesc;
    }

    public String getClubs() {
        return clubs;
    }

    public void setClubs(String clubs) {
        this.clubs = clubs;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubDesc() {
        return clubDesc;
    }

    public void setClubDesc(String clubDesc) {
        this.clubDesc = clubDesc;
    }

    @Override
    public String toString() {
        return String.format("%30s\n\n%s", getClubName(), getClubDesc());
    }
}

