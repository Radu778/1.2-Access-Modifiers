package pack2;
//3. using protected access specifiers

class proaccessspecifiers {

    protected void display()
    {
        System.out.println("This is protected access specifier");
    }
}

//create another package




public class accessSpecifiers3 extends proaccessspecifiers {

    public static void main(String[] args) {
        accessSpecifiers3 obj = new accessSpecifiers3 ();
        obj.display();
    }

}

