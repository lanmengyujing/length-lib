import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LengthTest {

    @Test
    public void should_return_correct_value_when_add_two_length_with_same_unit(){
        Length length1 = new Length(15.0, 1);
        Length length2 = new Length(5.0, 1);
        length1.add(length2);
        assertThat(length1.getValue(), is(20.0));

    }

    @Test
    public void should_return_correct_value_when_subtract_two_length_with_same_unit(){
        Length length1 = new Length(15.0, 1);
        Length length2 = new Length(5.0, 1);
        length1.subtract(length2);
        assertThat(length1.getValue(), is(10.0));

    }

    @Test
    public void should_return_true_when_two_length_equal(){
        Length length1 = new Length(15.0, 1);
        Length length2 = new Length(15.0, 1);
        assertThat(length1.equal(length2), is(true));

    }

    @Test
    public void should_return_false_when_two_length_not_equal(){
        Length length1 = new Length(15.0, 1);
        Length length2 = new Length(10.0, 1);
        assertThat(length1.equal(length2), is(false));

    }

    @Test
    public void should_return_false_when_lens_equal_but_unit_different(){
        Length length1 = new Length(10.0,1);
        Length length2 = new Length(10.0,2);
        assertThat(length1.equal(length2), is(false));
    }

    @Test
    public void should_return_true_when_lens_equal_but_unit_different(){
        Length length1 = new Length(10.0,1);
        Length length2 = new Length(1.0,2);
        assertThat(length1.equal(length2), is(true));
    }

    @Test
    public void should_add_two_len_with_different_unit(){
        Length length1 = new Length(10.0,1);
        Length length2 = new Length(1.0,2);
        length1.add(length2);

        assertThat(length1.getValue(), is(20.0));
    }

    @Test
    public void should_minus_two_len_with_different_unit(){
        Length length1 = new Length(10.0,2);
        Length length2 = new Length(10.0,1);
        length1.subtract(length2);

        assertThat(length1.getValue(), is(9.0));
        assertThat(length1.getUnit(),is(2));
    }
}
