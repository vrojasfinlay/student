/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author victo
 */
public class PartTimeStudent extends Student{
    private int numOfCourses;

    public PartTimeStudent(int numOfCourses, String studentId,String studentName) {
        super(studentName, studentId);
        this.numOfCourses = numOfCourses;
        
    }
    
}
