enum class RGB {
    RED, BLUE, WHITE, GREEN;

    inline fun <reified T : Enum<T>> printAllValues() {
        print(enumValues<T>().joinToString { it.name })
    }

}
