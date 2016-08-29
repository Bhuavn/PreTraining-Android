import java.io.*;

class Person
{
     String name;
    String address;
 
     Person(String name, String address)
     {
              this.name = name;
              this.address = address;
      }
	  
	public String getName() {
		return this.name;
		//System.out.println("Name: " + name);
	}
		
	
	public String getAddress() {
		return this.address;	
		//System.out.println("Address: " + address);
	}
    
	
	public void setAddress(String address) 
    {
        this.address = address;
    }

	public String toString(){
		return "Person[Name:"+getName()+",address:"+getAddress()+"]";
	}
     
	   
	  
} 

class Student extends Person
{
     String program;
	 int year;
	 double fee;
	 
 
     Student(String name, String address, String program,int year, double fee)
     {
          super(name,address);
		  this.program=program;
		  this.year=year;
		  this.fee=fee;
      }
	  
	  
	  public String getProgram() 
    {
        return program;
    }
	
	public void setProgram(String program) 
    {
        this.program = program;
    }
	
	
	 public int getYear() 
    {
        return year;
    }
	
	public void setYear(int year) 
    {
        this.year = year;
    }
	
	public double getfee() 
    {
        return fee;
    }
	
	public void setFee(double fee) 
    {
        this.fee = fee;
    }

	
	
	public String toString() {
		return "Student[Person[name="+getName()+",address="+getAddress()+"],program="+getProgram()+",year="+getYear()+",fee="+getfee()+"]";
	}
	
	/*  
     void DisplayResults()
     {
            

             System.out.println("Name : " + name);
            System.out.println("Address : " + address);
            System.out.println("Program: " + program);
			System.out.println("Year: " + year);
			System.out.println("Fee: " + fee);
			
     }
	 */
	 
}

class Staff extends Person
{
      String school;
      double pay;
      
     Staff(String name, String address, String school, double pay)
     {
          super(name,address);
          this.school = school;
          this.pay = pay;
          
      }
	  
	public String getSchool()
	  {
		  return school;
		  }

    public void setSchool(String school) {
	
       this.school = school;
    }
	
	public double getPay() 
    {
        return pay;
    }
	
	public void setPay(double pay) 
    {
        this.pay = pay;
    }

	
	public String toString() {
		return "Staff[Person[name="+getName()+",address="+getAddress()+"],school="+getSchool()+",pay="+getPay()+"]";
	}
	
	
	/*
	  
     void DisplayResults()
     {
            System.out.println("Name : " + name);
            System.out.println("Address : " + address);
			System.out.println("School : " + school);
            System.out.println("Pay : " + pay);
     }
	 
	 */
}

class PersonandSubclass
{
       public static void main(String args[])
       {
               Person pobj = new Person("Bhuvan","IIIT-Nuzvid");
               Student stuobj = new Student("Bhuvan","IIIT-Nuzvid","APSSDC-ANDROID",2016,2000.00);
               Staff staffObj = new Staff("Bhuvan","IIIT-Nuzvid","IIIT",6000.00);
			   
               System.out.println("Person Details:");
			   System.out.println(pobj.toString());
			   
               //pobj.DisplayResults();
			   System.out.println("\n\nStudent Details:");
			   System.out.println(stuobj.toString());
               //stuObj.DisplayResults();
               
               System.out.println("\n\nStaff Details:");
			   System.out.println(staffObj.toString());
               //staffObj.DisplayResults();
        }
}

	

 