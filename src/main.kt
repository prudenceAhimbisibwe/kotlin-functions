fun main(){
    var x = add(3,9)
    println(x)
   var y = name("Ahimbisibwe")
    println(y)
}
fun name(firstname:String):String{
    var myName = ("my name is $firstname")
    return myName


}
fun add(a:Int,b:Int):Int{
    var sum = a+b
    return sum

}