#include <iostream>
using namespace std;

#define MAX 10

class Queue{
    public:
        Queue(){
            front = rear = -1;
        }

        void enQueue(int item){
            if(rear == MAX - 1){
                cout << "Queue Overflow" << endl;
            }
            else if(front == -1 && rear == -1){
                front = rear = 0;
                arr[rear] = item;
                cout << "Item Inserted: " << item << endl;
            }
            else{
                rear++;
                arr[rear] = item;
                cout << "Item Inserted: " << item << endl;
            }
        }

        void deQueue(){
            int item;
            if(rear == -1){
                cout << "Queue Underflow." << endl;
            }
            else{
                item = arr[front];
                if(front == rear){
                    front = rear = -1;
                }
                else{
                    front++;
                }
                cout << "Item Deleted: " << item << endl;
            }
        }
    private:
        int front, rear;
        int arr[MAX];

};

int main(){
    Queue q;
    q.enQueue(1);
    q.enQueue(2);
    q.enQueue(3);
    q.deQueue();
    q.deQueue();
    q.deQueue();
    q.deQueue();

    return 0;
}