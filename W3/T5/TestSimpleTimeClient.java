public class TestSimpleTimeClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        SimpleTimeClient myTimeClient = new SimpleTimeClient();
        System.out.println("myTimeClient is in class: " + myTimeClient.getClass());
        System.out.println(myTimeClient.toString());
        System.out.println("Hashcode myTimeClient: " + myTimeClient.hashCode());
        myTimeClient.setDate(18, 9, 2002);
        System.out.println("Hashcode myTimeClient: " + myTimeClient.hashCode());
        myTimeClient.setDateAndTime(27, 4, 2022, 17, 30, 59);
        System.out.println(myTimeClient.getLocalDateTime().toString());
        System.out.println("--------------------------");

        SimpleTimeClient myTimeClient2 = (SimpleTimeClient) myTimeClient.clone();
        System.out.println("myTimeClient2 is in class: " + myTimeClient2.getClass());
        System.out.println(myTimeClient2.toString());
        System.out.println("Does myTimeClient2 equal to myTimeClient? " + myTimeClient2.equals(myTimeClient));
    }
}