package lc.general

import utility.GenerateExample

class EvaluateRPN_150 : GenerateExample {

    fun evalRPN(tokens: Array<String>): Int {
        val stack = ArrayDeque<Int>()
        val operMap = mapOf<String, (Int, Int) -> Int>(
            "+" to { left, right -> left.plus(right) },
            "-" to { left, right -> left.minus(right) },
            "*" to { left, right -> left.times(right) },
            "/" to { left, right -> left.div(right) },
        )
        tokens.forEach { t ->
            if (!operMap.containsKey(t)) {
                stack.addFirst(t.toInt())
            } else {
                val operand2 = stack.removeFirst()
                val operand1 = stack.removeFirst()
                operMap[t]?.let {
                    stack.addFirst(it(operand1, operand2))
                }
            }
        }
        return stack.first()
    }

    override fun example() {
        val tokens = arrayOf("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+")
        val result = evalRPN(tokens)
        System.out.printf("Result: %d%n", result)
    }

}