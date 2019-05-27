/**
 * @author chiennghe
 */
public class Main {
    public static void main(String [] args){
        Programmer p1 = new Programmer();
        p1.setId("P001");
        p1.setName("Programmer 1");
        p1.setAge((byte)10);
        System.out.println(p1.toString());

        Programmer p2 = new Programmer("P002", "Programmer 2", (byte)18);
        System.out.println(p2.toString());

        Programmer p3 = Programmer.builder()
                .id("P003").name("Programmer 3").age((byte)20).build();
        System.out.println(p3.toString());
    }
}
