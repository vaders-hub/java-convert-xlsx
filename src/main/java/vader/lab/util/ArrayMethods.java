package vader.lab.util;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ArrayMethods {
    public static String[] Add(String[] originArray, String Val) {
        List<String> newList = new ArrayList<>(Arrays.asList(originArray));
        newList.add(Val);

        return newList.toArray(new String[0]);
    }
}
