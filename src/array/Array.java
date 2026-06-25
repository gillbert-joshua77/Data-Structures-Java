package array;

class Array{
    int [] array;
    int size ;
    int capacity;

    public Array(int capacity){
        array = new int[capacity];
        this.capacity = capacity;
        size = 0;
    }
    String insert(int index,int value){
        if(index < 0 || size >= capacity || index > size){
            return "Invalid index";
        }
        for(int i = this.size; i>index; i--){
            array[i] = array[i-1];
        }
        size++;
        array[index] = value;
        return "Inserted" ;
    }
    String delete(int index){
        if(index < 0 ||index >= size){
            return "Invalid index";
        }
        else {
            for(int i = index; i<size-1; i++){
                array[i] = array[i+1];
            }
        }
        size--;
        return "Deleted" ;
    }

    int find(int Value){
        for (int i = 0 ; i <= size-1; i++){
            if(array[i] == Value ){
                return i;
            }
        }
        return -1;
    }

    String update(int index,int value){
        if(index < 0 || index >= size){
            return "Invalid index";
        }
        array[index] = value;
        return "Updated" ;
    }
    void display(){
        for (int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String [] args){
        Array array1 = new Array(5);
        System.out.println(array1.insert(0,1));
        array1.display();
        System.out.println();
        System.out.println(array1.delete(0));
        array1.display();
        System.out.println(array1.insert(0,15));
        System.out.println(array1.insert(1,33));
        System.out.println(array1.insert(2,23));
        System.out.println(array1.insert(3,64));
        System.out.println(array1.insert(4,35));
        System.out.println(array1.find(64));
        array1.display();
        array1.update(0,10);
        array1.display();

    }
}