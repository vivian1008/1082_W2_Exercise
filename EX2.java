public class EX2{
    public static void main(String[] args) {
        Chess chess1 = new Chess();

        chess1.setName("General");
        chess1.setColor("Black");
        chess1.setStatus("1");
        chess1.setQuantity("1");
        chess1.setTexture("plastic");

        System.out.println("Name:"+chess1.getName());
        System.out.println("Color:"+chess1.getColor());
        System.out.println("Status:"+chess1.getStatus());
        System.out.println("Place:"+chess1.getQuantity());
        System.out.println("Texture:"+chess1.getTexture());
        System.out.println();

        Chess chess2 = new Chess();

        chess2.setName("Knight");
        chess2.setColor("Red");
        chess2.setStatus("2");
        chess2.setQuantity("2");
        chess2.setTexture("plastic");

        System.out.println("Name:"+chess2.getName());
        System.out.println("Color:"+chess2.getColor());
        System.out.println("Status:"+chess2.getStatus());
        System.out.println("Place:"+chess2.getQuantity());
        System.out.println("Texture:"+chess2.getTexture());
        System.out.println();

        Chess chess3 = new Chess();

        chess3.setName("car");
        chess3.setColor("Black");
        chess3.setStatus("4");
        chess3.setQuantity("2");
        chess3.setTexture("wood");

        System.out.println("Name:"+chess3.getName());
        System.out.println("Color:"+chess3.getColor());
        System.out.println("Status:"+chess3.getStatus());
        System.out.println("Place:"+chess3.getQuantity());
        System.out.println("Texture:"+chess3.getTexture());
        System.out.println();
    }
}