import java.util.HashMap;
import java.util.UUID;
import java.util.Vector;

class SchoolReferences {
    private String[] school_A_Ref = {
            "A",
            "B",
            "C",
            "D"
    };

    public String[] getSchoolRef(String selected) {
        if (selected == "A") {
            return school_A_Ref;
        }
        return null;
    }
}

class Student{
    private UUID id;
    private String className;
    private String firstName;
    private String surName;

    public Student(String firstName){
        this.firstName=firstName;
    }
    public Student(String className, String firstName, String surName) {
        this.className = className;
        this.firstName = firstName;
        this.surName = surName;
        this.id=UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}

class SchoolDB{
    private HashMap<String,Vector<Student>> schoolDB=new HashMap<>();
    private String schoolName;

    public SchoolDB(String schoolName){
        this.schoolName=schoolName;
        this.initializeSchool(schoolName);
    }

    private void initializeSchool(String schoolName){
        SchoolReferences sRef=new SchoolReferences();
        String[] schoolRef= sRef.getSchoolRef(schoolName);

        if(schoolRef!=null){
            for(String ref:schoolRef){
               // System.out.println(ref);
                schoolDB.put(ref,null);
            }

        }
    }

    private Vector<Student> getClass(String className){
        return schoolDB.get(className);
    }

    private String genClassRef(){

        String bestClass=null;
        int currClassSize=0;
        for(String className:schoolDB.keySet()){
            int size=0;
            if(schoolDB.get(className)!=null) {
                for (Student student : schoolDB.get(className)) {
                    size++;
                }
            }
            if(size<currClassSize || bestClass==null){
                currClassSize=size;
                bestClass=className;
            }
        }
        return bestClass;
    }

    public void addStudent(String firstName){
        String assignedClassRef=genClassRef();
        Vector<Student> tempClass = schoolDB.get(assignedClassRef);

        if(tempClass==null){
            tempClass=new Vector<>();
        }
        tempClass.add(new Student(firstName));
        schoolDB.put(assignedClassRef,tempClass);

    }

    public void addStudent(String firstName,String className){
        if(schoolDB.get(className)==null){
            schoolDB.put(className,null);
        }

        Vector<Student> students=schoolDB.get(className);

        if(students==null){
            students=new Vector<>();
        }

        students.add(new Student(firstName));

        schoolDB.put(className,students);
    }

    public void primitivePrint(){
        /*for(String key: schoolDB.keySet()){
            System.out.println(key);
        }*/
        for(String currClass:schoolDB.keySet()){
            System.out.print(currClass+": ");
            if(schoolDB.get(currClass)!=null) {
                for (Student student : schoolDB.get(currClass)) {
                    System.out.print(student.getFirstName() + ", ");
                }
            }
                System.out.println();
        }
    }
}
public class LinkedHash {
    public static void main(String[] args){

        SchoolDB db=new SchoolDB("A");
        db.addStudent("Sebas");
        db.addStudent("Christopher");
        db.addStudent("Sebas");
        db.addStudent("Christopher");
        db.addStudent("Sebas");
        db.addStudent("Christopher");

        db.primitivePrint();


    }
}
