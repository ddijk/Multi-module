package nl.dijkrosoft.multimod.backend;

public class QueryBuilder {

    public String selectAllTeamsI() {
        return "select * from teams";
    }

    public int deleteAllTeams() {

        return 3;
    }

    public int deleteTeam(int teamId) {
        switch (teamId ) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
            case 3:
                break;
            case 4:
                break;
        }

        return 1;
    }
}
