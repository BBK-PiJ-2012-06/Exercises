println "Line to column: enter some text and I'll print each letter on a separate line! I'm useful!"
println "Enter some text:"
print ">"
String str = System.console().readLine()
int length = str.length()
int i = 0

while( i<length ){
    println str.charAt(i++)
} 
