package pack2;
//4. using public access specifiers

class pubaccessspecifiers {

    public void display()
    {
        System.out.println("This is Public Access Specifiers");
    }
}

//create another package



public class accessSpecifiers4 {

    public static void main(String[] args) {

        pubaccessspecifiers obj = new pubaccessspecifiers();
        obj.display();

    }
}

