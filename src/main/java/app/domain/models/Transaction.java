package app.domain.models;

import java.util.Date;

@javax.persistence.Entity
public class Transaction extends Entity<Long> {
    public Date date;
    public long duration;
    public String Content;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}

