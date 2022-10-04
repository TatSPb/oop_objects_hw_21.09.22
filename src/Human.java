public class Human {
    String name;
    int age;
    int yearOfBirth;
    String cityOfResidence;
    String job;

    Human(String name, int yearOfBirth, String cityOfResidence) {
        this.name = name;
        this.cityOfResidence = cityOfResidence;
        this.yearOfBirth = yearOfBirth;
        this.job  = "default";
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + cityOfResidence + ". Я родился в " + yearOfBirth + " году. Будем знакомы!");
    }

    Human(String name, int yearOfBirth, String cityOfResidence, String job) {
        this.name = name;
        this.cityOfResidence = cityOfResidence;
        this.yearOfBirth = yearOfBirth;
        this.job = job;
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + cityOfResidence + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }
}

