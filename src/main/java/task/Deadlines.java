package task;

import main.TaskList;

import java.time.LocalDateTime;

/**
 * Represents the task deadline.
 */
public class Deadlines extends Task {

    private LocalDateTime date;

    /**
     * Creates the Deadlines object
     *
     * @param description Task message.
     * @param date        Date of deadline in DD/MM/YYYY TTTT format.
     * @param isDone      Marks the task as done nor not done.
     */
    public Deadlines(String description, LocalDateTime date, boolean isDone) {
        super(description, isDone);
        this.date = date;
    }

    /**
     * Returns the DateTime object of deadline.
     *
     * @return DateTime object of deadline.
     */
    public LocalDateTime getDate() {
        return this.date;
    }

    @Override
    public String toString() {
        return "[D]" + "[" + getStatusIcon() + "] " + getDescription() + " (by: " + TaskList.localDateTimeToString(this.date) + ")";
    }
}
