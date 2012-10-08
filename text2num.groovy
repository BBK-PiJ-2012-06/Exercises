println "Text2number: parses a number with commas and decimal dots and then prints half that number."
println "Enter your number:"

String str = System.console().readLine()
int len = str.length() 
boolean leftOfDecimal = true
int placesRightOfDecimal = 1

//char c = str.charAt(0)
//String temp = new String(c)
//String temp2 = "" + c
//String temp3 = str.substring(0,1);
//println  Integer.parseInt()

double num = Integer.parseInt(str.substring(0,1))
for( int i=1; i<len ; i++ ){
    String currentChar = str.substring(i, i+1)
    if( currentChar == ',' ){ continue }
    if( currentChar == '.' ){ leftOfDecimal = false; continue }
    
    if( leftOfDecimal ){
        num = num*10 + Integer.parseInt(currentChar)
    } else {
        num += Integer.parseInt(currentChar)*Math.pow(0.1,placesRightOfDecimal)
        placesRightOfDecimal++
    }
}

double result = num/2
println "Half of " + num + " is " + result