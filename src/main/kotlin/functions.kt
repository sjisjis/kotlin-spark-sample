package todolist

import com.fasterxml.jackson.databind.ObjectMapper

inline fun <reified T: Any> ObjectMapper.readValue(src: ByteArray): T? =
        try {
            readValue(src, T::class.java)
        } catch(e: Exception) {
            null
        }