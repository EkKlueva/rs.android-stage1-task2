package subtask2

class TimeConverter {

    fun toTextFormat(hour: String, minute: String): String {
        var result = ""
        if (hour < "0" || (hour.length >= 2 && hour > "23") || minute > "59" || minute < "00") {
            return result
        }
        val numbersAsString = mapOf("01" to "one", "02" to "two", "03" to "three", "04" to "four", "05" to "five",
            "06" to "six", "07" to "seven", "08" to "eight", "09" to "nine",
            "1" to "one", "2" to "two", "3" to "three", "4" to "four", "5" to "five",
            "6" to "six", "7" to "seven", "8" to "eight", "9" to "nine",
            "10" to "ten", "11" to "eleven", "12" to "twelve",
            "13" to "thirteen", "14" to "fourteen", "15" to "quarter", "16" to "sixteen", "17" to "seventeen",
            "18" to "eighteen", "19" to "nineteen", "20" to "twenty", "21" to "twenty one", "22" to "twenty two",
            "23" to "twenty three", "24" to "twenty four", "25" to "twenty five", "26" to "twenty six",
            "27" to "twenty seven", "28" to "twenty eight", "29" to "twenty nine")
        result = when {
            minute == "30" -> {
                "half past ${numbersAsString[hour]}"
            }
            minute == "00" -> {
                "${numbersAsString[hour]} o' clock"
            }
            minute == "15" -> {
                "quarter past ${numbersAsString[hour]}"
            }
            minute == "45" -> {
                "quarter to ${numbersAsString[(hour.toInt() + 1).toString()]}"
            }
            minute < "30" -> {
                "${numbersAsString[minute]} minutes past ${numbersAsString[hour]}"
            }
            else -> {
                "${numbersAsString[(60 - minute.toInt()).toString()]} minutes to ${numbersAsString[(hour.toInt() + 1).toString()]}"
            }
        }
        return result
    }
}
