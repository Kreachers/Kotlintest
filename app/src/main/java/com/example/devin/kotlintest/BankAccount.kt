package com.example.devin.kotlintest

/**
* Kotlintest
* Created by devin on 12/28/17.
*/

class BankAccount {

    private var accountNumber: Int = 0
    private var accountBalance: Double = 0.0
    private var accountName: String = ""
    private var feeTotal: Double = 0.0

    constructor()

    constructor(number: Int){
        accountNumber = number
    }

    constructor(number: Int, balance: Double){
        accountNumber = number
        accountBalance = balance
    }

    constructor(number: Int, balance: Double, name: String){
        accountNumber = number
        accountBalance = balance
        accountName = name
    }

    fun addfee(fee: Double){
        feeTotal += fee
    }

    fun payfee(fee: Double){
        feeTotal -= fee
    }

    fun deposit(money: Double){
        accountBalance += money
    }

    fun withdraw(money: Double){
        accountBalance -= money
    }

    override fun toString(): String {
        return "$accountName is registered to Account number $accountNumber and has $$accountBalance and $feeTotal fees due"
    }

}