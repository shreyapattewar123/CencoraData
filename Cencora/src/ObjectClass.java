class Student{
    int id;
    String name;
    int age;



    public Student(){

      }

    public Student(int id, String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static int demo(int... args){
        int sum=0;
        for(int i =0;i<args.length;i++){
            sum += args[i]; //var args methods
        }
        return sum;
    }
}
public class ObjectClass {
     public static void main(String[] args){
        Student stobj[] = new Student[2];
        stobj[0] = new Student(1,"Shreya",20);
         stobj[1] = new Student(1,"Shreya",20);

         for(int i=0;i<2;i++){
             System.out.println(stobj[i]);
         }
         System.out.println(Student.demo(1,2,3,4));

    }
}
