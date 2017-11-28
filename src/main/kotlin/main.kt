package todolist
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import spark.Spark.get
import spark.Spark.post
import spark.Spark.patch
import spark.Spark.delete

fun main(args: Array<String>) {
    val objctMapper = ObjectMapper().registerKotlinModule()
    val jsonTransformer = JsonTransformer(objctMapper)
    val taskRepository = TaskRepository()
    val taskController = TaskController(objctMapper, taskRepository)

    get("/tasks", taskController.index(), jsonTransformer)
    post("/tasks", taskController.create(), jsonTransformer)
    get("/:id", taskController.show(), jsonTransformer)
    delete("/:id", taskController.destroy(), jsonTransformer)
    patch("/:id", taskController.update(), jsonTransformer)
}
