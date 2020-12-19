package events;

public class Event {

private int creationDate;
private int eventDate;
private int eventTime;
private String description;
private String location;
private int importance;
private int duration;
private String status;
private int id;

    public Event(int creationDate, int eventDate, int eventTime, String discription, String location, int importance, int duration, String status, int id) {
        this.creationDate = creationDate;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.description = discription;
        this.location = location;
        this.importance = importance;
        this.duration = duration;
        this.status = status;
        this.id = id;
    }

    public int getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(int creationDate) {
        this.creationDate = creationDate;
    }

    public int getEventDate() {
        return eventDate;
    }

    public void setEventDate(int eventDate) {
        this.eventDate = eventDate;
    }

    public int getEventTime() {
        return eventTime;
    }

    public void setEventTime(int eventTime) {
        this.eventTime = eventTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Event{" +
                "creationDate=" + creationDate +
                ", eventDate=" + eventDate +
                ", eventTime=" + eventTime +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", importance=" + importance +
                ", duration=" + duration +
                ", status='" + status + '\'' +
                ", id=" + id +
                '}';
    }
}
