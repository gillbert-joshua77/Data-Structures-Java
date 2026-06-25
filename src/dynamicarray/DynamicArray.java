class DynamicArray {
    int[] array;
    int size;
    int capacity;

    public DynamicArray(int capacity) {
        this.array = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    String insert(int index, int value) {
        if (index < 0 || index > size) {
            return "Invalid index";
        }

        if (size >= capacity) {
            resize();
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = value;
        size++;
        return "Inserted";
    }

    String delete(int index) {
        if (index < 0 || index >= size) {
            return "Invalid index";
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
        array[size] = 0;

        return "Deleted";
    }

    int find(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    String update(int index, int value) {
        if (index < 0 || index >= size) {
            return "Invalid index";
        }

        array[index] = value;
        return "Updated";
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void resize() {
        if (capacity == 0) {
            capacity = 1;
        } else {
            capacity = capacity * 2;
        }

        int[] newArray = new int[capacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    public static void main(String[] args) {
        DynamicArray array1 = new DynamicArray(5);

        System.out.println(array1.insert(0, 15));
        System.out.println(array1.insert(1, 33));
        System.out.println(array1.insert(2, 23));
        System.out.println(array1.insert(3, 64));
        System.out.println(array1.insert(4, 35));

        array1.display();

        System.out.println(array1.insert(5, 99));
        array1.display();

        System.out.println(array1.delete(2));
        array1.display();

        System.out.println(array1.find(64));

        System.out.println(array1.update(0, 10));
        array1.display();
    }
}