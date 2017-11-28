package todolist

import com.fasterxml.jackson.annotation.JsonProperty

data class TaskUpdateRequest(
        @JsonProperty("content") val content: String?,
        @JsonProperty("done") val done: Boolean?
)