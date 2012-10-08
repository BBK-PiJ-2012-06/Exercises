class Point {
    double x;
    double y;
}

println "Distance point-to-point: this program reads the X and Y coordinates of three points, and then outputs which of the three are closest to one another."

Point p1 = new Point()
print "Point 1, X = "
p1.x = Double.parseDouble(System.console().readLine())
print "Point 1, Y = "
p1.y = Double.parseDouble(System.console().readLine())

Point p2 = new Point()
print "\nPoint 2, X = "
p2.x = Double.parseDouble(System.console().readLine())
print "Point 2, Y = "
p2.y = Double.parseDouble(System.console().readLine())

Point p3 = new Point()
print "\nPoint 3, X = "
p3.x = Double.parseDouble(System.console().readLine())
print "Point 3, Y = "
p3.y = Double.parseDouble(System.console().readLine())

// Now to calculate the distances between each pair of points...
double d12, d13, d23
d12 = Math.sqrt( Math.pow(p1.x-p2.x,2) + Math.pow(p1.y-p2.y,2) )
d13 = Math.sqrt( Math.pow(p1.x-p3.x,2) + Math.pow(p1.y-p3.y,2) )
d23 = Math.sqrt( Math.pow(p2.x-p3.x,2) + Math.pow(p2.y-p3.y,2) )

def distances = [d12, d13, d23]
if(d12==d13==d23){
    println "The three points are all equally spaced, with a separation of" + d12
    return 0
}
switch( distances.min() ){
    case d12: 
        println "The closest pair of points are Point 1 and Point 2, at a distance of " + d12
        break
    case d13:
        println "The closest pair of points are Point 1 and Point 3, at a distance of " + d13
        break
    case d23: 
        println "The closest pair of points are Point 2 and Point 3, at a distance of " + d23
        break
}