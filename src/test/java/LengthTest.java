import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LengthTest {
    @Test
    public void should_add_two_length_with_same_unit(){
        Length len1 = new Length(15.0, 1);
        Length len2 = new Length(5.0, 1);
        len1.add(len2);
        assertThat(len1.getLen(), is(20.0));

    }

    @Test
    public void should_minus_two_length_with_same_unit(){
        Length len1 = new Length(15.0, 1);
        Length len2 = new Length(5.0, 1);
        len1.minus(len2);
        assertThat(len1.getLen(), is(10.0));

    }

    @Test
    public void should_return_true_when_two_length_equal(){
        Length len1 = new Length(15.0, 1);
        Length len2 = new Length(15.0, 1);
        assertThat(len1.equal(len2), is(true));

    }
    @Test
    public void should_return_false_when_two_length_equal(){
        Length len1 = new Length(15.0, 1);
        Length len2 = new Length(10.0, 1);
        assertThat(len1.equal(len2), is(false));

    }

    @Test
    public void should_return_false_when_lens_equal_but_unit_different(){
        Length len1 = new Length(10.0,1);
        Length len2 = new Length(10.0,2);
        assertThat(len1.equal(len2), is(false));
    }

    @Test
    public void should_return_true_when_lens_equal_but_unit_different(){
        Length len1 = new Length(10.0,1);
        Length len2 = new Length(1.0,2);
        assertThat(len1.equal(len2), is(true));
    }

    @Test
    public void should_add_two_len_with_different_unit(){
        Length len1 = new Length(10.0,1);
        Length len2 = new Length(1.0,2);
        len1.add(len2);

        assertThat(len1.getLen(), is(20.0));
    }

    @Test
    public void should_minus_two_len_with_different_unit(){
        Length len1 = new Length(10.0,2);
        Length len2 = new Length(10.0,1);
        len1.minus(len2);

        assertThat(len1.getLen(), is(9.0));
        assertThat(len1.getUnit(),is(2));
    }
}
