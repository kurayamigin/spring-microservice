package app.application.dtos;

import org.json.JSONObject;

import java.util.Date;

public class TransactionDto {
    private Date date;
    private long duration;

    private String Content;

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
