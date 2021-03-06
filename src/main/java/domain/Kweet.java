package domain;

import java.security.InvalidParameterException;
import java.util.Date;
import java.util.List;

public class Kweet {
    private String owner;
    private String message;
    private Date postDate;
    private List<String> likes;
    private List<String> mentions;
    private List<String> trends;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public List<String> getLikes() {
        return likes;
    }

    public void setLikes(List<String> likes) {
        this.likes = likes;
    }

    public List<String> getMentions() {
        return mentions;
    }

    public void setMentions(List<String> mentions) {
        this.mentions = mentions;
    }

    public List<String> getTrends() {
        return trends;
    }

    public void setTrends(List<String> trends) {
        this.trends = trends;
    }

    public Kweet(String owner, String message, Date postDate, List<String> likes, List<String> mentions, List<String> trends) {
        if (owner.isEmpty()) {
            throw new InvalidParameterException("username has to be entered");
        }
        if (message.isEmpty() || message.length() > 140) {
            throw new InvalidParameterException("message is invalid");
        }
        if(mentions == null || trends == null || likes == null){
            throw new InvalidParameterException("Kweet creation failed");
        }
        this.owner = owner;
        this.message = message;
        this.postDate = postDate;
        this.likes = likes;
        this.mentions = mentions;
        this.trends = trends;
    }
}
