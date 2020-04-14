package subtask1

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.ResolverStyle
import java.util.Locale


class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        val dateInString = "${day},${month},${year}"
        return try {
            val formatter = DateTimeFormatter.ofPattern("d,M,uuuu").withResolverStyle(ResolverStyle.STRICT)
            val localDate = LocalDate.parse(dateInString, formatter)
            localDate.format(DateTimeFormatter.ofPattern("d MMMM, EEEE").withLocale(Locale("ru")))
        } catch (e: DateTimeException) {
            "Такого дня не существует"
        }
    }
}
