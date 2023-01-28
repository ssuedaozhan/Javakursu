package Gun28_02_Constructor;

public class Kitap {
    String name;
    int publishyear;
    String author ;

    public Kitap(){ // constructor


    }
    public Kitap(String name , int publishyear, String author)
    {
        this.name=name;
        this.publishyear=publishyear;
        this.author=author;

    }
    public Kitap(String name, int publishyear)
    {
        this (name,0,"");

    }
    public  String toString(){
        return name+" "+author+" "+publishyear;
    }
}
