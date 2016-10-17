import java.util.Scanner;

/**
 * This is a class to define the necessary attributes and methods to conceptualize a "Student"
 * The spepcific tasks are:
 * 1. Instiate 
 * 
 * @author Nawshin Tabassum Tanny 
 * @version 15.10.2016
 */

public class Student{
	static Scanner input = new Scanner(System.in);  //Use for Scan data from user
    // Declare the important attributes of a student. For example:
    //1.Id
    //2. Name
    //3. Department
    //4. University
    //5. GPAs in various terms (Multidimensional arrays)
    //6. subjects for Current terms
    //7. Credits and grades of Current Terms (Multidimmentional Array)
    int id;
    String name,department,university;
    double cgpa;
    double[][] gpa;  // 1st index for Year & 2nd in for Semester 
    String[] subjects;
    double[][][] credits; //1st index for year 2nd is for semester & 3rd is for Subject number
    double[][][] grades; //1st index for year 2nd is for semester & 3rd is for Subject number
    
    
    

    /**
     * Define a constructor that initilize the default properties of the Student
     */
    public Student(){
        // initialise   variables with defult values
    	id = 0;//default initialization
    	name = null;//default initialization
    	department = null;//default initialization
    	university = null;//default initialization
    	gpa = new double[5][5];//default initialization
    	credits = new double[8][8][10];//default initialization
    	grades = new double[8][8][10];//default initialization
        
    }
    /**
     * Define a method to print the students details.
     */
    
    public void studentDetailsById(int iD){
        //write your code here
    	System.out.println("ID : "+id);
    	System.out.println("Name : "+name);
    	System.out.println("Depertment : "+department);
    	System.out.println("University : "+university);
	}
    
    /**
     * Define a method to update information of students by ID
     * Use as many arguments as required.
     */
    public void updateStudentById(int id){
        //Write your code here
    	this.id = id;
    	input.nextLine();
    	System.out.print("Enter name : ");
    	name = input.nextLine();
    	System.out.print("Enter University name : ");
    	university = input.nextLine();
    	System.out.print("Enter Department name : ");
    	department = input.nextLine();   	 
    }
    
    /**
     * Define a method to compute the CGPA from the Given term GPA for a particular student.
     * se as many arguments as required.
     */
    public double computeCGPAByID(int iD){
        // Write your code here
    	
    	for(int i=1;i<=8;i++)
    	{
    		System.out.println("Enter GPA of Sem " + (i) +" :  ");
    		cgpa += input.nextDouble();
    	}
    	
    	return cgpa/8;
    }
    
    /**
     * Define a method to compute the GPA from the given Credits and Grades of all the subjects
     */
    public double computeGPAById()
    {
        //write yor code here
        return 0.0;
    }
    
    /**
     * After performing required operations on each student, save the information to a file. Use File and PrintWriter Class. 
     * use as many arguments as required.
     * 
     */
   public void saveStudents()
    {
        //Write your code here
    }
    
    /**
     * Create a dummy files with infromations to describe the properties of a Student object and load the data files using Java File and Scanner class.
     * use as many arguments as required.
     */
    public void loadStudents(){
        //Write your code here
        
    }
    
    /**
     * The tasks to be carried out here:
     * 1. Create an Arrays of students using Student Class. Initlize them and perfom all the above defined operation to evualuate your code.
     * use as many arguments as required.
     */
    public static void main(String[] args){
    	int n,iD;
    	double cgpa;
    	
    	System.out.print("How many Students ? ");
    	n = input.nextInt();
    	Student[] student = new Student[n]; //Create n object of Student Class
    	for (int i = 0; i < n; i++) {
    		System.out.println("-----Update Student " + i+1 +" Information");
    		System.out.print("Enter ID no : ");
    		iD = input.nextInt();
    		student[i] = new Student(); //Memory allocation for nth student
    	
				student[i].updateStudentById(iD);
				student[i].studentDetailsById(iD);
				cgpa = student[i].computeCGPAByID(iD);
				System.out.println("CGPA is : "+cgpa);
		
		}
    }
}