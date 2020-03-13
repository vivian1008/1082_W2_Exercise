public class EX1{
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.setName("Molly");
        hero1.setPower("Water");
        hero1.setGender("female");
        hero1.setEthnicity("Human");
        hero1.setType("balanced");

        System.out.println("Name:"+hero1.getName());
        System.out.println("Power:"+hero1.getPower());
        System.out.println("Gender:"+hero1.getGender());
        System.out.println("Ethnicity:"+hero1.getEthnicity());
        System.out.println("Type:"+hero1.getType());
        System.out.println();

        Hero hero2 = new Hero();
        hero2.setName("Jack");
        hero2.setPower("Light");
        hero2.setGender("Male");
        hero2.setEthnicity("Demom");
        hero2.setType("offensive");

        System.out.println("Name:"+hero2.getName());
        System.out.println("Power:"+hero2.getPower());
        System.out.println("Gender:"+hero2.getGender());
        System.out.println("Ethnicity:"+hero2.getEthnicity());
        System.out.println("Type:"+hero2.getType());
        System.out.println();

        Hero hero3 = new Hero();
        hero3.setName("Athena");
        hero3.setPower("air");
        hero3.setGender("Female");
        hero3.setEthnicity("Protoss");
        hero3.setType("balanced");

        System.out.println("Name:"+hero3.getName());
        System.out.println("Power:"+hero3.getPower());
        System.out.println("Gender:"+hero3.getGender());
        System.out.println("Ethnicity:"+hero3.getEthnicity());
        System.out.println("Type:"+hero3.getType());
        System.out.println();
    }
}