#include <iostream>
using namespace std;

// create class
class Room
{

public:
    double length;
    double height;

    double calculate_area() {
        return length * height;
    }
};
    int main() {
        // create the object
        Room room1;

        // assign value to object created
        room1.length = 34.33;
        room1.height = 34.33;

        cout << "area of room " << room1.calculate_area() << endl;
        return 0;
    }
