package domain;

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
}
