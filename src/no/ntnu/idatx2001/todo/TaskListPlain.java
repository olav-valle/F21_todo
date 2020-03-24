package no.ntnu.idatx2001.todo;

import java.util.ArrayList;
import java.util.Iterator;

public class TaskListPlain implements TaskList {
  ArrayList<TodoTask> tasks;

  public TaskListPlain(){
    this.tasks = new ArrayList<>();
  }

  @Override
  public void addTodoTask(TodoTask todoTask){
    this.tasks.add(todoTask);
  }

  @Override
  public Iterator<TodoTask> iterator() {
    return this.tasks.iterator();
  }
}
