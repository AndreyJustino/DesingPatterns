package criacao;

public class FactoryMethod {

    public static abstract class Person{

        public String name;
        public String gender;

    }

    public static class Man extends Person{

        public Man(String name){
            this.name = name;
            System.out.println("Hello sir " + name);
        }

    }

    public static class Woman extends Person{

        public Woman(String name){
            this.name = name;
            System.out.println("Hello madam " + name);
        }

    }

    public class FactoryPerson{
        public static Person getPerson(String name, String gender){

            if (gender.equals("M")){
                return new Man(name);
            }

            if (gender.equals("F")){
                return new Woman(name);
            }

            return null;
        }

    }


    public static void main(String[] args) {
        FactoryPerson.getPerson("Andrey", "M");
        FactoryPerson.getPerson("Ana", "F");
    }
}
