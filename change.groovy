println "Change calculator: takes the total cost of a purchase and the amount paid..."
println "Total cost:"
print ">"
double cost = Double.parseDouble(System.console().readLine())

println "\nAmount paid:"
print ">"
double paid = Double.parseDouble(System.console().readLine())
print"\n"

double change = paid - cost

println "Change needed is " + change + ", given in:"

int notes50=0, notes20=0, notes10=0, notes5=0, pounds2=0, pounds1=0  
int pence50=0, pence20=0, pence10=0, pence5=0, pence2=0, pence1=0

if(change/50 >= 1){
    while(change/50 >=1){
        notes50++
        change -= 50
    }
    println "  " + notes50 + " fifty pound notes" 
}

if(change/20 >= 1){
    while(change/20 >=1){
        notes20++
        change -= 20
    }
    println "  " + notes20 + " twenty pound notes" 
}

if(change/10 >= 1){
    while(change/10 >=1){
        notes10++
        change -= 10
    }
    println "  " + notes10 + " ten pound notes" 
}

if(change/5 >= 1){
    while(change/5 >=1){
        notes5++
        change -= 5
    }
    println "  " + notes5 + " five pound notes" 
}

if(change/2 >= 1){
    while(change/2 >=1){
        pounds2++
        change -= 2
    }
    println "  " + pounds2 + " two pound coins" 
}

if(change >= 1){
    while(change >=1){
        pounds1++
        change -= 1
    }
    println "  " + pounds1 + " one pound coins" 
}

if(change/0.50 >= 1){
    while(change/0.50 >=1){
        pence50++
        change -= 0.50
    }
    println "  " + pence50 + " fifty pence pieces" 
}

if(change/0.20 >= 1){
    while(change/0.20 >=1){
        pence20++
        change -= 0.20
    }
    println "  " + pence20 + " twenty pence pieces" 
}

if(change/0.10 >= 1){
    while(change/0.10 >=1){
        pence10++
        change -= 0.10
    }
    println "  " + pence10 + " ten pence pieces" 
}

if(change/0.05 >= 1){
    while(change/0.05 >=1){
        pence5++
        change -= 0.05
    }
    println "  " + pence5 + " five pence pieces" 
}

if(change/0.02 >= 1){
    while(change/0.02 >=1){
        pence2++
        change -= 0.02
    }
    println "  " + pence2 + " two pence pieces" 
}

if(change/0.01 >= 1){
    while(change/0.01 >=1){
        pence1++
        change -= 0.01
    }
    println "  " + pence1 + " one pence pieces" 
}