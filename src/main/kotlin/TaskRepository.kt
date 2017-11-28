package todolist

class TaskRepository {
    private val tasks: MutableList<Task> = mutableListOf()

    private val maxId: Long
    get() = tasks.map(Task::id).max() ?: 0

    fun findById(id: Long): Task? = tasks.find {it.id == id}

    fun findAll(): List<Task> = tasks.toList()

    fun create(content: String): Task {
        val id = maxId + 1
        val task = Task(id, content, false)
        tasks += task
        return task
    }

    fun delete(task: Task) {
        tasks.removeIf { (id) -> id == task.id }
    }

    fun update(task: Task) {
        tasks.replaceAll { t ->
            if (t.id == task.id) task
            else t
        }
    }
}