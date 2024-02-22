public class stat {
    public static void main(String[] args) {
        student s1=new student();
        s1.schoolname = "SPIT";
        student s2= new student();
        System.out.println(s2.schoolname);

    }
}
//static keyword
//is useed to share the same variables and methods of given classes
//properities,funns,blocks,nested classes

class student{
String name;
int rollno;
static String schoolname;
void getname (String name){
    this.name = name;
}
String getname (){
    return this.name;
}

}
