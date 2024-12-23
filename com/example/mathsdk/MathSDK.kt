class MathSDK private constructor(private val context: Context) {
    
    companion object {
        @Volatile
        private var instance: MathSDK? = null

        fun initialize(context: Context): MathSDK {
            return instance ?: synchronized(this) {
                instance ?: MathSDK(context.applicationContext).also { instance = it }
            }
        }

        fun getInstance(): MathSDK {
            return instance ?: throw IllegalStateException("MathSDK must be initialized first")
        }
    }

    // Version info
    fun getSDKVersion(): String {
        return BuildConfig.VERSION_NAME
    }

    // Wrapper methods for math operations
    fun performAdd(a: Int, b: Int): Int {
        return MathOperations.add(a, b)
    }

    fun performSubtract(a: Int, b: Int): Int {
        return MathOperations.subtract(a, b)
    }

    fun performMultiply(a: Int, b: Int): Int {
        return MathOperations.multiply(a, b)
    }

    fun performDivide(a: Int, b: Int): Double {
        return MathOperations.divide(a, b)
    }
} 