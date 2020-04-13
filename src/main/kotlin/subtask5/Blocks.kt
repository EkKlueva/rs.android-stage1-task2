package subtask5

import java.lang.IllegalArgumentException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        when (blockB) {
            String::class -> {
                var blockC = ""
                for (element in blockA) {
                    if (element is String) {
                        blockC += element
                    }
                }
                return blockC
            }
            Int::class -> {
                var blockC = 0
                for (element in blockA) {
                    if (element is Int) {
                        blockC += element
                    }
                }
                return blockC
            }
            LocalDate::class -> {
                var blockC = LocalDate.MIN
                for (element in blockA) {
                    if (element is LocalDate && (element > blockC && element <= LocalDate.now()
                                || element < blockC && element > LocalDate.now())) {
                        blockC = element
                    }
                }
                val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
                return blockC.format(formatter)
            }
        }
        return IllegalArgumentException()
    }
}
