fun fil(str:List<String>):List<String>{
   val duplicates = str.groupBy { it }
        .filter { it.value.size > 1 }
        .map { it.key }
    return(duplicates)
}
fun fill(str:List<String>):List<String> {
    var notDuplicates = str.filter { element -> str.count { it == element } == 1 }
    return notDuplicates
}
fun main() {
    var str = listOf("Wow", "Wow", "GG", "W", "W")
    println(fil(str))
    println(fill(str))
  
}
