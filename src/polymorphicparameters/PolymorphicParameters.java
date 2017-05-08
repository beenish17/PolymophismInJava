
package polymorphicparameters;
// I have discussed three basic concepts of Polymorphism.
public class PolymorphicParameters {
     //1: This is polymorphic behaviour , in which a Super-Class is passed as a parameter.
    
    public static void feed(Reptile object){    //Passing a super class as Parameter.
        System.out.println("Feeding :"+ object.myName());   //
    }
    public static void main(String[] args) {
       
       feed(new Alligator());   //New instance of sub class Alligator.
       feed(new Croccodile());  //New instance of sub class Crocodile.
       feed(new Reptile());
       
       System.out.println("----------------------------------------------------------------");
       //This is a simple way of call functions of different classes by creating objects independently.
       Reptile object=new Reptile();
       System.out.println(object.myName());
       
       Alligator object1 =new Alligator();
       System.out.println(object1.myName());
       
       Croccodile object3=new Croccodile();
       System.out.println(object3.myName());
       
       System.out.println("----------------------------------------------------------------");
       //In this i have created only one Object .and assing different instances to to it one by one.
       //Another point is . i am assining instances of subclass to superClass so explicit conversion is not required.
       Reptile object4=new Reptile();
       System.out.println(object4.myName());
        
       Reptile r=new Alligator();
       System.out.println(r.myName());
        
       Reptile v=new Croccodile() ;
       System.out.println(v.myName());
       
       System.out.println("----------------------------------------------------------------");
       
       // Here i am converting SuperClass to Subclass so explicit type conversion is important.
       //but one thing to keep in mind is.. always make a subclass an instance of SuperClass.
       //1: Reptile aa=new Reptile();
       Reptile aa=new Alligator();
       Alligator bb=(Alligator)aa;
       System.out.println(bb.myName());
       
       Reptile bbb=new Croccodile();
       Croccodile ccc=(Croccodile)bbb;
       System.out.println(ccc.myName());
       
       Reptile LoL=new Reptile();
       System.out.println(LoL.myName());
       
    }
    
}
