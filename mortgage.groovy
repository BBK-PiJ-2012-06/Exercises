double totalToPay(double c, double r, int y){
    double t = c
    for(i=1; i<=y; i++){
        t = t * (1 + (r/100))
    }
    return t
}

double yearlyPayment(double c, double r, int y){
    return totalToPay(c, r, y) / y
}

int yearsUntilInterestPaid(double c, double r, int y){
    double t = totalToPay(c,r,y)
    double numberOfYears = y * (1 - (c/t))
    return Math.ceil(numberOfYears)
}


println "Mortgage Calculator"
println "Please enter the total amount borrowed:"
print ">"
double cost = Double.parseDouble(System.console().readLine())

println "the number of years to pay this amount back:"
print ">"
int years = Integer.parseInt(System.console().readLine())

println "and the interest rate:"
print ">"
double rate = Double.parseDouble(System.console().readLine())

println "\nThe total amount to be paid = " + totalToPay(cost, rate, years)
println "The yearly payment = " + yearlyPayment(cost, rate, years)
println "The number of years until the interest is paid = " + yearsUntilInterestPaid(cost, rate, years)
