public class Dependemncy_Uses {
    public static void main(String[] args) {
        
office ref1= new office();
ref1.dowork();

    }
}

class printer{

void printDocument(String doc){
    System.out.println("Printing document : "+doc);
}


}

class office{

    void dowork(){
printer ref= new printer();
ref.printDocument("Project.PDF");
System.out.println("Work done...");

    }
}
