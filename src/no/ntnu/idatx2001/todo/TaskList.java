package no.ntnu.idatx2001.todo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class TaskList implements Iterable<TodoTask>{
  ArrayList<TodoTask> tasks;

  public TaskList(){
    this.tasks = new ArrayList<>();
  }

  public void addTodoTask(TodoTask todoTask){
    this.tasks.add(todoTask);
  }

  @Override
  public Iterator<TodoTask> iterator() {
    return this.tasks.iterator();
  }
}
