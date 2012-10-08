println "Palindrome creator: enter some text..."
String s = System.console().readLine()
int l = s.length()

print s
for( i in l-1..0){
    print s.charAt(i)
}