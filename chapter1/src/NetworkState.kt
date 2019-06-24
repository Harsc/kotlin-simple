enum class NetworkState {
    ONELE {
        override fun single() = UNLINE
    },
    UNLINE {
        override fun single() = ONELE

    };

    abstract fun single(): NetworkState
}