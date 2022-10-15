package ComparatorDemo;

public class Person {

    package comparablesdemo;

    public class Person {
        private int id;
        private String name;
        private int age;

        public Person(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public long getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
/*
if the person object is greater than the parameter/argument then return a Positive number 1

if the person object is less than the param object return a negative number

else if they are equal return 0
 */
//    @Override
//    public int compareTo(Person person) {
//        if(this.age > person.age){
//            return 1;
//        }else if(this.age < person.age){
//            return -1;
//        }else{
//            return 0;
//        }
//
//    }





    }
}
