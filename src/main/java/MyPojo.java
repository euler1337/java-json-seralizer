import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@NoArgsConstructor
public class MyPojo {

    @Getter @Setter private String myString;
    @Getter @Setter private int myInt;

    @JsonCreator
    public MyPojo(
            @JsonProperty("my_int") int myInt,
            @JsonProperty("my_string") String myString) {
        this.myInt = myInt;
        this.myString = myString;
    }
}
