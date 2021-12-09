package base;

public interface Visitors {

    double costWithVisitors(int visitors, double cost);

    double costWithChildren(int children, double cost);

    double costWithPets(int pets, double cost);
}
