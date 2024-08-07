#include <iostream>
#include <string>

using namespace std;

class Stack
{
private:
    static const int MAX = 101;
    int values[MAX];
    int top = 0;
public:
    Stack(){

    };
    bool isEmpty(){
        return top == 0;
    }
    bool isFull(){
        return top >= MAX - 1;
    }
    void push(int value){
        if (isFull()) {
            cout << "This stack is full" << endl;
            return;
        }
        top++;
        values[top] = value;
    }
    int pop() {
        if (isEmpty()){
            cout << "This stack is empty" << endl;
            return -1;
        }
        top--;
        return values[top+1];
    }
};

int main() {
    string input;
    int a, b;
    Stack s;

    while(cin >> input) {
        if (input[0] == '+') {
            b = s.pop();
            a = s.pop();
            s.push(a+b);
            continue;
        }
        if (input[0] == '-') {
            b = s.pop();
            a = s.pop();
            s.push(a - b);
            continue;
        }
        if (input[0] == '*') {
            b = s.pop();
            a = s.pop();
            s.push(a*b);
            continue;
        }
        s.push(stoi(input));
    }

    cout << s.pop() << endl;
    
    return 0;
}