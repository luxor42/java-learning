import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        // Put code here
        int countPoints = 0;
        for (Point currPt : s.getPoints()) {
            countPoints = countPoints + 1;
        }
        //System.out.println("total points = " + countPoints);
        return countPoints;
    }

    public double getAverageLength(Shape s) {
        // Put code here
        return getPerimeter(s) / getNumPoints(s);
        //return 0.0;
    }

    public double getLargestSide(Shape s) {
        // Put code here
        
        // initialize longest side to 0.0 because all sides will be longer than that
        double longestSideLength = 0.0;
        
        // Initialize prevPt to the last shape in the file
        Point prevPt = s.getLastPoint();
        
        // Loop through all of the points
        for (Point currPt : s.getPoints()) {
             // Find the distance between prev pt and curr pt
             double currDist = prevPt.distance(currPt);
             
             // Set the longest side to be the length of current distance
             // if the current distance is longer than the existing longest side
             if(currDist > longestSideLength) {
                 longestSideLength = currDist;
             }
             
             // update previous point to be the current point
             prevPt = currPt;
        }
        return longestSideLength;
        // return 0.0;
    }

    public double getLargestX(Shape s) {
        boolean first = true;
        int largest_x = 0;
        int this_x = 0;
        
        // Put code here
        for(Point currPt: s.getPoints()) {
            this_x = currPt.getX();
            System.out.println(this_x);
            if(first == true) {
                System.out.println("found first instance");
                largest_x = this_x;
                first = false;
            }
            else if(this_x > largest_x) {
                largest_x = this_x;
                System.out.println("new largest x is " + largest_x);
            }
            else {
                // take no action; largest x doesn't change
            }
        }

        // returning an int even though the function is a double
        return largest_x;
        //return 0.0;
    }

    public double getLargestPerimeterMultipleFiles() {
        DirectoryResource dr = new DirectoryResource();
        boolean first = true;       
        double max_length = 0.0;
        
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);

            Shape s = new Shape(fr);
            double length = getPerimeter(s);
            if(first == true) {
                max_length = length;
                first = false;
            }
            else if(length > max_length) {
                max_length = length;
                
            }
            else {
                // take no action; largest x doesn't change
            }
        }
        return max_length;
        //return 0.0;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        File file_with_largest_perimeter = null;    // replace this code

        DirectoryResource dr = new DirectoryResource();
        boolean first = true;       
        double max_length = 0.0;
        
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);

            Shape s = new Shape(fr);
            double length = getPerimeter(s);
            if(first == true) {
                file_with_largest_perimeter = f;
                max_length = length;
                first = false;
            }
            else if(length > max_length) {
                max_length = length;
                file_with_largest_perimeter = f;
                
            }
            else {
                // take no action; largest x doesn't change
            }
        }
          
        return file_with_largest_perimeter.getName();
    }

    public void testPerimeter () {
        // This is where a new Shape object is created
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
        
        // getNumPoints(s) rather than s.getNumPoints() because 
        // getNumPoints is defined in this class, not in Shape
        int numPoints = getNumPoints(s);
        System.out.println("number of points = " + numPoints);
        
        // Could just call the function in the printLn but not doing so here.
        double avgLength = getPerimeter(s) / getNumPoints(s);
        System.out.println("average length = " + avgLength);
        
        double longestSideLength = getLargestSide(s);
        System.out.println("longest side length = " + longestSideLength);
        
        double largestX = getLargestX(s);
        System.out.println("largest x value is " + largestX);
    }
    
    public void testPerimeterMultipleFiles() {
        double largest_perimeter = getLargestPerimeterMultipleFiles();
        System.out.println("Largest perimeter is: " + largest_perimeter);
    }

    public void testFileWithLargestPerimeter() {
        String file_with_largest_perimeter = getFileWithLargestPerimeter();
        System.out.println("File with largest perimeter is: " + file_with_largest_perimeter);        
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        System.out.println("");
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
        pr.testPerimeterMultipleFiles();
        pr.testFileWithLargestPerimeter();
    }
}
