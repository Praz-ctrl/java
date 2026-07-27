class MobilePhone {
    String brand;
    String model;
    double price;

    // Default Constructor
    MobilePhone() {
        brand = "Samsung";
        model = "Galaxy A15";
        price = 20000;
    }

    // Parameterized Constructor
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Copy Constructor
    MobilePhone(MobilePhone m) {
        brand = m.brand;
        model = m.model;
        price = m.price;
    }

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : ₹" + price);
    }

    public static void main(String[] args) {

        MobilePhone m1 = new MobilePhone();

        MobilePhone m2 = new MobilePhone("Apple", "iPhone 16", 89999);

        MobilePhone m3 = new MobilePhone(m2);

        System.out.println("Default Constructor:");
        m1.display();

        System.out.println("\nParameterized Constructor:");
        m2.display();

        System.out.println("\nCopy Constructor:");
        m3.display();
    }
}