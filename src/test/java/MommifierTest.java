import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MommifierTest {
    //aeiou
    public String transform(String input){
        if (input.isEmpty()){
            return null;
        }
        if (input.matches("a")){
            return "mommy";
        }
        return input ;

    }
    @Test
    public void should_return_input_if_exist_one(){
        String input = "b";
        Assertions.assertEquals(input,transform(input));
    }

    @Test
    public void should_return_input_if_vowel_is_null(){
        String input =" ";
        Assertions.assertEquals(input,transform(input));
    }

    @Test
    public void should_return_transform_if_exist_one_vowel(){
        String input = "a";
        Assertions.assertEquals("mommy",transform(input));
    }



}
