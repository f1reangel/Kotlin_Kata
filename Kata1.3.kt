fun smallEnough(a : IntArray, limit : Int) : Boolean {
  return a.all { it > limit }
}

//Also takes a higher-order function as param to predicate the condition and return 
//Boolean as true if all of the items in List, Set or Map confirms that condition, else return false.

//Приймає функцію вищого порядку як параметр для визначення умови та повертає як істину , 
//Booleanякщо всі елементи в або підтверджує цю умову, інакше повертає false .
