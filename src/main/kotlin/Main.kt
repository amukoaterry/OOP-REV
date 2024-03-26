fun main(){
    var human = Human("Amukoa",21,56.56)
    println(human.weight)
    human.eat(2)
    println(human.speak("hello Mitchell"))
    println(human.age)
    human.birthday()
    println(human.age)
    val user =User("Terry","Mitchell","@amukoaterry","0722674423","down")
    println(user.firstName)
    println(user.lastName)
    println(user.email)
    println(user.password)
}

class Human(var name:String,var age:Int,var weight:Double){
    fun eat(foodWeight:Int){
        weight += foodWeight
        println("I am eating $foodWeight kgs of food")
        println(weight)
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age+=1
    }
}
data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String){
}



