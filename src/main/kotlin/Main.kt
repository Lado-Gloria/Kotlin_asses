fun main() {
multiple(99)
    var gen =CurrentAccount(2647488,"gloria",39.848)
    gen.deposit(24.9)
    gen.withdraw(34.73)
    gen.detail()

}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun randomStr(name:String):Char{
 if(name.length =)

}

//2Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)
 fun password(pass: Int):Float {
     if(pass==8){

         println(true)
     }
    else if(pass<=16){
        println(false)
     }

return Float
}


//3Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)

fun multiple(number:Int){
    var num =1..100
    for (x in num){
        if(x%6==0 ||x%8==0){
            println("Bingo")
        }



    }
}

//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)

 open class CurrentAccount(var accountnumber:Int,var accountname: String, var balance:Double){
    fun deposit(amount:Double){
        var balan = balance+amount
        println(balan)
    }

    fun withdraw(amount:Double){
        var balanc = balance-amount
        println(balanc)

    }

    fun detail(){
        println("Account number ${accountnumber} with balance ${balance} is operated by ${accountname}")
    }
}

//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)

class SavingsAccount():CurrentAccount(){
    fun saving(widra:Int){

    }
}