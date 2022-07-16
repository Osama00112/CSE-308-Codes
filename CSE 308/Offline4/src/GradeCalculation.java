public class GradeCalculation {
    public String calculateGradeCredit3(String Marks){
        double totalMarks;
        try {
            totalMarks = Double.parseDouble(Marks);
        }catch (NumberFormatException e){
            return "Not a number.";
        }

        if(totalMarks < 0)
            return "Invalid Input.";
        totalMarks = Math.ceil(totalMarks);
            if(totalMarks > 300 || totalMarks < 0)
                return "Invalid Input.";
            else if(totalMarks >= 240)
                return "A";
            else if(totalMarks >= 210 && totalMarks <= 239)
                return "B";
            else if(totalMarks >= 180 && totalMarks <= 209)
                return "C";
            else
                return "F";
        //return null;
    }

    public String calculateGradeCredit4(String Marks){
        double totalMarks;
        try {
            totalMarks = Double.parseDouble(Marks);
        }catch (NumberFormatException e){
            return "Not a number.";
        }

        if(totalMarks < 0)
            return "Invalid Input.";
        totalMarks = Math.ceil(totalMarks);
        if(totalMarks > 400 || totalMarks < 0)
            return "Invalid Input.";
        else if(totalMarks >= 320)
            return "A";
        else if(totalMarks >= 280 && totalMarks <= 319)
            return "B";
        else if(totalMarks >= 240 && totalMarks <= 279)
            return "C";
        else
            return "F";
    }
}
