import java.io.File
import java.io.FileReader

fun main() {
    val file = File("OneDrive/Documents/test.txt")

    FileReader(file).use {
        val chars = CharArray(file.length().toInt())
        it.read(chars)
        val fileContent = String(chars)
        println(fileContent)//Hello!
    }
}
