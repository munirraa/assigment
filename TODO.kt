package com.example.myproject1

fun main() {
    val todo =Todo()
    val task1 = Task(1,"nora","Buy a Car",true) //object of class
    val task2 = Task(2,"sara","Travel to Newyork",false) //object of class
    val task3 = Task(3,"wafa","Sell my Cat",false)//object of class
    todo.addtask(task1)
    todo.addtask(task2)
    todo.addtask(task3)
    todo.detailtask(task2)
    todo.remtask(task2)
    todo.changetask(task3)
    println("All TasKs")
    for (task in todo.tasks){

        println("TasK: ${task.Task}")

    }


}

data class Task( val ID: Int ,var Name: String ,var Task: String, var Completed: Boolean)
class Todo{

    val tasks = arrayListOf<Task>()


    fun addtask(task: Task){
        println("add TasK: ${task.Task}")
        tasks.add(task)
    }
fun detailtask(task: Task){
    println("TasK Details:ID ${task.ID}, Name ${task.Name} , Task ${task.Task} , Completed ${task.Completed} ")
}

    fun remtask(task: Task){
        for (x in tasks){
            if(x.ID == task.ID){
                tasks.remove(task)
                println("Remove TasK: ${x.Task}")
            }
        }


    }
    fun changetask(task: Task){
        for (x in tasks){
            if(x.ID == task.ID){
                x.Completed = !x.Completed
                println("TasK: ${x.Task},Complete : ${x.Completed}")
            }
        }

    }
}




