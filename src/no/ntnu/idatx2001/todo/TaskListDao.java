package no.ntnu.idatx2001.todo;

import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class TaskListDao implements TaskList {
  private final EntityManagerFactory emf;
  private final EntityManager em;

  /**
   * Constructor for the TaskList Data Access Object.
   */
  public TaskListDao() {
    this.emf = Persistence.createEntityManagerFactory("todo-pu");
    // creates an EM factory for this persistence unit name.
    this.em = this.emf.createEntityManager();
    // gets EM from factory
  }

  @Override
  public void addTodoTask(TodoTask todoTask) {
    this.em.getTransaction().begin(); // begins manager transaction
    this.em.persist(todoTask); // adds TodoTask object to DB
    this.em.getTransaction().commit(); // commits manager transaction
  }

  @SuppressWarnings("unchecked")
  @Override
  public Iterator<TodoTask> iterator() {
    List<TodoTask> taskList;

    String jpql = "SELECT t FROM TodoTask t"; // Persistence query string
    Query query = this.em.createQuery(jpql); // Query the manager using string
    //noinspection unchecked
    taskList = query.getResultList(); // store query results in list

    return taskList.iterator();
  }

  public void close() {
    this.em.close();
    this.emf.close();
  }
}
