class MathOperations {
    companion object {
        fun add(a: Int, b: Int): Int {
            return a + b
        }

        fun subtract(a: Int, b: Int): Int {
            return a - b
        }

        fun multiply(a: Int, b: Int): Int {
            return a * b
        }

        fun divide(a: Int, b: Int): Double {
            if (b == 0) {
                throw IllegalArgumentException("Cannot divide by zero")
            }
            return a.toDouble() / b
        }
    }
} 