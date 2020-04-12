package subtask5

import java.lang.IllegalArgumentException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        var blockC: Any
        blockC = when (blockB) {
            String::class -> ""
            Int::class -> 0
            LocalDate::class -> LocalDate.MIN
            else -> throw IllegalArgumentException()
        }
        for (i in blockA) {
            if (i is String && blockC is String) {
                blockC += i
            } else if (i is Int && blockC is Int) {
                blockC += i
            } else if (i is LocalDate && blockC is LocalDate) {
                if (i > blockC && i <= LocalDate.now() || i < blockC && i > LocalDate.now()) {
                    blockC = i
                }
            }
        }
        if (blockC is LocalDate) {
            val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
            blockC = blockC.format(formatter)
        }
        return blockC
    }
}
