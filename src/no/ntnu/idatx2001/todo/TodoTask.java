package no.ntnu.idatx2001.todo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Represent a task to be executed. The task has a neam or summary,
 * a description and a status indicating if done or not.
 */
@Entity
public class TodoTask implements Serializable {

  @Id
  @GeneratedValue
  private Integer id;
  private String summary;
  private String description;
  private boolean done;


  /**
   * Default constructor.
   */
  public TodoTask(){

  }

  /**
   * Creates an instance of TodoTask.
   * Note how mutator-methods are used to set the fields instead
   * of setting the fields directly.
   *
   * @param summary     a short summary of what to do
   * @param description a more detailed description of the task
   */
  public TodoTask(String summary, String description) {
    this.setSummary(summary);
    this.setDescription(description);

  }

  /**
   * Returns the summary.
   *
   * @return the summary
   */
  public String getSummary() {
    return summary;
  }

  /**
   * Sets the summary.
   *
   * @param summary the summary to be set
   */
  public void setSummary(String summary) {
    this.summary = summary;
  }

  /**
   * Returns the description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the description.
   *
   * @param description the description of the task
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Returns <code>true</code> if the task has been done.
   *
   * @return <code>true</code> if the task has been done.
   */
  public boolean isDone() {
    return this.done;
  }

  /**
   * Sets the status of the task to DONE.
   *
   */
  public void setDone() {
    this.done = true;
  }

  @Override
  public String toString() {
    return "Todo [summary=" + summary
      + ", description=" + description
      + ", done=" + done
      + "]";
  }
}