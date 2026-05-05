class student{
    int id;
    String name;
    // static String collage = "Risu";
    student(int id, String name){
        this.id =id;
        this.name = name;
    }
static String Collage = "RISU";


void PrintName(){
    System.out.println("id"+" "+id+" "+ "name"+" "+name + " " + Collage);

}
}


public class first {
   public static void main(String[] s){
    student s1 = new student(101,"RAMJI");
    student s2 = new student(102,"KANHA");
    s2.PrintName();
    s1.PrintName();
}    
}
