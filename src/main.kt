fun main() {
    Intro("Nyawera")
    modulus(5, 2)
    addition( 2,3,4,5,)
    interestingfact()


}

fun Intro(name:String){
    println("Hello "+" "+ name)


}
fun modulus(a:Int, b:Int){
    var modulus = a % b
    println(modulus)

}
fun addition(a:Int , b:Int ,c:Int ,d:Int){
    var addition = (a+b+c+d)
    println(addition)
}
fun interestingfact(){
    var fact= "I love coding"
    println(fact)
}