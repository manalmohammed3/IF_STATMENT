fun main() {
    var studentName = "MANAL"

    var studentGrade = 75

    var isPass = if (studentGrade >= 80 && studentGrade < 75)
    {
        print("very good")
        true
    } else if (studentGrade >= 40) {
        println("ok")
        true
    } else {
        print("failed")
        false
    }
    println("isPassValue "+ isPass)

    var classStatus=  if (isPass) "move to next class" else "repeat ur semster"


    var isPass2 = if (studentGrade in 75 downTo 60)
    {
        print("very good")
        true
    } else if (studentGrade >= 40) {
        println("is up to 50")
        true
    } else {
        print("DID NOT PASS")
        false
    }

}