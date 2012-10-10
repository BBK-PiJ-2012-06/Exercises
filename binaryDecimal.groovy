int binary2decimal(String binary){
    int decimal
    int powerOfTwo = binary.length() - 1
    for(int i=0; i<binary.length(); i++){
        decimal += Integer.parseInt(binary.substring(i,i+1)) * Math.pow(2, powerOfTwo)
        powerOfTwo--
    }
    return decimal
}

String decimal2binary(int decimal){
    String binary = ""
    // Find highest power of two that divides decimal
    int powerOfTwo = 0
    while(decimal >= Math.pow(2,powerOfTwo+1)){
        powerOfTwo++
    }
    // Now convert decimal to binary, starting with the highest power of two just found
    for(powerOfTwo; powerOfTwo>=0; powerOfTwo--){
        if(decimal >= Math.pow(2,powerOfTwo) ){
            binary += "1"
            decimal -= Math.pow(2, powerOfTwo)
        }
        else{
            binary += "0"   
        }
    }
    return binary
}

boolean running = true
while(running){
    println "What would you like to do?"
    println "1 - Convert binary to decimal"
    println "2 - Convert decimal to binary"
    println "0 - Exit"
    print ">"
    int option = Integer.parseInt(System.console().readLine())
    switch(option){
        case 0: running = false
                break
        case 1: println "Please enter a binary number:"
                print ">"
                String binary = System.console().readLine()
                int decimal = binary2decimal(binary)
                println "The binary number " + binary + " in decimal is " + decimal + "\n"
                break
        case 2: println  "Please enter a decimal number:"
                print ">"
                int decimal = Integer.parseInt(System.console().readLine())
                String binary = decimal2binary(decimal)
                println "The decimal number " + decimal + " in binary is " + binary + "\n"
                break
       default: println "Invalid option, please try again."
    }
}