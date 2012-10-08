println "Palindrome detector: enter some text, I'll see if it is a palindrome:"
String str = System.console().readLine()
int l = str.length()
boolean isP = true

int i = 0
while( i<l/2){
    if( str.charAt(i) != str.charAt(l - 1 - i)){
        isP = false
    }
    i++    
}

switch(isP){
    case true:
            println "\"" + str + "\" is a palindrome!" 
            break
    case false:
            println "\"" + str + "\" is not a palindrome!" 
            break
}