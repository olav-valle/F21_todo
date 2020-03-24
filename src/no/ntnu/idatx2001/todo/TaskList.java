package no.ntnu.idatx2001.todo;

import java.util.Iterator;

public interface TaskList extends Iterable<TodoTask> {
  void addTodoTask(TodoTask todoTask);

  @Override
  Iterator<TodoTask> iterator();


  void close();
}
