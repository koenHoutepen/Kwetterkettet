package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KwetterManager {
    private List<Profile> profiles;
    private List<Mention> mentions;
    private List<Trend> trends;

    public KwetterManager(List<Profile> profiles, List<Mention> mentions, List<Trend> trends) {
        this.profiles = profiles;
        this.mentions = mentions;
        this.trends = trends;
    }

    public Kweet CreeerKweet(Profile posterProfile, String message) {
        String userName = posterProfile.getUsername();
        Date createDate = new Date();
        List<String> fillList = new ArrayList<String>();
        Kweet kweet = new Kweet(userName, message, createDate, fillList, fillList, fillList);
        return kweet;
    }
}
