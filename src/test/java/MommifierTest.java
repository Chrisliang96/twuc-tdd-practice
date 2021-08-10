import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MommifierTest {
    //aeiou
    public String transform(String input){
        StringBuffer result = new StringBuffer().append(input);
        if (input.isEmpty()){
            return null;
        }
        for (int i = 0; i <input.length(); i++) {
            if (input.charAt(i) == 'a'){
                result.replace(i,i+1,"mommy");
            }
        }
        System.out.println(result);
        return result.toString() ;

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

    @Test
    void should_return_transform_if_input_less_than_30present() {
        String input = "abbbb";
        Assertions.assertEquals("mommybbbb",transform(input));
    }
}
