public class Student {
    private int rollNumber;
    private String name;
    private int age;
    private String course;
    private boolean isValidName(String name) {

        return name.matches("[a-zA-Z\\s]+");
    }



    public Student(int rollNumber, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 16 || age > 20) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21!!");
        }
        if(!isValidName(name)){

            throw new NameNotValidException("Name should not contain special characters or numbers !!");
        }

        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }


    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public static void main(String[] args) throws NameNotValidException, AgeNotWithinRangeException {
         try {
             Student student1 = new Student(1, "Arjun1", 122, "Biology");


             System.out.println("Roll Number: " + student1.getRollNumber());
             System.out.println("Name: " + student1.getName());
             System.out.println("Age: " + student1.getAge());
             System.out.println("Course: " + student1.getCourse());
         }
         catch(NameNotValidException|AgeNotWithinRangeException e1){
             System.out.println("Error!! :"+e1.getMessage());


         }


    }
}
