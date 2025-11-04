package oop_learn.tasks;

class TodoMain {
    public static void main(String[] args) {
        Todo[] todos = new Todo[3];
        // todo1
        todos[0] = new Todo();
        todos[0].name = "Learn java";
        todos[0].day = 5;
        todos[0].isComplete = false;
        todos[0].isDeleted = false;
        // todo2
        todos[1] = new Todo();
        todos[1].name = "doing something";
        todos[1].day = 5;
        todos[1].isComplete = false;
        todos[1].isDeleted = false;
        // todo3
        todos[2] = new Todo();
        todos[2].name = "doing module1.tasks complete projects";
        todos[2].day = 5;
        todos[2].isComplete = false;
        todos[2].isDeleted = false;
//        todos[0].done();
        todos[1].deleted();
        for (Todo todo : todos) {
            if (!todo.isDeleted && !todo.isComplete) {
                todo.print();
            }
        }
    }
}

/**
 * Todo Classi yaratilsin
 * Nomi, tugash muddatini anglatuvchi day(kun), bajarilgani yoki yo'qligini bildiradigan isComplete(bajarilganmi),
 * todo ni o'chirilgan yoki yo'qligini bildiruchi isDeleted(o'chirilganmi) nomli fieldlari bo'lsin.
 * done(bajarildi), deleted(o'chirildi) va malumotlarni "Nomi day isCompleted" ko'rinishida print nomli methodlari bo' lsin.
 * objectlar massivda saqlansin va ochilmaganlarini consolega chizing.
 ***/
public class Todo {
    public String name;
    public int day;
    public boolean isComplete;
    public boolean isDeleted;

    public void done() {
        if (!isDeleted) {
            isComplete = true;
        }
    }

    public void deleted() {
        isDeleted = true;
    }

    public void print() {
        System.out.printf("Title: %s | Day:%d | isCompleted:%b \n", name, day, isComplete);
    }
}
