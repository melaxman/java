class Address{
    int ward;
    String street;
    public Address(int ward, String street){
        this.ward=ward;
        this.street=street;
    }
    public String toString(){
        return "ward="+ward+"street="+street;
    }
}
class Student{
    String name;
    Address addr;
    public Student(String name,Address addr){

        this.name=name;
        this.addr=addr;

    }
    public String toString(){
        return "name="+name+"address="+addr;
    }
}
class Test{

    public static void main(String[]agrs){
        Address a=new Address(2,"ad");
        Student s=new Student("aaa",a);
        System.out.print(s);
    }
}
