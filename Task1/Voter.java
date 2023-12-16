class VoterUnderAgeException extends Exception {
    public VoterUnderAgeException(String message) {
        super(message);
    }
}


public class Voter {
    private String name;
    private int age;
    private String voterId;


    public Voter(String name, int age, String voterId) throws VoterUnderAgeException {

        if (age < 18) {
            throw new VoterUnderAgeException("Voter must be 18 years or older.");
        }


        this.name = name;
        this.age = age;
        this.voterId = voterId;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public String getVoterId() {
        return voterId;
    }


    public static void main(String[] args) {
        try {

            Voter voter1 = new Voter("Arjun", 18, "RS12002");


            System.out.println("Name: " + voter1.getName());
            System.out.println("Age: " + voter1.getAge());
            System.out.println("Voter ID: " + voter1.getVoterId());



        } catch (VoterUnderAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}