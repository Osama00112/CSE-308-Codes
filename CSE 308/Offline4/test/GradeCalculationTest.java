import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeCalculationTest {
    GradeCalculation gc = new GradeCalculation();

    @Nested
    class credit3{
        @Test
        void checkGradeCredit(){
            assertEquals("A", gc.calculateGradeCredit3("280"));
            assertEquals("B", gc.calculateGradeCredit3("220"));
            assertEquals("C", gc.calculateGradeCredit3("200"));
            assertEquals("F", gc.calculateGradeCredit3("100"));
        }

        @Test
        void checkBoundary(){
            assertEquals("A",gc.calculateGradeCredit3("239.1"));
            assertEquals("A",gc.calculateGradeCredit3("239.5"));
            assertEquals("A",gc.calculateGradeCredit3("239.9"));

            assertEquals("B",gc.calculateGradeCredit3("239"));

            assertEquals("B",gc.calculateGradeCredit3("209.1"));
            assertEquals("B",gc.calculateGradeCredit3("209.5"));
            assertEquals("B",gc.calculateGradeCredit3("209.9"));

            assertEquals("C",gc.calculateGradeCredit3("209"));

            assertEquals("C",gc.calculateGradeCredit3("179.1"));
            assertEquals("C",gc.calculateGradeCredit3("179.5"));
            assertEquals("C",gc.calculateGradeCredit3("179.9"));

            assertEquals("F",gc.calculateGradeCredit3("179"));
            assertEquals("F",gc.calculateGradeCredit3("0"));

        }

        @Test
        void checkIfExceedsBoundary(){
            assertEquals("Invalid Input.", gc.calculateGradeCredit3("450"));
            assertEquals("Invalid Input.", gc.calculateGradeCredit3("-3.4"));
        }

        @Test
        void  nonNumberInput(){
            assertEquals("Not a number.", gc.calculateGradeCredit3("ABC"));
        }

        //Extra test
        @Test
        void validRoundUp(){
            assertEquals("Invalid Input.", gc.calculateGradeCredit3("-0.8"));
        }

    }
    @Nested
    class credit4{
        @Test
        void checkGradeCredit(){
            assertEquals("A", gc.calculateGradeCredit4("380"));
            assertEquals("B", gc.calculateGradeCredit4("300"));
            assertEquals("C", gc.calculateGradeCredit4("250"));
            assertEquals("F", gc.calculateGradeCredit4("200"));
        }

        @Test
        void checkBoundary(){
            assertEquals("A",gc.calculateGradeCredit4("319.1"));
            assertEquals("A",gc.calculateGradeCredit4("319.5"));
            assertEquals("A",gc.calculateGradeCredit4("319.9"));

            assertEquals("B",gc.calculateGradeCredit4("319"));

            assertEquals("B",gc.calculateGradeCredit4("279.1"));
            assertEquals("B",gc.calculateGradeCredit4("279.5"));
            assertEquals("B",gc.calculateGradeCredit4("279.9"));

            assertEquals("C",gc.calculateGradeCredit4("279"));

            assertEquals("C",gc.calculateGradeCredit4("239.1"));
            assertEquals("C",gc.calculateGradeCredit4("239.5"));
            assertEquals("C",gc.calculateGradeCredit4("239.9"));

            assertEquals("F",gc.calculateGradeCredit4("239"));
            assertEquals("F",gc.calculateGradeCredit4("0"));

        }

        @Test
        void checkIfExceedsBoundary(){
            assertEquals("Invalid Input.", gc.calculateGradeCredit4("450"));
            assertEquals("Invalid Input.", gc.calculateGradeCredit4("-3.4"));
        }

        @Test
        void  nonNumberInput(){
            assertEquals("Not a number.", gc.calculateGradeCredit4("ABC"));
        }

        //Extra test
        @Test
        void validRoundUp(){
            assertEquals("Invalid Input.", gc.calculateGradeCredit4("-0.8"));
        }


    }



}