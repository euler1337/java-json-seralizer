import com.fasterxml.jackson.databind.ObjectMapper;

public class ApplicationRunner {

    static MyPojo myPojo = new MyPojo();
    static JsonReader myJsonReader = new JsonReader();

    public static void main(String[] args) {

        myPojo.setMyString("OJ LER");
        myPojo.setMyInt(1336);

        System.out.println("BEFORE: " + myPojo.getMyString() + myPojo.getMyInt());

        try {
            myPojo = new ObjectMapper()
                    .readerFor(MyPojo.class)
                    .readValue(myJsonReader.getData());
        } catch(Exception e){
            System.out.println("ERROR: <Very clear error message...>");
        }

        System.out.println("AFTER: " + myPojo.getMyString() + myPojo.getMyInt());
    }
}