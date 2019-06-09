fun main() {
    println("Enter the bases.")
    var bases = readLine()!!
    bases.replace('A','1')
    bases.replace('T','2')
    bases.replace('C','3')
    bases.replace('G','4')
    bases.replace('1','U')
    bases.replace('2','A')
    bases.replace('3','G')
    bases.replace('4','C')
    println(bases)
}