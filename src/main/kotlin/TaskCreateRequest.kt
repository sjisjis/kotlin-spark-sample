package todolist

import com.fasterxml.jackson.annotation.JsonProperty

data class TaskCreateRequest(
        @JsonProperty("content", required = true) val content: String
)