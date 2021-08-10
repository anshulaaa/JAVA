
/**
 * Write a description of class StaffHire here.
 *Among all the class, staff hire parent class and has two sub child class.This class three attributes of different types.
 *First constructor class is created for those attributes with a corresponding access modifiers(getter and setter method)
 *At  last display method is created to print output of the attributes.
 * @author (Anshul Agarwal)
 * @version (29 December 2019)
 */
 public class StaffHire   // this is the super class,parent class 
{   
    //variable decleration
    private int Vacancynumber;
    private String Designation;
    private String JobType;
    
    // creating parameterized constructor which intialized value to instance values of staff hire clas 
    StaffHire(int Vacancynumber,String Designation,String JobType)
    {
      this.Vacancynumber=Vacancynumber;
      this.Designation=Designation;
      this.JobType=JobType;
    }

    //Setter and getter method of staffHire class's variable 
    public void setVacancynumber(int Vacacancynumber)
    {
        this.Vacancynumber=Vacacancynumber;
    }
    
    public int getVacancynumber()
    {
       return Vacancynumber; 
    }
    
    public void setDesignation(String Designation)
    {
        this.Designation=Designation;
    }
    
    public String getDesignation()
    {
       return Designation; 
    }
    
    public String getJobType()
    {
        return JobType;
    }
    
    public void setJobType(String JobType)
    {
        this.JobType=JobType;
    }
    //end of getter and setter 
    
    public void display()// creating method for value display
    {
        System.out.println("Vacancy Number="+this.getVacancynumber());//callling getters method for the display
        System.out.println("Designation="+this.getDesignation());
        System.out.println("Job Type="+this.getJobType());
    }
}
   
    
    
    