#include <iostream>
#include <string>
#include <vector>
#include "Order.h"
using namespace std;

class ItemMenu {
private:
    string name;
    float price;
public:

    void setName(string itemName){
        name = itemName;
    }
    string getName(){
        return name;
    }

    void setPrice(float itemPrice){
        price = itemPrice;
    }
    float getPrice(){
        return price;
    }
};

int main() {

    cout << "-------------------------------\n"
            "WELCOME TO PHO REAL RESTAURANT!\n"
            "-------------------------------\n\n"
            ">> Menu <<" << endl;

    // Setting food names
    ItemMenu itemMenu1;
    itemMenu1.setName("Pho: $");
    itemMenu1.setPrice(10.99);
    cout << itemMenu1.getName() << itemMenu1.getPrice() << endl;

    ItemMenu itemMenu2;
    itemMenu2.setName("Fried Rice: $");
    itemMenu2.setPrice(9.99);
    cout << itemMenu2.getName() << itemMenu2.getPrice() << endl;

    ItemMenu itemMenu3;
    itemMenu3.setName("Chow Mein: $");
    itemMenu3.setPrice(13.99);
    cout << itemMenu3.getName() << itemMenu3.getPrice() << endl;


    return 0;
}
