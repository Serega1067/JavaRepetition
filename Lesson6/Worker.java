package Lesson6;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        String res = String.format(
            "id:%d fn:%s ln:%s s:%d", id, firstName, lastName, salary);
        return res;
    }
    
    @Override
    public boolean equals(Object o) {
        Worker t = (Worker) o;
        return id == t.id && firstName == t.firstName;
    }

    @Override
    public int hashCode() {
        return id;
    }
}