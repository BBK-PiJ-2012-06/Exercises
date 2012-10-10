println "Letter counter: I'll tell you how many letters 'e' are the text you type..."
println "...here:"
print "  >"

String str = System.console().readLine()
int length = str.length()
int eCounter = 0

for( i in 0..length-1){
    if( str.charAt(i) == "e" || str.charAt(i) == "E" ){
        eCounter++
    }
}

println "\nThere are " + eCounter + " letters 'e' in " + "\"" + str + "\""