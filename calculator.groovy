println "This program performs an operation of your choice on two numbers."
println "  Please enter your first number:"
print ">"
double num1 = Double.parseDouble(System.console().readLine())

println "\n  And your second:"
print ">"
double num2 = Double.parseDouble(System.console().readLine())

println "\n  And which operation would you like me to perform (+, -, *, /)?"
print ">"
char choice = System.console().readLine()
println ""

double result
switch(choice){
    case "+":
        result = num1+num2
        println num1 + " " + choice + " " + num2 + " = " + result 
        break
    
    case "-":
        result = num1-num2
        println num1 + " " + choice + " " + num2 + " = " + result 
        break
        
    case "*":
        result = num1*num2
        println num1 + " " + choice + " " + num2 + " = " + result 
        break
        
    case "/":
        if( num2==0 ){
            println "Cannot divide by zero!"
            break
        }
        result = num1/num2
        println num1 + " " + choice + " " + num2 + " = " + result 
        break        
}