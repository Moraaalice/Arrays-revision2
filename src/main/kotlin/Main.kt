fun main(){
    var x = games("Football","Volleyball","Tenis")
    names("Alice","Joyce",15)
    numbers(13,15,17,1,19,10)
}
fun games(game1:String,game2:String,game3:String){
    var game = arrayOf(game1,game2,game3)
    println(game.contentToString())
    //indexing
    println(game[0])
    println(game[1])
    println(game[2])
}
fun names(name1:String,name2:String,x:Int){
    var name = arrayOf(name1,name2,x)
    println(name.contentToString())
    println(name.get(1))
    //getting index of an element
    var index = name.indexOf("Alice")
    println(index)
    //Adding a new element in an array
    var naming = name.plus("Moraa")
    print(naming[3])
}
fun numbers(x:Int,y:Int,z:Int,a:Int,b:Int,c:Int){
    var numb = arrayOf(x,y,z,a,b,c)
    println(numb.contentToString())
    //getting the sum of arrays
    println(numb.sum())
    //counting the number of elements
    println(numb.count())
    //counting the minimum element
    println(numb.minOrNull())
    //getting the maximum element
    println(numb.maxOrNull())

}