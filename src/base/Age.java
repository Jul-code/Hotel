package base;

public interface Age {

    double costIncludingChild(int child, double price);
    double costIncludingChild(double paymentForChildren, double discount);
}
