package subtask5

import java.lang.IllegalArgumentException
import java.time.LocalDate
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        var blockC: Any? = null
        blockC = when (blockB) {
            String::class -> {
                blockC as String?; ""
            }
            Int::class -> {
                blockC as Int?; 0
            }
            LocalDate::class -> {
                blockC as LocalDate?; LocalDate.now()
            }
            else -> throw IllegalArgumentException()
        }
        for (i in blockA) {
            if (i is String && blockC is String) {
                blockC += i
            } else if (i is Int && blockC is Int) {
                blockC += i
            } else if (i is LocalDate && blockC is LocalDate) {
                blockC
            }
        }
        return blockC
    }
}
