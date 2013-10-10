import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LengthTest {

    @Test
    public void should_return_correct_value_when_add_two_length_with_same_unit(){
        Length length1 = new Length(15.0, Unit.MM);
        Length length2 = new Length(5.0, Unit.MM);
        Length length = length1.add(length2);
        assertThat(length.getValue(), is(20.0));

    }

    @Test
    public void should_return_correct_value_when_subtract_two_length_with_same_unit(){
        Length length1 = new Length(15.0, Unit.MM);
        Length length2 = new Length(5.0, Unit.MM);
        Length subtract = length1.subtract(length2);
        assertThat(subtract.getValue(), is(10.0));

    }

    @Test
    public void should_return_true_when_two_length_equal(){
        Length length1 = new Length(15.0, Unit.MM);
        Length length2 = new Length(15.0, Unit.MM);
        assertThat(length1.equals(length2), is(true));

    }

    @Test
    public void should_return_false_when_two_length_not_equal(){
        Length length1 = new Length(15.0, Unit.MM);
        Length length2 = new Length(10.0, Unit.MM);
        assertThat(length1.equals(length2), is(false));

    }

    @Test
    public void should_return_false_when_lens_equal_but_unit_different(){
        Length length1 = new Length(10.0, Unit.MM);
        Length length2 = new Length(10.0, Unit.M);
        assertThat(length1.equals(length2), is(false));
    }

    @Test
    public void should_return_true_when_lens_equal_but_unit_different(){
        Length length1 = new Length(1000.0, Unit.MM);
        Length length2 = new Length(1.0, Unit.M);
        assertThat(length1.equals(length2), is(true));
    }

    @Test
    public void should_add_two_len_with_different_unit(){
        Length length1 = new Length(1000.0, Unit.MM);
        Length length2 = new Length(100.0, Unit.CM);
        Length sum = length1.add(length2);

        assertThat(sum.getValue(), is(2000.0));
    }

    @Test
    public void should_minus_two_len_with_different_unit(){
        Length length1 = new Length(1000.0, Unit.MM);
        Length length2 = new Length(10.0, Unit.M);
        Length subtract = length1.subtract(length2);

        assertThat(subtract.getValue(), is(-9000.0));
        assertThat(subtract.getUnit(),is(Unit.MM));
    }
}
