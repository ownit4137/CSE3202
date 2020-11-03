package midterm;

public class varArg_09 {

    static int sum(int ...numbers){
        int res = 0;
        for (int i : numbers){
            res += i;
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,5,3));
    }
}
