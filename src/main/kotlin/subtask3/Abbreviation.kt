package subtask3

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        var positionB = 0
        for (element in a) {
            if (positionB < b.length && element.equals(b[positionB], true)) {
                positionB++
            }
        }
        return if (positionB + 1 <= b.length) {
            "NO"
        } else {
            "YES"
        }
    }
}
