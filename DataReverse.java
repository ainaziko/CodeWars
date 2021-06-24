import java.util.ArrayList;
import java.util.Collections;
import static java.util.stream.IntStream.range;

public class DataReverse {
    public static int[] DataReverse(int[] data) {
        StringBuilder sb = new StringBuilder();
        for(int i : data){
            sb.append(i);
        }
        System.out.println(sb);
        ArrayList<String> arr = new ArrayList<>();

        for(int i = 0; i < sb.length(); i += 8){
            int start = i;
            if(i + 8 > sb.length()) break;
            int stop = i + 8;
            arr.add(sb.toString().substring(start, stop));
        }
        Collections.reverse(arr);
        ArrayList<Integer> dataArr = new ArrayList<>();
        for(String el : arr){
            for(char ch : el.toCharArray()){
                dataArr.add(Integer.parseInt(ch + ""));
            }
        }

        int[] array = new int[dataArr.size()];
        for(int i = 0; i < array.length; i++){
            array[i] = dataArr.get(i);
        }

        return array;
    }

    public static int[] DataReverseBestPractice(int[] data) {
        int bytes[] = new int[data.length];
        for (int i = data.length-8, j=0; i>=0; i-=8, j+=8) {
            System.arraycopy(data, i, bytes, j, 8);
        }
        return bytes;
    }

    static int[] DataReverseBestPractice2(int[] data) {
        return range(0, data.length).map(i -> data[data.length + 2 * (i % 8) - i - 8]).toArray();
    }

    public static int[] DataReverse3(int[] data) {
        return java.util.stream.IntStream.range(0, data.length)
                .map(i -> data[data.length - 8 - (i / 8 * 8) + (i % 8)])
                .toArray();
    }
}
