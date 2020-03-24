package no.ntnu.idatx2001.todo;

public class TodoApp {
  private final TaskList taskList;

  public TodoApp() {
    this.taskList = new TaskListDao();
  }

  /**
   * Adds five dummy tasks to task list, for testing.
   */
  public void addDummyTasks() {
    this.taskList.addTodoTask(new TodoTask("task1", "task1"));
    this.taskList.addTodoTask(new TodoTask("task2", "task2"));
    this.taskList.addTodoTask(new TodoTask("task3", "task3"));
    this.taskList.addTodoTask(new TodoTask("task4", "task4"));
    this.taskList.addTodoTask(new TodoTask("task5", "task5"));
  }

  /**
   * prints all tasks registered in list.
   */
  public void printAllTasks() {
    taskList.forEach(System.out::println);
    taskList.forEach(t -> System.out.println(
        "Task: " + t.getSummary() + " Description: " + t.getDescription()));
  }

  /**
   * Closes the task list.
   */
  public void close() {
    this.taskList.close();
  }

  /**
   * Main method for TodoApp.
   * @param args No valid args for this method.
   */
  public static void main(String[] args) {
    TodoApp app = new TodoApp();

    app.addDummyTasks();
    app.printAllTasks();
    app.close();
  }
}
