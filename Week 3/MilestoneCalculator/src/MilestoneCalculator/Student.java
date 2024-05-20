package MilestoneCalculator;


public class Student {
     //attributes
     private String studentNumber;
     private String studentName;
     private float ms1;
     private float ms2;
     private float ta;
     private float finalGrade;
   
     //getter and setter methods
     //getter methods
     public String getStudentNumber() {
         return studentNumber;
     }
   
     public String getStudentName() {
         return studentName;
     }
   
     public String getMs1() {
         return String.valueOf(ms1);
     }
   
     public String getMs2() {
         return String.valueOf(ms2);
     }
   
     public String getTa() {
         return String.valueOf(ta);
     }
   
     public String getFinalGrade() {
         return String.valueOf(finalGrade);
     }
   
     //setter methods
     public void setStudentNumber(String studNumber) {
         studentNumber = studNumber;
     }
   
     public void setStudentName(String studName) {
         studentName = studName;
     }
   
     public void setMs1(float ms1) {
         this.ms1 = ms1;
     }
   
     public void setMs2(float ms2) {
         this.ms2 = ms2;
     }
   
     public void setTa(float ta) {
         this.ta = ta;
     }
   
     //methods
     public float computeGrade() {
         finalGrade = ms1 + ms2 + ta;
         return finalGrade;
     }
}
