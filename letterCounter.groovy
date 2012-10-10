println "Letter counter: I'll tell you how many of a letter of your choice occur in the text you type..."
println "...here:"

String str = System.console().readLine()
int length = str.length()

println "Which letter would you like me to count? (Enter lower case and I'll count both)"
char c = System.console().readLine()
int counter = 0

for( i in 0..length-1){
    if( str.charAt(i) == c || str.charAt(i) == c-32 ){
        counter++
    }
}

println "\nThere are " + counter + " letters " + c + " in " + "\"" + str + "\""