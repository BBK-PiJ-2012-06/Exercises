int binary2decimal(String binary){
    int decimal
    int powerOfTwo = binary.length() - 1
    for(int i=0; i<binary.length(); i++){
        decimal += binary.charAt(i) * Math.pow(2, powerOfTwo)
        powerOfTwo--
    }
    return decimal
}

String decimal2binary(int decimal){
    String binary
    // Find highest power of two that divides decimal
    int powerOfTwo = 0
    boolean finding = true
    while(decimal >= Math.pow(2,powerOfTwo+1)){
        powerOfTwo++
    }
    // Now convert decimal to binary, starting with the highest power of two just found
    while(decimal){
        if(decimal / Math.pow(2,powerOfTwo) > 0){
            binary.add('1')
            decimal -= Math.pow(2, powerOfTwo)
        }else{
            binary.add('0')   
        }
        powerOfTwo--
    }
    return binary
}

