/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

class Contact(val id: Int, var email: String)
class Contact1(val id: Int, var email: String) {
    fun printId() {
        print(id);
    }
}
// Data classes
data class User(val name: String, val id: Int)


fun main() {
    // varible: val (read only), var

    // int, dobule, float, ...

    // ============================ Collections: listOf, mutableListOf, setOf, mutableSatOf, mapOf, mutableMapOf
    val e = listOf(
    1, 2, 3)
    val b = setOf("ab", "ac", "ad");
    val c: MutableSet<String> = mutableSetOf("AD", "AC");
//     read only
    val d = mapOf("ad" to 10, "c" to 30);
    val e1: MutableMap<String, Int> = mutableMapOf("Ad" to 10, "am" to 100);
    e1["EC"] = 120;
//     To check that a key or value is in a map, use the in operator:
//     print("EC" in e1.keys);
//     print(e1);

    // Control flow: if, when
    val l1: Int;
    val check = true;
    
    if (check)
    {
        l1 = 1; 
    } else {
        l1 = 2;
    }
// 	print(l1);
// or
	val l2 = 1;
    var l3 = 2;
	println(if (l2 > l3) "l2 if big" else "l2 is small");
    
//     when
    	val obj = "Hello";
    when (obj) {
        "1" -> println("One");
        "Hello" -> println("Greeting");
    }
//     OR
	val result = when (obj) {
        "1" -> "One";
        "Hello" -> "Tue"
        else -> "Unknow"
    }
//    println(result)
//    ========================= LOOP: for and while =============================
//     for
    for (number in 1..5) {
//         println(number)
    }

//     collection loop
    val col1 = listOf("OK", "OD", "OK");
    for(oo in col1)
    {
//         print("$oo ")
    }

//     while:
    var cake = 0;
    while (cake < 3){
//         print(cake);
        cake++;
    }
//    ========================= FUNCTION: fun
// 	fun
fun hello() {
    return println("Hello");
}
    hello();
//      lambda expression:
    val upperCaseString = {text: String -> text.uppercase()};
    println(upperCaseString("hello"));
// 	or
    println({ text: String -> text.uppercase() }("hello"))
// println(listOf(1, 2, 3).fold(0, { x, item -> x + item }))

//    ========================= CLASSES
    val contact = Contact(1, "a@gmail.com")
    contact.email = "b"
//     print(contact.email)
    val contact1 = Contact1(1, "a@gmail.com");
//     contact1.printId()
//     class data methods: toString, equals, copy
    val user1 = User("Alex", 1);
//     print(user1)
//     copy()
// 	print(user1.copy(id = 3))
//    ========================= Null safety
    var nullable: String? = "Null here";
    nullable = null
    //     print(nullable)
//     Check for null values
    fun describeString(maybeString: String?): String {
        if (maybeString != null && maybeString.length > 0) {
            return "String of length ${maybeString.length}"
        } else {
            return "Empty or null string"
        }
    }
}