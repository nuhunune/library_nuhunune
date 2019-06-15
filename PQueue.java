class MyQueue<T> extends PQueue {

    @Override
    long get(Object obj) {
        String t = (String) obj;
        return t.length();
    }

    public MyQueue(int size) {
        nums = (T[]) new Object[size];
    }
}

abstract class PQueue<T> {

    abstract long get(T obj);
    T[] nums;
    int length = 0;

    void add(T obj) {
        nums[length] = obj;
        int current = length;
        length++;
        T tmp;
        while (get(nums[current]) < get(nums[(current - 1) / 2])) {
            tmp = nums[current];
            nums[current] = nums[(current - 1) / 2];
            nums[(current - 1) / 2] = tmp;
            current = (current - 1) / 2;
        }
    }

    T peek() {
        return nums[0];
    }

    T poll() {
        T tmp1 = nums[0];
        nums[0] = nums[length - 1];
        nums[length - 1] = null;
        int current = 0;
        T tmp2;
        while (true) {
            try {
                if (get(nums[current]) > get(nums[current * 2 + 1]) && (nums[current * 2 + 2] == null || get(nums[current * 2 + 1]) < get(nums[current * 2 + 2]))) {
                    tmp2 = nums[current];
                    nums[current] = nums[current * 2 + 1];
                    nums[current * 2 + 1] = tmp2;
                    current = current * 2 + 1;
                } else if (get(nums[current]) > get(nums[current * 2 + 2])) {
                    tmp2 = nums[current];
                    nums[current] = nums[current * 2 + 2];
                    nums[current * 2 + 2] = tmp2;
                    current = current * 2 + 2;
                } else {
                    break;
                }
            } catch (Exception e) {
                break;
            }

        }
        length--;
        return tmp1;
    }

    void remove() {
        poll();
    }
    int size(){
        return length;
    }
}
