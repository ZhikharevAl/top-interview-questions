@Suppress("MagicNumber")
fun twoSum(
    nums: IntArray,
    target: Int,
): IntArray {
    val numToIndex = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        val complement = target - nums[i]
        if (numToIndex.containsKey(complement)) {
            return intArrayOf(numToIndex[complement]!!, i)
        }
        numToIndex[nums[i]] = i
    }
    throw IllegalArgumentException("No two sum solution")
}

fun main() {
    val nums = readln().split(" ").map { it.toInt() }.toIntArray()
    val target = readln().toInt()

    val result = twoSum(nums, target)
    println("Indices: ${result.joinToString()}")
}
