class student{
    int id;
    String name;
    student( int id, String name){
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println("Id : " + id + " " + "NAME : "+name);
    }

}


class first{
     public static void main(String[] s){
       student s1 = new student(101,"Panku");
       student s2 = new student(102,"Raghav");
       s1.display();
     }
}