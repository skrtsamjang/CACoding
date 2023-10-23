package use_case.clear_users;

// TODO Complete me

public class ClearOutputData {
    private String usernames;
    public ClearOutputData(String clearedUsernames) {
        String usernames = clearedUsernames;
    }

    public String getUsernames(){ return usernames; }
    public void setUsernames(String usernames) {
        this.usernames = usernames;
    }
}
