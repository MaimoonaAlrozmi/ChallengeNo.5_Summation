fun main(){

    emp(1,"Ahmed")
}

class emp{

    constructor(id:Int, name:String  ): this(id,name,"male"){
        println("Emp id = $id Emp Name: $name")
    }

    constructor(id:Int, name:String ,gender:String ){
        println("Emp id= $id Emp Name: $name Gender: $gender")
    }
}

