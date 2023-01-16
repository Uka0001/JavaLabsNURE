package lab5;

public class Payment {

    public static void main(String[] args) {
        Goods [] bucket = {
                new Goods(2, "phone", 1),
                new Goods(5, "table", 2),
                new Goods(7, "box", 1)
        };
        getPayment(bucket);
    }

    private static void getPayment(Goods[] bucket) {
        int result = 0;
        for (Goods payment: bucket){
            result += payment.getPrice();
        }
        System.out.println("Your payment is: " + result);
    }

    private static class Goods {
        private int price;
        private String name;
        int count;

        public Goods(int price, String name, int count) {
            this.price = price * count;
            this.name = name;
            this.count = count;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Goods{" +
                    "price=" + price +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
