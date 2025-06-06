package methodreference;


    public class Employee {
        private String name;

        public Employee() {
            this.name = "Default";
        }

        public Employee(String name) {
            this.name = name;
        }

        public void display() {
            System.out.println("Employee Name: " + name);
        }

        public String getName() {
            return name;
        }
    }


