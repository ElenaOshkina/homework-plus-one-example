class Solution {
    fun plusOne(digits: IntArray): IntArray {
        val index = digits.size - 1
        digits[index]++
        return digits
    }
}