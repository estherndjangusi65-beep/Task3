public class Candidate {
    static int examyear;
    static double registrationFee;
    static String gradingpolicy;

    String registrationStatus;
    String examinationCentre;
    String registrationNumber;
    String candidateName;


    static {
        System.out.println("Static Block Executing.....");
        examyear=2026;
        registrationFee=65000;
        gradingpolicy="A=80-100, B=70-79, C=60-69, D=50-59, F=Below 50";
    }


    {
        System.out.println("Instance Initialization Block Executing...");
        registrationStatus="Registered";
        examinationCentre="UNEB Kampala Centre";
        registrationNumber="UNEB2026001";
        candidateName="Mave Esther";
    }


    public Candidate(){
        System.out.println("Constructor Invoked");
    }

    public void showCandidateInfo(){
        System.out.println("Registration Status =" + registrationStatus);
        System.out.println("Examination Centre =" + examinationCentre);
        System.out.println("Candidate Name =" + candidateName);
        System.out.println("Registration Number =" + registrationNumber);
        System.out.println("Exam Year =" + examyear);
        System.out.println("Registration Fee =" + registrationFee);
        System.out.println("Grading Policy =" + gradingpolicy);
    }
}
