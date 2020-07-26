package BasicOps;

public class ConstructorExample {
  private int age;
  private char gender;
  public String name;
  
  ConstructorExample(String varName, int varAge, char varGender){
	  name = varName;
	  age = varAge;
	  gender = varGender;
  }
  
  ConstructorExample(String varName, int varAge){
	  name = varName;
	  age = varAge;	  
  }
  
  private String getName() {
	  return name;
  }
  
  private int getAge() {
	  return age;
  }
  
  private char gender() {
	  return gender;
  }
  
  
}
