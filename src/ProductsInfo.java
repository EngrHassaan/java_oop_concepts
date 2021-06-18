public class ProductsInfo {
    int productId;
    String name;
    String type;
    int price;

    void setAttributes(int pid, String name, String type, int price) {
        this.name = name;
        this.productId = pid;
        this.type = type;
        this.price = price;
    }

    public void getAttributes() {
        System.out.println("*****************\n ProductId:\t" + productId);
        System.out.println("Product Name:\t" + name);
        System.out.println("Product Type:\t" + type);
        System.out.println("Product Price\t" + price);
    }
}

// Abstraction
abstract class TextileProduct {
    public abstract void textileData();
}

class TextileProductInfo extends TextileProduct {
    public void textileData() {
        System.out.println("I am Abstracted method abstract from other class");
    }
}

// Inheritance
class Mobile extends ProductsInfo {
    String model;
    String color;
    double weight;
    String os;
//Polymorphism
    // OverLoading
    void setAttributes(int pid, String name, String type, int price, String model, String color, double weight,
            String os) {
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.os = os;
        this.name = name;
        this.productId = pid;
        this.type = type;
        this.price = price;
    }

    // Overriding
    public void getAttributes() {
        System.out.println("*****************\n ProductId:\t" + productId);
        System.out.println("Product Name:\t" + name);
        System.out.println("Product Type:\t" + type);
        System.out.println("Product Price:\t" + price);
        System.out
                .println("Mobile Model:\t" + model + "\n color:\t" + color + "\n Weight:\t" + weight + "\nOS:\t" + os);
    }

    public static void main(String[] args) throws Exception {

        ProductsInfo Product1 = new ProductsInfo();
        Product1.setAttributes(1, "LED", "Electronic", 12000);
        Product1.getAttributes();
        Mobile Iphone = new Mobile();
        Iphone.setAttributes(1, "dd", "dd", 22000);
        Iphone.setAttributes(1, "dd", "dd", 22000, "IPhone X", "Gold", 3.80, "IOS");
        Iphone.getAttributes();

        TextileProductInfo textileObject = new TextileProductInfo();
        textileObject.textileData();
    }
}
