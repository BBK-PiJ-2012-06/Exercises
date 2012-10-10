println "Line to column 2.0: enter some text and I'll print each WORD on a separate line!" 
println "I'm even more useful!"
println "Enter some text:"
print ">"
String str = System.console().readLine()
int length = str.length()
int i = 0

while( i<length ){
    if( str.charAt(i)==" "){
        print "\n"
        i++
    }
    else{
        print str.charAt(i++)
    }
} 
