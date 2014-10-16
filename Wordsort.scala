def haso(word: String) = word.contains("o")

def hasu(word: String) = word.contains("u")

val listofwords = List("mute","mule","huge","flute","note","froze","stone","home")

val us = listofwords.filter(hasu)

val os =listofwords.filter(haso)

println("All the words:")
println(listofwords.mkString(","))
println
println("U words:")
println(us.mkString(","))
println
println("o words:")
println(os.mkString(","))