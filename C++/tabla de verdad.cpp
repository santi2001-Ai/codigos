#include <iostream>

using namespace std;

int main() {
    bool a = true;
    bool b = false;

    cout << (a && b) << endl; // Imprime 0 (false)

    int a_val = 2, b_val = 3, c = 4, d = 10;

    cout << ((a_val == b_val) && (c < d)) << endl; // Imprime 0 (false)
    cout << (!(a_val == b_val) && (c > d)) << endl; // Imprime 0 (false)

    return 0;
}
