package DataStructure.DataStructureExample13;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name){
        this.studentNum = studentNum;
        this.name = name;
    }

    public Student(String string, String string2, int i) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student target){
            return target.studentNum == this.studentNum;
        }

        else{
           return false;
        }
    }

}
