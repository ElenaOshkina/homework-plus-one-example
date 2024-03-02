class Solution {

    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.lastIndex downTo 0) {
            if (digits[i] < 9) {
                digits[i]++
                return digits
            } else {
                digits[i] = 0
            }
        }
        val intArray = IntArray(digits.size + 1)
        intArray[0] = 1
        return intArray
    }
}