import lc.general.EvaluateRPN_150
import utility.GenerateExample

fun main(args: Array<String>) {
    val creator = "Thanaphoom Babparn"
    System.out.printf("Creator: %s%n", creator)
    tryQuestion(EvaluateRPN_150())
}

fun tryQuestion(genExample: GenerateExample) {
    genExample.example()
}